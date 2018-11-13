package com.wang.demo;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wang.demo.service.impl.MySerImpl;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
        String url = "http://localhost:8081/wsSer";
        Endpoint.publish(url,new MySerImpl());
        System.out.println("发布webService成功！");
	}
}
