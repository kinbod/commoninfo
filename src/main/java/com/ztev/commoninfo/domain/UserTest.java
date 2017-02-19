package com.ztev.commoninfo.domain;

import java.io.Serializable;
import java.util.List;

public class UserTest implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6075844282964984795L;

	private String id;
	
	private String name;

	private List<City> cities;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}
