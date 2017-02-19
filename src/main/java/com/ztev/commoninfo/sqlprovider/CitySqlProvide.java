package com.ztev.commoninfo.sqlprovider;

import org.apache.ibatis.jdbc.SQL;


public class CitySqlProvide {

	public String findByState(String state) {
		
		return new SQL() {{
			this.SELECT("*").FROM("city").WHERE("state = #{state}");
		}}.toString();
	}
}
