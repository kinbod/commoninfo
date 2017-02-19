package com.ztev.commoninfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ztev.commoninfo.domain.City;
import com.ztev.commoninfo.mapper.second.CityMapper;
import com.ztev.commoninfo.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;
	
	@Override
	@Transactional(value = "secondTxMan", readOnly = true)
	public List<City> findByState(String state) {
		return this.cityMapper.findByState(state);
	}

}
