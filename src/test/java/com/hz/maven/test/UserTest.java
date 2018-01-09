package com.hz.maven.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hz.maven.service.IUservice;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-aop-test.xml"})
public class UserTest {
	@Autowired
	public IUservice uservice;
	
	@Test
	public void test1(){
		uservice.delete();
	}
}
