package caseStudy1;

public class Info {
public void display(Student student) {
	System.out.print(student);
	System.out.println(" ,College is= "+student.getcollege());
	String phone[]=student.getphone();
	System.out.println("Phone number are");
	for(String s:phone) {
		System.out.println(s);
	}
}
public void display(Course course) {
	System.out.println(course);
}
}
