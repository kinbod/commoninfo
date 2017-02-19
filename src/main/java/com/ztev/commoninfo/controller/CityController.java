package com.ztev.commoninfo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.ztev.commoninfo.domain.City;
import com.ztev.commoninfo.domain.UserTest;
import com.ztev.commoninfo.service.CityService;
import com.ztev.commoninfo.service.UserTestService;

@RestController
public class CityController {

	@Autowired
	private CityService cityService;
	
	@Autowired
	private UserTestService userService;
	
	@RequestMapping("/city/getCity")
	public List<City> getCity() {
		PageHelper.startPage(1, 3);
		return this.cityService.findByState("asion");
	}
	
	@RequestMapping("/user/getUsers")
	public List<UserTest> getAllUsers() {
		PageHelper.startPage(1, 3);
		return this.userService.getAllUsers();
	}
	
	@RequestMapping("/user/getUsersByNames")
	public List<UserTest> getUsersByNames() {
		List<String> names = Arrays.asList("dai","bbc");
		return this.userService.getUsersByNames(names);
	}
	
	@RequestMapping("/user/getUserByName")
	public UserTest getUserByName() {
		return this.userService.getUserByName("dai");
	}
}
