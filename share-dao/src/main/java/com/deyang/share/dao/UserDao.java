package com.deyang.share.dao;

import java.util.List;

import com.deyang.share.domain.User;

/**
 *用户访问类
 * @author Administrator
 *
 */
public interface UserDao {
	
	/**
	 * 添加用户
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * 删除用户
	 * @param user
	 */
	public void deleteUser(User user);
	
	/**
	 *根据ID删除用户
	 * @param id
	 */
	public void deleteUserById(Long id);
	
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUser(User user);
	
	/**
	 * 根据ID获得用户
	 * @param id
	 * @return
	 */
	public User getUserById(Long id);
	
	/**
	 * 获取所有用户
	 * @return
	 */
	public List<User> getAllUser();

	public User getUserByNameAndPassword(String username, String password);


    public List<User> getUserList(int first, int listSize);

    public User getUserByUserName(String username);
}
