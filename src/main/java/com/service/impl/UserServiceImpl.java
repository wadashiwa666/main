package com.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.service.IUserService;
import com.vo.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getAllUsers() {
		System.out.println("userMapper:====>" + userMapper);
		return userMapper.getAllUsers();
	}

	@Override
	public int insert(User user) {
		int max = userMapper.getMaxId(null);
		user.setId(max+1);
		userMapper.insert(user);
		int s = 1/0;
		return 0;
	}

}
