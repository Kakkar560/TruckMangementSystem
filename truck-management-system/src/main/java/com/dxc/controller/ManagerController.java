package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dxc.entity.User;
import com.dxc.service.UserService;

@Controller
public class ManagerController {

	@Autowired
	private UserService userService;

	@RequestMapping(path = "/manager/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("manager") User manager, Model model) {
		userService.save(manager);
		model.addAttribute("msg", "Data has been saved successfully.");
		return "managerdashboard";
	}
}
