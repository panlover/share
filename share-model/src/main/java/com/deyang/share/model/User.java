package com.deyang.share.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-2-7
 * Time: 上午9:30
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private Long id;
    @NotNull(message = "not nulll")
    private String username;
    @Size(min = 6,max = 12,message = "password must large than 6 characters")
    private String password;
    private String email;
    private String gender;    //Male,Female(M,F)
    private int age;
    private String emailStatus;//active,inactive
    private String status;   //usable,unusable

    @Override
    public String toString() {
        return "UserID:"+id+";UserName:"+username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
