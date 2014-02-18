package com.deyang.share.service;

import java.util.List;

import com.deyang.share.domain.Article;

public interface ArticleService { 
	
	/**
	 * 
	 * @Description:Save Article
	 * @author:yudeyang25#gmail.com
	 * @date:2013-11-3 上午9:50:22
	 * @param article
	 */
	public void saveArticle(Article article);
	
	/**
	 * 
	 * @Description:This does not delete corresponding Article entity,just change its status to delete.
	 * @author:yudeyang25#gmail.com
	 * @date:2013-11-3 上午9:44:48
	 * @param id
	 */
	public void deleteArticleById(Long id);
	
	/**
	 * 
	 * @Description:Update Article
	 * @author:yudeyang25#gmail.com
	 * @date:2013-11-3 上午9:52:54
	 * @param article
	 */
	public void updateArticle(Article article);
	

	/**
	 * 
	 * @Description:Get Article By Article Id
	 * @author:yudeyang25#gmail.com
	 * @date:2013-11-3 上午9:58:20
	 * @param id
	 * @return
	 */
	public Article getArticleById(Long id);

    /**
     * get all Articles
     * @return
     */
    public List<Article> getArticleList();
	
	/**
	 * 
	 * @Description:Get Article List
	 * @author:yudeyang25#gmail.com
	 * @date:2013-11-3 上午9:50:04
	 * @param hql
	 * @return
	 */
	public List<Article> getArticleList(String hql);
	
	/**
	 * 
	 * @Description:Get user's articles
	 * @author:yudeyang25#gmail.com
	 * @date:2013-11-3 上午9:47:38
	 * @param id
	 * @param firstRecord
	 * @param maxRecords
	 * @return
	 */
	public List<Article> getArticleListByUserId(Long id, int firstRecord, int maxRecords);

    /**
     * 获取相邻的文章信息
     * @param articleId
     * @return
     */
    public String  getArticleSiblingInfo(Long articleId);
}
