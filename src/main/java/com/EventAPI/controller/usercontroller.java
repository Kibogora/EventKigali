package com.EventAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EventAPI.model.UserAccount;
import com.EventAPI.service.saveDataApi;

@RestController
@RequestMapping("/user")
public class usercontroller {

	@Autowired
	public  saveDataApi savedApi;
	
	@RequestMapping("/usersdata/{uname}/{email}/{password}/{retype_password}")
	public String saveuser(@PathVariable("uname")  String uname,@PathVariable("email")  String email,@PathVariable("password")  String password,@PathVariable("retype_password")  String retype_password) {
		UserAccount userdetails=new UserAccount();
		userdetails.setEmail(email);
		userdetails.setUser_name(uname);
		userdetails.setPassword(password);
		userdetails.setRetype_password(retype_password);
		savedApi.createUser(userdetails);
		return "data received";
		
	}
	
}
