package com.hz.maven.service.impl;

import com.hz.maven.service.IUservice;

public class UserServiceImpl implements IUservice {

	@Override
	public void save() {
		System.out.println("----------用户已保存----------");

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("----------用户已删除----------");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("----------用户已更新----------");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("----------用户已查找----------");
	}

}
