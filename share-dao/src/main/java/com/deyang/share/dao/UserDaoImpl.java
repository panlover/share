package com.deyang.share.dao;

import java.util.List;

import com.deyang.share.common.dao.BaseDao;
import com.deyang.share.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
	private BaseDao baseDao;
	
	public BaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void addUser(User user) {
        baseDao.save(user);
	}

	@Override
	public void deleteUser(User user) {
		baseDao.delete(user);
	}

	@Override
	public void deleteUserById(Long id) {
		baseDao.delete(User.class,id);
	}

	@Override
	public List<User> getAllUser() {
		return (List<User>)baseDao.find("from User");
	}

	@Override
	public User getUserById(Long id) {
		return baseDao.get(User.class,id);
	}

	@Override
	public void updateUser(User user) {
        baseDao.update(user);
	}

	@Override
	public User getUserByNameAndPassword(String username, String password) {
		User user=null;
		String hql="from User u where u.username=? and u.password=?";
		List<User> users= (List<User>) baseDao.find(hql,username,password);
		if (users !=null) {
			user=users.get(0);
		}
		return user;
	}

    @Override
    public List<User> getUserList(int first, int listSize) {
       List<User> userList= (List<User>) baseDao.find("from User",first,listSize);
        return userList;
    }

    @Override
    public User getUserByUserName(String username) {
        User user=null;
        List<User> userList= (List<User>) baseDao.find("from User u where u.username=?",username);
        if (userList != null) {
            user=userList.get(0);
        }
        return user;
    }
}
