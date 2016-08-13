package com.fjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@RequestMapping(value = "/home")
	public String home() {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		return "redirect:/index.jsp";
	}

}
