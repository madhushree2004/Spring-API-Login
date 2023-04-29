package com.example.Movies.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movies.Model.Login;
import com.example.Movies.Service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/checkLogin")
	public String validateUser(@RequestBody Login u)
	{
		System.out.println(u.getUsername());
		return loginService.validateUser(u.getUsername(),u.getPassword());
	}
	
	@PostMapping("/adduser")
	public Login saveUser(@RequestBody Login u)
	{
		return loginService.saveUser(u);
	}
	

}
