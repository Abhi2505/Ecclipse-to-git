package caseStudy1;

public class Course {
private int id;
private String name;
private int duration;
private int fees;
@Override
public String toString() {
	return "Course id=" + id + ", name=" + name + ", duration=" + duration + ", fees=" + fees ;
}
public Course(int id, String name, int duration, int fees) {
	super();
	this.id = id;
	this.name = name;
	this.duration = duration;
	this.fees = fees;
}
public int getid(Course c) {
	return c.id;
}
public static void main(String[] args) {
	Course c[]=new Course[5];
	Course c1=new Course(1,"Maths",3,2000);
	Course c2=new Course(2,"Physics",2,1000);
	Course c3=new Course(3,"Science",2,3000);
	Course c4=new Course(4,"English",4,4000);
	Course c5=new Course(5,"Hindi",5,5000);
	c[0]=c1;
	c[1]=c2;
	c[2]=c3;
	c[3]=c4;
	c[4]=c5;
	Info o=new Info();
	for(int i=0;i<5;i++) {
	o.display(c[i]);
	}
}
}
