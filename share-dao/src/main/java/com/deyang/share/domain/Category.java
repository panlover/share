package com.deyang.share.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 文章分类
 */
@Table
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String shortDesc;
    @Column
    private String introduction;

    @ManyToOne //多对一的关联
    @JoinColumn(name="pid")//这是自关联的pid列名设置
    private Category parent;

    @OneToMany(mappedBy="parent")//一对多，mappedBy="parent"表示由parent主导（即在parent端有值）
    private Set<Category> children=new HashSet<Category>();

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Article.class)
    private Set<Article> articles;
    @Column
    private String vaild;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Set<Category> getChildren() {
        return children;
    }

    public void setChildren(Set<Category> children) {
        this.children = children;
    }

    public String getVaild() {
        return vaild;
    }

    public void setVaild(String vaild) {
        this.vaild = vaild;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
}
