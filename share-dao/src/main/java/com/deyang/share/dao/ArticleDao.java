package com.deyang.share.dao;

import java.util.List;

import com.deyang.share.SortType;
import com.deyang.share.domain.Article;

public interface ArticleDao {

	public void saveArticle(Article article);  
	
	public void updateArticle(Article article);
	
	public Article getArticleById(Long id);
	
	public List<Article> getArticleList(String hql);
	
	public List<Article> getArticleListByUserId(Long id, int firstRecord, int maxRecords);

    /**
     * 根据ID和排列顺序获取下一个Article信息
     * @param articleId
     * @param asc
     * @return
     */
    public Article getNextArticleById(Long articleId, SortType asc);
}
