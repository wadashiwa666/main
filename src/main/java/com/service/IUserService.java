package com.service;

import java.util.List;

import com.vo.User;

public interface IUserService {
	List<User> getAllUsers();
	
	int insert(User user);
}
