package com.spring.mybatis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.mybatis.service.TestService;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext xa = new ClassPathXmlApplicationContext("spring.xml");
		TestService ts = (TestService) xa.getBean("testService");
		ts.select();
	}
}
