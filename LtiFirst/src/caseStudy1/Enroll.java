package caseStudy1;

import java.time.LocalDate;

public class Enroll {
private Student student;
private Course course;
private LocalDate loc;

public Enroll(Student student, Course course, LocalDate loc) {
	super();
	this.student = student;
	this.course = course;
	this.loc = loc;
}

@Override
public String toString() {
	return "Enrolled data:- student=" + student + ", course=" + course + ", loc=" + loc + "";
}


}
