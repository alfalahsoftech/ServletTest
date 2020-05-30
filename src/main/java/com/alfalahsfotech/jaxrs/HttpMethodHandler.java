package com.alfalahsfotech.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
//rest/httpMethod/gMethod
@Path("/HttpMethodHandler")
public class HttpMethodHandler {

	@Path("/gMethod")
	@GET
	public String getMethod() {
		System.out.println("dddddddddddddddddddddddddddddddddddddddddddd");
		return "Get method called";
	}
}
