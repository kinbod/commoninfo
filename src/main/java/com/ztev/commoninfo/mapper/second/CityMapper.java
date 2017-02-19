package com.ztev.commoninfo.mapper.second;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import com.ztev.commoninfo.domain.City;
import com.ztev.commoninfo.sqlprovider.CitySqlProvide;

public interface CityMapper {

	@SelectProvider(type = CitySqlProvide.class, method = "findByState")
	List<City> findByState(@Param("state") String state);
}
