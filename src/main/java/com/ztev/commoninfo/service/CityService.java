package com.ztev.commoninfo.service;

import java.util.List;

import com.ztev.commoninfo.domain.City;

public interface CityService {

	List<City> findByState(String state);
}
