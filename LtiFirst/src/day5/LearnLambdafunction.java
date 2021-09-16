package day5;

interface RBI{
	void setRepoRate();
}

/*
 * class Bank implements RBI{
 * 
 * @Override public void setRepoRate() {
 * System.out.println("setting repo rate..."); }
 * 
 * }
 */
public class LearnLambdafunction {
public static void main(String[] args) {
	/*here we are creating anonymms class 
	 * RBI obj=new RBI() {
	 * 
	 * @Override public void setRepoRate() { // TODO Auto-generated method stub
	 * System.out.println("set repo rate"); } };
	 */
	//above anonyms inner calss banegi
	RBI obj;
	obj=()->System.out.println("set reppo rate with lambbda");
		obj.setRepoRate();
//if interface is a functional(with only one fun to implemetn) interface then
		//no  need to create class for implementing
		//can be done easily using lambda function
}
}
