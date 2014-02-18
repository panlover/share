package com.deyang.share.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.deyang.share.SortType;
import com.deyang.share.common.util.JsonUtil;
import org.springframework.stereotype.Service;

import com.deyang.share.dao.ArticleDao;
import com.deyang.share.domain.Article;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	
	@Resource
	private ArticleDao articleDao;

	public ArticleDao getArticleDao() {
		return articleDao;
	}

    @Override
    public String getArticleSiblingInfo(Long articleId) {
        Article previous=articleDao.getNextArticleById(articleId, SortType.ASC);
        Article next=articleDao.getNextArticleById(articleId,SortType.DESC);
        List<Article> articles=new ArrayList<Article>();
        if (previous == null) {
            previous=new Article();
            previous.setId(new Long(0));
            previous.setTitle("没有了！");
        }
        if (next == null) {
            next=new Article();
            next.setId(new Long(0));
            next.setTitle("没有了！");
        }
        articles.add(previous);
        articles.add(next);
        return JsonUtil.getJsonFromList(articles);
    }

    public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public void saveArticle(Article article) {
		articleDao.saveArticle(article); 
	}

	@Override
	public void deleteArticleById(Long id) {
		Article article=articleDao.getArticleById(id);
		article.setStatus(0);
		articleDao.updateArticle(article);
	}

	@Override
	public List<Article> getArticleList(String hql) {
		return articleDao.getArticleList(hql);
	}
 
	@Override
	public List<Article> getArticleListByUserId(Long id, int firstRecord,
			int maxRecords) {
		return (List<Article>) articleDao.getArticleListByUserId(id,firstRecord,maxRecords);
	}

	@Override
	public void updateArticle(Article article) {
		articleDao.updateArticle(article);
	}

	@Override

	public Article getArticleById(Long id) {
		return articleDao.getArticleById(id);
	}

    @Override
    public List<Article> getArticleList() {
        return articleDao.getArticleList("from Article");
    }

}
