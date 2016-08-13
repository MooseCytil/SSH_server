package com.fjh.dao;

import com.fjh.model.User;

public interface UserDao {
	
	public User getUserById(int id);
	public void addUser(User user);
	
}
