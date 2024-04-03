package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;


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
	@PutMapping("put/{id}")
	public ResponseEntity<User> putMethod(@PathVariable long id , @RequestBody User editUser) {
		Optional<User> existingUser = user.findById(id);
		if(existingUser.isPresent()) {
			User val = existingUser.get();
			val.setMark(editUser.getMark());
			user.save(val);
			return new ResponseEntity<>(val , HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
