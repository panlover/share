package com.deyang.share.model;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-2-7
 * Time: 上午9:37
 * To change this template use File | Settings | File Templates.
 */
public class Category {
    private Long id;
    private String name;
    private String shortDesc;
    private String introduction;

    @Override
    public String toString() {
        return "CategoryID:"+id+";Name:"+name;
    }

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
}
