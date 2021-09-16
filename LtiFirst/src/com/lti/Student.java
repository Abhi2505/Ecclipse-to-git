package com.lti;

public class Student {
int findleap(int year) {
	if (year % 100 == 0){
		if(year % 400 == 0){
			return 0;
			//leap and century
		} else {
			return 1;
		}
	} else {
		if(year % 4 == 0){
			return 0;
			//leap
		} else {
			return 2;
		}
	}	
}

public static void main(String[] args) {
Student s=new Student();
System.out.println(Integer.MAX_VALUE);
System.out.println(1+Integer.MAX_VALUE);
System.out.println(s.findleap(2000));
System.out.println(s.findleap(2004));
System.out.println(s.findleap(1900));
System.out.println(s.findleap(2004));
System.out.println(s.findleap(2004));
System.out.println(s.findleap(2004));

}
}
