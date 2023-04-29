package com.example.Movies.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movies.Model.UserDetails;
import com.example.Movies.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository ur;
	
	public List<UserDetails> getUserDetail()
	{
		return ur.findAll();
	}

	public UserDetails saveUserDetail(UserDetails u)
	{
		return ur.save(u);
	}
}

