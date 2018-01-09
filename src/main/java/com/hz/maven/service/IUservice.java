package com.hz.maven.service;

import com.hz.maven.pojo.po.Role;

public interface IUservice {
	 /*void save();*/
	 void delete();
	 void update();
	 void select();
	 int  save(Role role);
}
