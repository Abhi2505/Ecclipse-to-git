package caseStudy1;

public class Employee {
private int EmpNo;
private String name;
private String city;

@Override
public String toString() {
	return "Employee [EmpNo=" + EmpNo + ", name=" + name + ", city=" + city + "]";
}
public int getEmpNo() {
	return EmpNo;
}
public void setEmpNo(int empNo) {
	EmpNo = empNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
