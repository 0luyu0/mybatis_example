package com.briup.day1;

import java.util.List;

import com.briup.pojo.Student;

public interface IStudentDao {
	List<Student> findAllStudent();
	Student finStudentById(int id);
	void insertStudent(Student student);
}
