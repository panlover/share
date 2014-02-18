package com.deyang.share.controller;

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
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-17
 * Time: 上午9:36
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private ArticleService articleService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "{username}",method = RequestMethod.GET)
    public ModelAndView getUser(@PathVariable String username,HttpServletRequest request){
    	ModelAndView model=new ModelAndView();
        User user=userService.getUserByUserName(username);
        model.addObject("user",user);
        model.addObject("articles",user!=null?user.getArticles():null);
        model.addObject("comments",user!=null?user.getComments():null);
        model.setViewName("page/user/index");
        return model;
    }


    /**
     * 添加用户
     * @Description:
     * @author:yudeyang25#gmail.com
     * @date:2013-11-17 下午4:23:52
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user){
        userService.addUser(user);
        return "redirect:/index";
    }
    
    /**
     * 列出用户
     * @Description:
     * @author:yudeyang25#gmail.com
     * @date:2013-11-18 下午7:43:41
     * @param request
     * @return
     */
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView listUser(HttpServletRequest request){
    	ModelAndView model=new ModelAndView();
    	List<User> userList=userService.getUserList(0,20);
    	model.addObject("userList", userList);
    	model.setViewName("page/user/list");
    	return model;
    }
    
    /**
     * 获取用户的所有文章
     * @Description:
     * @author:yudeyang25#gmail.com
     * @date:2013-11-18 下午7:44:03
     * @param id
     * @return
     */
    @RequestMapping(value="{id}/articles",method=RequestMethod.GET)
    public ModelAndView getUserArticles(@PathVariable Long id){
    	ModelAndView model=new ModelAndView();
        User user=userService.getUserById(id);
        Set<Article> articles=new TreeSet<Article>();
        articles=user.getArticles();
    	model.addObject("articles", articles);
    	model.setViewName("page/article/index");
    	return model;
    } 
    
    /**
     * 根据用户ID删除用户
     * @Description:
     * @author:yudeyang25#gmail.com
     * @date:2013-11-18 下午10:39:01
     * @param id
     * @return
     */
    public String deleteUserById(Long id){ 
    	userService.deleteUserById(id);
    	return "rediect:/user";
    }
}
