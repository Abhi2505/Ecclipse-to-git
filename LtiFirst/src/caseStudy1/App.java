package caseStudy1;

import java.util.Scanner;

public class App {
	static void scenario1() {
		Student s1=new Student(0,"abhi","2-08-1900");
		String college="DAVV";
		s1.setcollege(college);
		Info info=new Info();
		String phone[]=new String[2];
		phone[0]="909039803";
		phone[1]="989282933";
		s1.setphone(phone);
		info.display(s1);
	}
	static void scenario2() {
		Info info=new Info();
		Student st[]=new Student[4];
		Student s1=new Student(1,"abhi","12-07-1900");
		String college="DAVV";
		s1.setcollege(college);
		
		String phone1[]=new String[2];
		phone1[0]="909039803";
		phone1[1]="989282933";
		s1.setphone(phone1);

		//since we have to store in array 
		//and colege is static so all student are of same college		
		Student s2=new Student(2,"ram","7-09-1900");
		String phone2[]=new String[2];
		phone2[0]="909031223";
		phone2[1]="989282933";
		s2.setphone(phone2);

		Student s3=new Student(3,"mohan","5-06-1900");
		String phone3[]=new String[2];
		phone3[0]="909123543";
		phone3[1]="989282333";
		s3.setphone(phone3);

		Student s4=new Student(4,"rahul","4-02-1900");
		String phone4[]=new String[2];
		phone4[0]="999009999";
		phone4[1]="932433455";
		s4.setphone(phone4);

		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		for(int i=0;i<st.length;i++) {
			info.display(st[i]);
		}
	}
	static void scenario3() {
		Scanner o=new Scanner (System.in);
		Info info=new Info();		
		System.out.println("Enter the no of student to create");
		int num=o.nextInt();
		Student st[]=new Student[num];		
		int sid;
		String sname,dob;
		for(int i=0;i<num;i++) {
			System.out.println("Enter sid");
			sid=o.nextInt();
			System.out.println("enter sname");
			o.nextLine(); 
			sname=o.nextLine();
			System.out.println("enter dob");
			 dob=o.next();
			Student s1=new Student(sid,sname,dob);
			String phone[]=new String[2];
			System.out.println("Enter 2 phone no");
			phone[0]=o.next();
			phone[1]=o.next();
			s1.setphone(phone);
			String college="DAVV";
			s1.setcollege(college);
			
			st[i]=s1;
		}
		for(int i=0;i<num;i++) {
			info.display(st[i]);
		}
		
	}
public static void main(String[] args) {
	//scenario1();
	//scenario2();
	scenario3();
}
}
