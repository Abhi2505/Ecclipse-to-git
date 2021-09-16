package com.lti.dao;

import java.util.List;

import com.lti.pojo.Student;

public interface StudentDao {
	public boolean addStudent(Student st);
	public List<Student>getStudent();
	public boolean updateStudent(Student st);
	public boolean deleteStudent(int sid);
	public Student searchStudent(int sid);
}
