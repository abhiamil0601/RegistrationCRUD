package org.greysalman.service;

import java.util.List;

import org.greysalman.model.User;

public interface UserService {

	public void create(User user);
	public void update(User user);
	public User edit(int userId);
	public void delete (int userId);
	public User find(int userId);
	public List<User> getAll();
	
}
