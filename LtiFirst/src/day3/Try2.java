package day3;
class InvalidSalaryException extends Exception{
	InvalidSalaryException(String message){
		super(message);
	}
}
//class SalaryOutOfBoundException extends Exception{
//	public SalaryOutOfBoundException(String message) {
//	super(message);	// TODO Auto-generated constructor stub
//	}
//}
class VerifySalary{
	void verifysal(int sal) throws InvalidSalaryException{
		if(sal<0)
			throw new InvalidSalaryException("Salary Negative Exception");	
		if(sal<10000||sal>50000) {
			throw new InvalidSalaryException("salary out of bound");
		}
	}
}
public class Try2 {
public static void main(String[] args) {
	VerifySalary vs=new VerifySalary();
	try {
		int sal=-122;
		vs.verifysal(9900000);
		
	}
	catch(InvalidSalaryException e) {
		System.out.println("exc"+e.getMessage());
		
	}
	
}
}
