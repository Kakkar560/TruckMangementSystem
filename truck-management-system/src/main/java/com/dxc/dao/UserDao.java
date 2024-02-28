package com.dxc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dxc.entity.User;

@Repository
public class UserDao {

	@Autowired
	private SessionFactory factory;

	public void saveUser(User manager) {
		Session session = factory.openSession();
		session.save(manager);
	}

}
