package com.hz.maven.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.hz.maven.dao.IRoleDao;
import com.hz.maven.pojo.po.Role;

public class IRoleDaoImpl extends JdbcDaoSupport implements IRoleDao{
	public int save(Role role){
		int i=0;
		try {
			String sql="insert into role values(?,?,?)";
			getJdbcTemplate().update(sql, new Object[]{role.getId(),role.getName(),role.getSex()});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
		
	}
}
