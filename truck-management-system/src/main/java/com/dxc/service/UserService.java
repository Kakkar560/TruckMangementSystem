package com.dxc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.UserDao;
import com.dxc.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public String save(User manager) {
		// For manager
		manager.setRole(1);
		userDao.saveUser(manager);
		return "";
	}

}
