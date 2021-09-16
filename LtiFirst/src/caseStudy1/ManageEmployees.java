package caseStudy1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageEmployees {
	List<Employee>obj=new ArrayList<Employee>();
	void addEmployees(Employee emp) {
		this.obj.add(emp);
	}
	List<Employee>getEmployee(){
		return this.obj;
	}
	void modifyEmp(Employee e,int emp) {
		for(int i=0;i<obj.size();i++) {
			if(obj.get(i).getEmpNo()==emp) {
				obj.set(i,e);
			}
		}
	}
	void deleteEmp(int emp) {
		for(int i=0;i<obj.size();i++) {
			if(obj.get(i).getEmpNo()==emp) {
				obj.remove(i);
			}
		}
	}
	Employee searchEmployee(int empno) {
		for(Employee e:obj) {
			if(e.getEmpNo()==empno) {
				return e;
			}
		}
		return null;
	}
	public static void main(String[] args) {
	Scanner o=new Scanner(System.in);
	ManageEmployees mg=new ManageEmployees();
	do {
		System.out.println("1.AddEmployee 2.DisplayEmployees 3.Exit 4.DeleteEmployee 5.Update");
		System.out.println("your choice");
		int choice=o.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter empno,name,city");
			Employee e=new Employee();
			e.setEmpNo(o.nextInt());
			e.setName(o.next());
			e.setCity(o.next());
			mg.addEmployees(e);
			System.out.println("employee added");
			break;
		case 2:
			System.out.println("Emp Detatils");
			for(Employee e1:mg.getEmployee()) {
				System.out.println(e1);
			}
			break;
		case 3:
			System.exit(0);
			break;
		case 4:
			System.out.println("enter employee id to be deleted");
			int id=o.nextInt();
			Employee emp=mg.searchEmployee(id);
			
			if(emp==null){
				System.out.println("Employee not exists");
			}
			else {
				mg.deleteEmp(id);
				System.out.println("Employee deleted");
			}
			break;
		case 5:
			System.out.println("Enter employe id to modify");
			int empid=o.nextInt();
				Employee employee=mg.searchEmployee(empid);
			if(employee==null){
				System.out.println("Employee not exists");
			}
			else {
				Employee empl=new Employee();
				empl.setCity("rajasthan");
				empl.setName("ram");
				empl.setEmpNo(2);
				mg.modifyEmp(empl,empid);
				System.out.println("Employee modified");
				mg.modifyEmp(empl,empid);
			}
			break;
			default:
			System.out.println("Invalid choice");
		}
		
	}while(true);
}
}
