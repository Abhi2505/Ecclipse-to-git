package day3;

public class LearnExcptn {
	static int []myarr;
public static void main(String[] args) {
	int ar[]= {10,2,3,0};
	try {
		int res=ar[0]/ar[1];
		try {

			int a=myarr[0]/'c';	
			System.out.println("a"+a);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("hi dude");
		}
		finally {
			System.out.println("go ahead");
		}
			//null pointer excpeiton even if we not know the type
			//of exception
	}
	catch(ArithmeticException a) {
		System.out.println("sa");
	}
	catch(ArrayIndexOutOfBoundsException b) {
		System.out.println("e"+b.getMessage());
	}
	//kepp exceptrino object at end as it is heavy
	//and also othe cathc can't be defined after it
	catch (Exception e) {
		System.out.println("last");
	}
	finally {
		System.out.println("sj");
	}
	//terminate and rest not execute
	//unchecked exception
	
	
}
}
