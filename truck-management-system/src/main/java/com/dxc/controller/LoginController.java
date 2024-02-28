package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dxc.entity.User;
import com.dxc.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(path = "/alogin", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") User user, Model model) {

		// Validation
		if ("".equals(user.getUsername())) {
			model.addAttribute("msg", "Username is required.");
			return "adminlogin";
		}

		if ("".equals(user.getPassword())) {
			model.addAttribute("msg", "Password is required.");
			return "adminlogin";
		}

		List<User> users = loginService.login(user.getUsername(), user.getPassword());

		if (CollectionUtils.isEmpty(users)) {
			model.addAttribute("msg", "Invalid username or password.");
			return "adminlogin";
		} else {
			model.addAttribute("msg", "");

			// Admin = Role 0
			// Manager = Role 1
			if (0 == users.get(0).getRole()) {
				return "admindashboard";
			} else {
				return "managerboard";
			}
		}
	}
}
