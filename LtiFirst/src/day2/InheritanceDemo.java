package day2;
class BankAccount{
	double withdrawAmount,depositAmount,balance;
	double interestRate=9.5;
	public void depositMoney(int depositMoney) {
		System.out.println(depositAmount+" "+depositMoney);
	}
	public void withdrawMoney(int withdraw) {
		System.out.println("money withdraw "+withdraw);
		balance=depositAmount-withdrawAmount;
		System.out.println(balance);
	}

}
class NRIAccount extends BankAccount{
	void applyfixedDeposit() {
		interestRate=6.5;
	}
}
class SeniorCitizen extends BankAccount{
	void applyfixedDeposit() {
		interestRate=10.5;
	}
}
public class InheritanceDemo {
public static void main(String[] args) {
NRIAccount nr=new NRIAccount();
SeniorCitizen sn=new SeniorCitizen();
nr.depositAmount=20;
nr.withdrawAmount=10;
nr.depositMoney(20);
nr.withdrawMoney(10);
sn.depositAmount=90;
sn.withdrawAmount=78;
sn.depositMoney(90);
sn.withdrawMoney(78);
	
}
}
