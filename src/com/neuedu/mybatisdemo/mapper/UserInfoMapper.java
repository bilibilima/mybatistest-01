package com.neuedu.mybatisdemo.mapper;

import java.util.List;

import com.neuedu.mybatisdemo.bean.UserInfo;

/**
 * mybatis���ʱ���������һ�����ݿ�����ӿڣ����ڶ������ݿ����
 */

public interface UserInfoMapper {
	//��ѯ����
	public List<UserInfo> findAll();
	
	//��ѯͳ��
	public int findTotal();
	
	//������ѯ
	public List<UserInfo> findSth(String name);
	
	public List<UserInfo> findId(int id);
}
