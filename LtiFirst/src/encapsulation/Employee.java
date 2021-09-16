package encapsulation;

public class Employee {
private int empno;
//hiding this using private
private String name;
private String city;
private double salary;
//public int getEmpno() {
//	return empno;
//}
//accesing through method is abstrraction
//public void setEmpno(int empno) {
//	this.empno=empno;
//}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.city+" "+this.salary+" "+this.name+" "+this.empno;
	}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employee(int empno, String name, String city, double salary) {
	this.empno = empno;
	this.name = name;
	this.city = city;
	this.salary = salary;
}


}
