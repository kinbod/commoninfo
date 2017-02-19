package com.ztev.commoninfo.sqlprovider;

import org.apache.ibatis.jdbc.SQL;

import java.util.List;

public class UserTestProvide {

	public String getAllUsers() {
		return new SQL() {{
			this.SELECT("*").FROM("user");
		}}.toString();
	}
	
	public String getUserByName(String name) {
		return new SQL() {{
			this.SELECT("*").FROM("user").WHERE("first_name = #{name}");
		}}.toString();
	}
	
	public String getUsersByNames(List<String> list){
		StringBuilder sql = new StringBuilder();
		sql.append("select * from user where first_name in (");
		list.forEach(itme ->{
			sql.append("'"+itme+"',");
		});
		sql.deleteCharAt(sql.lastIndexOf(","));
		sql.append(")");
		return sql.toString();
	}
}
