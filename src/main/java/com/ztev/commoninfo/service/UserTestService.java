package com.ztev.commoninfo.service;

import java.util.List;

import com.ztev.commoninfo.domain.UserTest;

public interface UserTestService {

	List<UserTest> getAllUsers();
	List<UserTest> getUsersByNames(List<String> list);
	UserTest getUserByName(String name);
}
