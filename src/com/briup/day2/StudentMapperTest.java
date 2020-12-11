package com.briup.day2;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.briup.pojo.Student;



public class StudentMapperTest {
	
	public static void main(String[] args) {
		try {
			InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ins);
			SqlSession session = sqlSessionFactory.openSession();
			
			IStudentDao studentDao = session.getMapper(IStudentDao.class);
			List<Student> stuList = studentDao.findAllStudent();
			for (Student student : stuList) {
				System.out.println(student);
			}
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
}
