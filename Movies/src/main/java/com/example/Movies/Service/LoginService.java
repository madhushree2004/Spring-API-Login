package com.example.Movies.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movies.Model.Login;
import com.example.Movies.Repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepo;
	
	public Login saveUser(Login u) 
	{
		return loginRepo.save(u);
	}
	
	public String validateUser(String username, String password) 
	{
		String result="";
		Login u=loginRepo.findByUsername(username);
		if(u==null)
		{
			result="Invalid user";
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
		return result;
	}

}
