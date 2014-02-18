package com.deyang.share.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: yudeyang
 * Date: 13-11-24
 * Time: 上午9:19
 * To change this template use File | Settings | File Templates.
 */
@Table
@Entity
public class Comment implements Comparable {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="articleid")
    private Article article;
    @ManyToOne
    @JoinColumn(name="userid")
    private User user;
    @Column
    private String content;
    @Column
    private Timestamp publishTime;
    @Column
    private String vaild;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }

    public String getVaild() {
        return vaild;
    }

    public void setVaild(String vaild) {
        this.vaild = vaild;
    }

    @Override
    public int compareTo(Object object) {
        Comment comment=(Comment)object;
        return this.id.compareTo(comment.getId());
    }
}
