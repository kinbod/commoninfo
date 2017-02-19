package com.ztev.commoninfo.service;

import com.google.gson.Gson;
import com.ztev.commoninfo.domain.City;

//@Component
public class Receiver {

	public void process(String hello) {
		System.out.println("receiver:" + hello);
	}
	
	//@RabbitListener(queues = "hello")
	public void process(City city) {
		System.out.println("city.name===[" + city.getCountry() + "]");
		System.out.println(new Gson().toJson(city));
	}
}
