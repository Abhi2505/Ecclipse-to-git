package day3;
class MyArithmeticException extends Exception{
public MyArithmeticException(String message) {
	// TODO Auto-generated constructor stub
	super(message);
}	
}
public class Try3 {
static int divide(int a,int b) throws MyArithmeticException {
	int val=0;
	try {
	val=a/b;
	}
	catch(ArithmeticException e) {
		//in busines we do not show user as exact exception
		throw new MyArithmeticException(e.getMessage());
	}
	return val;
}
public static void main(String[] args) {
	try {
		int val=divide(10,0);
		System.out.println(val);
	} catch (Exception e) {
		System.out.println(e.getMessage());
		// TODO Auto-generated catch block
	}
}
}
