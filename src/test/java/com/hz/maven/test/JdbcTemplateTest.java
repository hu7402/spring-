package com.hz.maven.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hz.maven.dao.IRoleDao;
import com.hz.maven.pojo.po.Role;
import com.hz.maven.service.IUservice;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-jdbc-test.xml"})
public class JdbcTemplateTest {
	@Autowired
	public IRoleDao idao;
	
	@Test
	public void test1(){
		/*uservice.save();*/
		Role role=new Role(5,"李勇","男");
		idao.save(role);
	}
}
