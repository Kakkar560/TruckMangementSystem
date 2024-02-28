package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.LoginDao;
import com.dxc.entity.User;

@Service
public class LoginService {

	@Autowired 
	private LoginDao loginDao;

	public List<User> login(String username, String password) {
		return loginDao.findUser(username, password);
	}

}
