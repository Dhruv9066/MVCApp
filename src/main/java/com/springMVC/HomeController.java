package com.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springMVC.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/register")
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping(path="/createUser",method = RequestMethod.GET)
	public String registerUser(@ModelAttribute User user) {
		System.out.println("user register form" + user);
		return "register";
	}
	


}
