package caseStudy1;

import java.util.Arrays;

public class Student {
public Student(int id, String name, String dateofbirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateofbirth = dateofbirth;
	}
private int id;
private String name;
private String dateofbirth;
private static String collegeName;
private  String phone[];
@Override
public String toString() {
	
	return "Student id=" + id + ", name=" + name + ", dateofbirth=" + dateofbirth + "phone no="+Arrays.toString(phone);
}
public void setcollege(String college) {
	collegeName=college;
}
public String getcollege() {
	return collegeName;
}
public void setphone(String a[]) {
	phone=a;
}
public String[] getphone() {
	return phone;
}
public int getid(Student s) {
	return s.id;
}
}
