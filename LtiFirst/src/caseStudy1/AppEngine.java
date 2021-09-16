package caseStudy1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppEngine {
	//Student[]studentdata;
	List<Student>studentdata=new ArrayList<Student>();
	//Course[]courses;
	List<Course>courses=new ArrayList<Course>();;
	//Enroll[]enrollments;
	List<Enroll>enrollments=new ArrayList<Enroll>();;
//	int courseCount=0;
//	int studentCount=0;
//	int enroll=0;
	public AppEngine() {
//	studentdata=new Student[5];
//	courses=new Course[5];
//	enrollments=new Enroll[5];
	}
public void introduce(Course course) {
	{
//		if(courseCount< 5) {
//			courses[courseCount++]=course;
//		}
//		else {
//			System.out.println("course cannot be added");
//		}
		
		courses.add(course);
		
	}
}
public void register(Student student) {
	{
//		if(studentCount< 5) {
//			studentdata[studentCount++]=student;
//		}
//		else {
//			System.out.println("student cannot be added");
//		}
		studentdata.add(student);
		
	}
}
//public Student[] listOfStudents() {
//	return	this.studentdata;
//}
public List<Student> listOfStudents() {
	return	this.studentdata;
}
//public Course[] listOfCourses() {
//	return this.courses;
//}
public List<Course> listOfCourses() {
	return this.courses;
}
public void enroll(Student s,Course c,LocalDate d) {
	{	
	Enroll e1=new Enroll(s,c,d);	
//	
//	System.out.println(e1);
//	System.out.println(s);
//	System.out.println(c);
//	System.out.println(d);
	enrollments.add(e1);
	//System.out.println("is "+enrollments);
//		if(enroll< 5) {
//			enrollments[enroll++]=new Enroll(s, e, d);
//		}
//		else {
//			System.out.println("enrollment done");
//		}
		
	}
}
//public Enroll[]listOfEnrollments(){
//	return this.enrollments;
//}
public List<Enroll> listOfEnrollments(){
	return this.enrollments;
}
}
