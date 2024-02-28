package com.dxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(path = {"/", "/home"})
	public String home() {
		return "home";
	}

	@RequestMapping("/aboutus")
	public String aboutUs() {
		return "aboutus";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}

	@RequestMapping("/testimonials")
	public String testimonials() {
		return "testimonials";
	}

	@RequestMapping("/service")
	public String service() {
		return "service";
	}

	@RequestMapping("/adminlogin")
	public String adminLogin() {
		return "adminlogin";
	}

	@RequestMapping("/managerlogin")
	public String managerLogin() {
		return "managerlogin";
	}
}
