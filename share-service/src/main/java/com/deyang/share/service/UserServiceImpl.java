package com.deyang.share.service;

import java.util.List;

import com.deyang.share.dao.UserDao;
import com.deyang.share.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-17
 * Time: 上午11:10
 * To change this template use File | Settings | File Templates.
 */
@Service("userService") 
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

	@Override
	public User getUserByNameAndPassword(String username, String password) {
		User user=userDao.getUserByNameAndPassword(username,password);
		return user;
	}

	@Override
	public User getUserById(Long id) {
		User user=userDao.getUserById(id);
		return user;
	}

	@Override
	public List<User> getUserList(int first, int listSize) {
		List<User> users=userDao.getUserList(first,listSize);
		return users;
	}

	@Override
	public void deleteUserById(Long id) {

		userDao.deleteUserById(id);
	}

    @Override
    public User getUserByUserName(String username) {
        return userDao.getUserByUserName(username);
    }

}
