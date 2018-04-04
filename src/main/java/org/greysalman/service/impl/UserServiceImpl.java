package org.greysalman.service.impl;

import java.util.List;

import org.greysalman.dao.UserDao;
import org.greysalman.model.User;
import org.greysalman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao; //reference name should be same with UserDaoImpl Repositry annotation
	@Override
	public void create(User user) {
		userDao.create(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User edit(int userId) {
		
		return userDao.edit(userId);
	}

	@Override
	public void delete(int userId) {
		
		userDao.delete(userId);
	}

	@Override
	public User find(int userId) {
		
		return userDao.find(userId);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

}
