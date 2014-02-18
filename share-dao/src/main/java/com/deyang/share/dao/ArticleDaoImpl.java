package com.deyang.share.dao;

import java.util.List;

import com.deyang.share.SortType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deyang.share.common.dao.BaseDao;
import com.deyang.share.domain.Article;

@Repository("articleDao")
public class ArticleDaoImpl implements ArticleDao {

    @Autowired
    private BaseDao baseDao;

    public BaseDao getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void saveArticle(Article article) {
        baseDao.save(article);
    }

    @Override
    public List<Article> getArticleList(String hql) {
        return (List<Article>) baseDao.find(hql);
    }

    @Override
    public Article getNextArticleById(Long articleId, SortType type) {
        String order = "asc";
        if (type == SortType.DESC) {
            order = "desc";
        }
        String hql = "from Article a where a.id=? order by a.id " + order;
        return ((List<Article>) baseDao.find(hql, new Object[]{articleId})).get(0);
    }

    @Override
    public List<Article> getArticleListByUserId(Long id, int firstRecord,
                                                int maxRecords) {
        String hql = "from Article a where a.userid = ?";
        return (List<Article>) baseDao.find(hql, new Object[]{id}, firstRecord, maxRecords);
    }

    @Override
    public void updateArticle(Article article) {
        baseDao.update(article);
    }

    @Override
    public Article getArticleById(Long id) {
        return baseDao.get(Article.class, id);
    }

}
