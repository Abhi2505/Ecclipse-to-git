package caseStudy1;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
public class TestApp {
//static Student searchst(int sid,Student slist[]) {
//	
//	for(Student s:slist) {
//		if(s.getid(s)==sid) {
//			return s;
//		}
//	}
//	return null;
//}
static Student searchst(int sid,List<Student> slist) {
	
	for(Student s:slist) {
		if(s.getid(s)==sid) {
			return s;
		}
	}
	return null;
}
	
//static Course searchco(int cid,Course clist[]) {
//	for(Course c:clist) {
//		if(c.getid(c)==cid) {
//			return c;
//		}
//	}
//	return null;
//}
static Course searchco(int cid,List<Course> clist) {
	for(Course c:clist) {
		if(c.getid(c)==cid) {
			return c;
		}
	}
	return null;
}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	AppEngine o=new AppEngine();
	int sid;
	String sname,dob;
	System.out.println("------lets add students------------");
	System.out.println("------Enter the number of students------");
	int student=s.nextInt();
	
	for(int i=0;i<student;i++) {
		System.out.println("Enter sid");
		sid=s.nextInt();
		System.out.println("enter sname");
		s.nextLine(); 
		sname=s.nextLine();
		System.out.println("enter dob");
		 dob=s.next();
		Student s1=new Student(sid,sname,dob);
		String phone[]=new String[2];
		System.out.println("Enter 2 phone no");
		phone[0]=s.next();
		phone[1]=s.next();
		s1.setphone(phone);
		String college="DAVV";
		s1.setcollege(college);
	
		o.register(s1);
	}
	List<Student>studentlist=o.listOfStudents();
	//System.out.println(studentlist);
	
	System.out.println("--------Lets add course--------");	
	System.out.println("------Enter the number of courses--------");
	int courses=s.nextInt();
	for(int i=0;i<courses;i++) {
		System.out.println("enter course id");
		int id=s.nextInt();
		System.out.println("Enter course name");
		String name=s.next();
		System.out.println("enter duration");
		int duration=s.nextInt();
		System.out.println("enter fees");
		int fees=s.nextInt();
		Course c1=new Course(id, name, duration, fees);
		o.introduce(c1);
	}
	
	//Course courselist[]=o.listOfCourses();
	List<Course>courselist=o.listOfCourses();
	//Student studentlist[]=o.listOfStudents();
	//System.out.println(courselist);
	
	//Enroll enrl[]=o.listOfEnrollments();
	//here assumption is that a student can take 1 course and that
	//can be any course 
			System.out.println("--------Lets enroll the students in courses----------");
			
		for(int i=0;i<student;i++) {
		System.out.println("Enter sid to be enrolled");
		int stid=s.nextInt();
		System.out.println("Enter cid u want");
		int coid=s.nextInt();
		Student stu=searchst(stid,studentlist);
		Course cou=searchco(coid,courselist);
		if(stu==null)
			System.out.println("enter sid  correctly");
		else if(cou==null)
			System.out.println("enter  cid correctly");
		else {
//			System.out.println(stu);
//			System.out.println(cou);
			o.enroll(stu, cou, LocalDate.now());
		}
		}
	List<Enroll> enrl=o.listOfEnrollments();
	
//	for(Course c1:courselist) {
//		System.out.println(c1);
//	}
//	for(Student st:studentlist) {
//		System.out.println(st);
//	}
//	for(Enroll erl:enrl) {
//		System.out.println(erl);
//	}
System.out.println(courselist);
System.out.println(studentlist);
System.out.println(enrl);
}
}
