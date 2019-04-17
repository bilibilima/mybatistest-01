package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neuedu.mybatisdemo.bean.UserInfo;
import com.neuedu.mybatisdemo.mapper.UserInfoMapper;

public class TestMybatisUserInfo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		//1������mybatis��ѯ��������
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		
		
		//2��ͨ����ѯ�����õ����ݲ�ѯ�ӿ�ʵ��
		UserInfoMapper mapper = sqlSessionFactory.openSession().getMapper(UserInfoMapper.class);
		
		System.out.println("====================1===================");
		//3.ͨ���ӿ�ʵ����ѯ����
		List<UserInfo> list = mapper.findAll();
		
		
		//4.ʹ�ò�ѯ��������
		for(UserInfo user :list){
			System.out.println(user.getName());
		}		
		System.out.println("====================2===================");
		
		
		int count = mapper.findTotal();
		System.out.println("�ܼ�¼����"+count);
		
		System.out.println("====================3===================");	
		
		//��������������
		List<UserInfo> sthlist = mapper.findSth("%x%");
		for (UserInfo user :sthlist){
			System.out.println(sthlist.size());
			System.out.println(user.getName());
		}
		
		System.out.println("====================4===================");	
		//��������������
		List<UserInfo> idlist = mapper.findId(1);
		for (UserInfo user :idlist){
			System.out.println(idlist.size());
			System.out.println(user.getName());
		}
		
	}

}
