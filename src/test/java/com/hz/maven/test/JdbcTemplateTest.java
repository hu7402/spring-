package com.hz.maven.test;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcTemplateTest {
	@Test
	public void test1()throws Throwable{
		ComboPooledDataSource dataSource=new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/day01");
        dataSource.setUser("root");
        dataSource.setPassword("123");
        JdbcTemplate  jdbc=new JdbcTemplate(dataSource);
        jdbc.update("insert into role values(?,?,?)", 3,"胡壮","男");
	}
}
