package com.ztev.commoninfo.resource;

import java.util.List;

import com.ztev.commoninfo.domain.City;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The domain model class
 * 
 * @author carl.quan
 *
 */
@ApiModel(description = "Hello 类")
public class HelloResource {

	@ApiModelProperty(value = "消息", required = true)
    private String id;
	@ApiModelProperty(value = "名称", required = true)
	private String name;
	@ApiModelProperty(value = "城市信息", required = true)
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