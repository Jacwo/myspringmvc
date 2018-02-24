package com.flashhold.controller;

import com.flashhold.annotation.Controller;
import com.flashhold.annotation.Qualifier;
import com.flashhold.annotation.RequestMapping;
import com.flashhold.service.UserService;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
	@Qualifier("userServiceImpl")
	private UserService userService;
	@RequestMapping("/insert")
	public void insert(){
		userService.insert();
	}
}
