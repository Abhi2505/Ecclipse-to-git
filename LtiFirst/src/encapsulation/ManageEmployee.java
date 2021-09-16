package encapsulation;

public class ManageEmployee {
Employee addEmployee() {
	Employee e1=new Employee(101,"abhi","S",3.4);
	/*
	 * e1.setEmpno(1001); e1.setCity("Bhopal"); e1.setSalary(212);
	 * e1.setName("abshi");
	 */
	return e1;
	//outside not know the variable
}
void displayEmployee(Employee e) {
System.out.println(e);
	//	System.out.println("name "+e.getName());
//	System.out.println("name "+e.getEmpno());
//	System.out.println("name "+e.getCity());
//	System.out.println("name "+e.getSalary());
//	
	
}
}
