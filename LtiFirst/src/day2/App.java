package day2;
class Bank{
	double interestRate;
	void setInterest() {
		interestRate=10.5;
	}
	void deposit() {
		System.out.println("bank accept deposit"+interestRate);
	}
}
class SBI extends Bank{
	//in child we get var and method of parent
	//thus ensuring reusability	
	void setInterest() {//overriding
		interestRate=9.7;
	}
}
class ICICI extends Bank{
	double iciciPersonalLoanRate;
	void  setRateandDisplay() {
		iciciPersonalLoanRate=12.99;
		System.out.println("icic personal loan "+iciciPersonalLoanRate);
	}
}
public class App {
public static void main(String[] args) {
	
	SBI sbi=new SBI();
	sbi.setInterest();
	sbi.deposit();
	ICICI ici=new ICICI();
	ici.setInterest();
	ici.deposit();
	ici.setRateandDisplay();
}
}

