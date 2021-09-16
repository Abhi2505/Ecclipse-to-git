package day2;
interface Banks{
	//no concrete(with body) mehtod in interface
	//interface is 100% abstract we can say
	void deposit();
	int x=2;//canot be modified in child but in abstract we can do it
	void withdraw();
	
}
interface Vaccination{
	void vaccinateBankEmp();
	static void hello() {
		
	}
}
abstract class RBI{
	abstract void depositrate();
}
class HDFC  extends RBI implements Banks,Vaccination{
	@Override
	public void vaccinateBankEmp() {
		// TODO Auto-generated method stub
	System.out.println("vacinate");	
	}

	void depositrate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
	System.out.println("hdfc deposit");	
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw");
	}
	
}
public class Demo2 {

}
