package com.deyang.share.service;

import java.util.List;

import com.deyang.share.domain.User;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-17
 * Time: 上午10:13
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
	
    public void addUser(User user);
    
	public User getUserByNameAndPassword(String username, String password);

	public User getUserById(Long id);

	public List<User> getUserList(int first, int listSize);

	public void deleteUserById(Long id);

    public User getUserByUserName(String username);
}
