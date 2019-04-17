package com.neuedu.mybatisdemo.mapper;

import java.util.List;

import com.neuedu.mybatisdemo.bean.UserInfo;

/**
 * mybatis编程时，可以设计一个数据库操作接口，用于定义数据库操作
 */

public interface UserInfoMapper {
	//查询所有
	public List<UserInfo> findAll();
	
	//查询统计
	public int findTotal();
	
	//条件查询
	public List<UserInfo> findSth(String name);
	
	public List<UserInfo> findId(int id);
}
