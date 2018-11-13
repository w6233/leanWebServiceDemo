package com.wang.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MySer {

	@WebMethod
	String sayHello(String name);
}
