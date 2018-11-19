package com.wang.demo.service.impl;

import javax.jws.WebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebService
public class MySerImpl {

	private static final Logger logger = LoggerFactory.getLogger(MySerImpl.class);
	
	public String sayHello(String name) {
		String said = name+"hello";
		logger.info(said);
		return said;
	}

}
