package com.mhdanh.zapier.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello-world")
public class HelloworldAPI {

	@GET
	public String sayHello() {
		return "hello world";
	}
}
