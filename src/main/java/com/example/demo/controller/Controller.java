package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Controller {
	@Autowired
	private  UserRepo user;
	
	@GetMapping("/")
	public List<User> getAll() {
		return user.findAll();
	}
	
	@PostMapping("/setUser")
	public User newUser(@RequestBody User newStudent) {
		
		return user.save(newStudent);
	}
	
}
