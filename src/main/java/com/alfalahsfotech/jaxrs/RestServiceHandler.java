package com.alfalahsfotech.jaxrs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationPath("/rest")
public class RestServiceHandler extends Application {
@Override
 public Set<Class<?>> getClasses(){
	 System.out.println("Registring Rest Services Classes");
	 Set<Class<?>> classSet = new HashSet<>();
	 classSet.add(HttpMethodHandler.class);
	 return classSet;
 }
}
