package com.wang.demo.service.impl;

import java.util.Date;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.wang.demo.service.MySer;

@WebService
public class MySerImpl implements MySer {

	private static final Logger logger = LoggerFactory.getLogger(MySerImpl.class);
	
	@Override
	public String sayHello(String name) {
		String said = name+"hello";
		logger.info(said);
		return said;
	}

}
