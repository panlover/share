package com.deyang.share.controller;

import com.deyang.share.common.util.HttpSessionUtil;
import com.deyang.share.domain.Article;
import com.deyang.share.domain.User;
import com.deyang.share.service.ArticleService;
import com.deyang.share.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public ArticleService getArticleService() {
        return articleService;
    }

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    /**
     * 获取所有文章的列表
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView listArticles(){
        ModelAndView model = new ModelAndView();
        List<Article> articles=articleService.getArticleList();
        model.addObject("articles",articles);
        model.setViewName("page/article/index");
        return model;
    }

    /**
     * 跳转到添加文章页面
     * @return
     */
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public ModelAndView saveArticlePage() {
        ModelAndView model = new ModelAndView();
        model.addObject("article", new Article());
        model.setViewName("page/article/newarticle");
        return model;
    }

    /**
     * 保存修改后的文章
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public String editArticle(@ModelAttribute Article article){
        articleService.updateArticle(article);
        return "redirect:/article";
    }

    /**
     * 保存文章
     * @param article
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String saveArticle(@ModelAttribute Article article,HttpServletRequest request) {
        ModelAndView model = new ModelAndView();
        User u= (User)HttpSessionUtil.getSessionAttributeValue(request, "user");
        Long userId=u.getId();
        User user=userService.getUserById(userId);
        article.setUser(user);
        articleService.saveArticle(article);
        return "redirect:/article";
       // return "redirect:/user/"+userContext.getUser().getUsername()+"/articles";
    }

    /**
     * 跳转到修改文章页面
     * @param articleid
     * @return
     */
    @RequestMapping(value = "{articleid}/edit",method = RequestMethod.GET)
    public ModelAndView editArticlePage(@PathVariable Long articleid){
        ModelAndView model=new ModelAndView();
        Article article=articleService.getArticleById(articleid);
        model.addObject("article",article);
        model.setViewName("page/article/editarticle");
        return model;
    }

    /**
     * 查看对应的文章内容
     * @param articleId
     * @return
     */
    @RequestMapping(value = "{articleId}",method = RequestMethod.GET)
    public ModelAndView viewArticle(@PathVariable Long articleId){
        ModelAndView model=new ModelAndView();
        Article article=articleService.getArticleById(articleId);
        User user=article.getUser();
        model.addObject("user",user);
        model.addObject("article",article);
        model.setViewName("page/article/viewarticle");
        return model;
    }

    /**
     * 返回文章的前一篇和后一篇
     * @param articleId
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "{articleId}/brothers",method = RequestMethod.GET)
    public void getPreviousAndNextArticle(@PathVariable Long articleId,HttpServletResponse response) throws IOException {
        String result=articleService.getArticleSiblingInfo(articleId);
        PrintWriter writer=response.getWriter();
        writer.write(result);
        writer.flush();
        writer.close();
    }

}
