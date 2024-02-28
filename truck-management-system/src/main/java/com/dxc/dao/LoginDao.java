package com.dxc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dxc.entity.User;

@Repository
public class LoginDao {

	@Autowired
	private SessionFactory factory;

	public List<User> findUser(String username, String password) {
		Session session = factory.openSession();
		Query query = session
				.createQuery("SELECT u FROM User u where u.username = :uname and u.password = :pass");
		query.setParameter("uname", username);
		query.setParameter("pass", password);

		return query.list();
	}

}
