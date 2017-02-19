package com.ztev.commoninfo.jerseyservice;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ztev.commoninfo.domain.City;
import com.ztev.commoninfo.domain.UserTest;
import com.ztev.commoninfo.resource.HelloResource;
import com.ztev.commoninfo.service.UserTestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Component
@Path("/v1/commoninfo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "Commoninfo API - retrive all station informantion", produces = "application/json")
public class HelloEndpoint {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloEndpoint.class);
	
	@Autowired
	private UserTestService userService;

	@GET						//JAX-RS Annotation
	@Path("/{name}")	//JAX-RS Annotation
	@ApiOperation(				//Swagger Annotation
			value = "提供一个名称", 
			response = HelloResource.class)
	@ApiResponses(value = {		//Swagger Annotation
		@ApiResponse(code = 200, message = "成功", response = HelloResource.class),
	    @ApiResponse(code = 404, message = "找不到资源")
	})
	public Response sayHelloByGet(@ApiParam @PathParam("name") String name) {
		LOGGER.info("v1/hello/{} - {}", name, MediaType.APPLICATION_JSON);
		return this.constructHelloResponse(name, MediaType.APPLICATION_JSON);
	}
	
	private Response constructHelloResponse(String name, String via) {
		if ("404".equals(name)) {
			return Response.status(Status.NOT_FOUND).build();
		}
		UserTest aaa = userService.getUserByName("dai");
		City city = new City();
		city.setId(111L);
		city.setName("name-city");
		city.setState("sss");
		city.setCountry("country===");
		List<City> cities = new ArrayList<City>();
		cities.add(city);
		aaa.setCities(cities);
		return Response.status(Status.OK).entity(aaa).build();
	}
}