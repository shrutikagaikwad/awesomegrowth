package com.awesomegrowth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.awesomegrowth.dao.UserDao;
import com.awesomegrowth.dto.User;

@RestController
public class Controller {
	
	@Autowired
	UserDao userdao;
	
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@PostMapping("/user/save")
	public @ResponseBody User saveUserDetails(@RequestBody User user) {
	  return userdao.save(user);
	}
}
