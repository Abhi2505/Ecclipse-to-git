package encapsulation;

public class Empmain {
	public static void main(String[] args) {
		ManageEmployee e= new ManageEmployee();
		Employee e1=e.addEmployee();
		e.displayEmployee(e1);
	}
//through overloading need not rememebr multiple methods
//void add() char add() are not overloaded 
//void add() char add(int s) is overloading	
}
