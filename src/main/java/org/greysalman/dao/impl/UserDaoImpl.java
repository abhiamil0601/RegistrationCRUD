package org.greysalman.dao.impl;

import java.util.List;

import org.greysalman.dao.UserDao;
import org.greysalman.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userDao") //marker annotation
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	@Transactional
	@Override
	public void create(User user) {
		currentSession().save(user);
	}
	@Transactional
	@Override
	public void update(User user) {
		currentSession().update(user);
	}

	public User edit(int userId) {
		return find(userId);
	}
	@Transactional
	@Override
	public void delete(int userId) {
		User user = new User();
		user.setUserId(userId);
		System.out.println("sgkh");
		currentSession().delete(user);
		
	}
	@Transactional
	@Override
	public User find(int userId) {
		
		return (User)currentSession().get(User.class, userId);
	}
	@Transactional
	@Override
	public List<User> getAll() {
		
		return currentSession().createCriteria(User.class).list();
	}

}
