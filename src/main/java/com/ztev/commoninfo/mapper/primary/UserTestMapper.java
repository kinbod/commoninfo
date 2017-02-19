package com.ztev.commoninfo.mapper.primary;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import com.ztev.commoninfo.domain.UserTest;
import com.ztev.commoninfo.sqlprovider.UserTestProvide;

public interface UserTestMapper {

	@SelectProvider(type = UserTestProvide.class, method = "getAllUsers")
	List<UserTest> getAllUsers();
	
	@SelectProvider(type = UserTestProvide.class, method = "getUsersByNames")
	List<UserTest> getUsersByNames(@Param("list")List<String> list);
	@SelectProvider(type = UserTestProvide.class, method = "getUserByName")
	UserTest getUserByName(String name);
}
