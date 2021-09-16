package com.lti.mains;

import com.lti.dao.StudentDao;
import com.lti.dao.Studentdaoimplement;
import com.lti.pojo.Student;

public class AppMain {
public static void main(String[] args) {
	Student st=new Student(121,"Rajesh","Pune");
	StudentDao dao=new Studentdaoimplement();
	//dao.addStudent(st);
	//System.out.println(dao.getStudent());
	//dao.updateStudent(new Student(121,"Rakesh","USA"));
	//dao.deleteStudent(121);
//	Student std=dao.searchStudent(1);
//	if(std!=null)
//		System.out.println(std);
}
}
