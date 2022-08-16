package com.capita.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capita.demo.dao.mapper.UserMapper;
import com.capita.demo.model.User;

@RestController
@RequestMapping("/api/user")
public class MyBatisController {

	@Autowired
	UserMapper userMapper;

	@GetMapping("/all")
	public List<User> getAllUsers() {
		return userMapper.findAll();
	}

	@PostMapping("/add")
	public String createUser(@RequestBody User user) {
		userMapper.createUser(user);
		return "User created successfully ..";
	}

	@PutMapping("/update")
	public String updateUser(@RequestBody User user) {
		userMapper.updateUser(user);
		return "User updated successfully ";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") Integer uid) {
		userMapper.deleteUser(uid);
		return "User deleted successfully ";
	}
	
}
