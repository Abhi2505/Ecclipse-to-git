package day2;
class Loan{
	Loan(){
		System.out.println("loan cons");
	}
	Loan(String msg){
		//this();//will call loan const also
		System.out.println("loan msg"+msg);
	}
//	void setLoanTypes() {
//		System.out.println("setting loan types");
//	}
}
class BankLoan extends Loan{
	
	public BankLoan() {
		super("sa");
		//now defult cons is not called const with 1 arg will be called of immediate parent
		//if single arg is not present comp error	
		System.out.println("bank loan");
	}
//	void setLoanTypes() {
//		super.setLoanTypes();
//		//call the immediate parent class
//		System.out.println("setting bank loan types");
//	}
}
class DenaBank extends BankLoan{
	public DenaBank(){
		//super("Sa"); invalid as imediate parent is not having 
		//const with single arg
			System.out.println("dena bank");
	}
	//	void setLoanTypes() {
//		super.setLoanTypes();
//		//call the immediate parent class
//		System.out.println("setting denA bank loan types");
//	}
}
public class BankingApp {
	public static void main(String[] args) {
		DenaBank bnk=new DenaBank();
		
	}

}
