package day2;
abstract class PassportHO{
	int officeid;
	void approval() {
		System.out.println("Approved");
	}
	abstract void verifyProof() ;
}
class PassportOfcBglr extends PassportHO{
//child is forced to define their verification techniq
	@Override
	void verifyProof() {
		officeid=12;
		// TODO Auto-generated method stub
		System.out.println("banglore");
	}
	//we cannot aces other method using 
	//PassportHO p=new PassportOfcBglr();
	//other method not acessed using parnet reference 
	void check() {
		System.out.println("s");
	}
}
abstract class PassportOfcChn extends PassportHO{
	@Override
	void verifyProof() {
		// TODO Auto-generated method stub
		System.out.println("chennai");
	}
	
}
class A extends PassportOfcChn{

//	@Override
//	void verifyProof() {
//		// TODO Auto-generated method stub
//		System.out.println("In a");
//	}
	
}
public class PassportIssue {
//no one should call the head office so make it abstract
	public static void main(String[] args) {
		PassportHO p=new PassportOfcBglr();
	//	PassportHO p1=new PassportOfcChn();
		PassportHO p1=new A();
		p1.verifyProof();
		//when parent ref vat m child instance then childmethod cnt be accessed
//		p.verifyProof();
//		p1.verifyProof();
		PassportOfcBglr bg=new  PassportOfcBglr();
//	bg.check();
//		bg.verifyProof();
	}
}
