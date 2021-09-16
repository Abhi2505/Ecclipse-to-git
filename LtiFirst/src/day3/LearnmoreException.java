package day3;
class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}
class Verify{
	void verifyage(int age) throws InvalidAgeException {
		//throws is used to makr the caller responsible for handling
		//exception created 
		int a=12/0;
		throw new InvalidAgeException("age is < 18");	
		//canont wrtie after throw System.out.println("sas");
	}
}
public class LearnmoreException {
	
	public static void main(String[] args) {
		Verify v=new Verify();
		try {
			
			v.verifyage(12);
		}
//		catch(InvalidAgeException e) {
//			System.out.println("age invaliddsdss");
//		}
		catch(Exception e) {
			System.out.println("e"+e.getMessage());
		}
}
}
