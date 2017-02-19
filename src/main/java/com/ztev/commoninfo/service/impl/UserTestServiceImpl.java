package com.ztev.commoninfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ztev.commoninfo.domain.UserTest;
import com.ztev.commoninfo.mapper.primary.UserTestMapper;
import com.ztev.commoninfo.service.UserTestService;

@Service
public class UserTestServiceImpl implements UserTestService {

	@Autowired
	private UserTestMapper userTestMapper;
	
	@Override
	@Transactional(value = "primaryTxMan", readOnly = true)
	public List<UserTest> getAllUsers() {
		return this.userTestMapper.getAllUsers();
	}

	@Override
	@Transactional(value = "primaryTxMan", readOnly = true)
	public List<UserTest> getUsersByNames(List<String> list) {
		// TODO Auto-generated method stub
		return this.userTestMapper.getUsersByNames(list);
	}

	@Override
	public UserTest getUserByName(String name) {
		// TODO Auto-generated method stub
		return  this.userTestMapper.getUserByName(name);
	}

}
