package day5;
interface Demodef{
	void cool();
	default void hot() {
		System.out.println(" im default..");
	}
}
abstract class check{
	static void lunch() {
		System.out.println("please give me food");
	}	
}
public class DefaultmethodinInterface implements Demodef{
public static void main(String[] args) {
	DefaultmethodinInterface df=new DefaultmethodinInterface();
	df.cool();
	df.hot();
}
public void hot() {
	System.out.println("hi i am hot not default");
}
@Override
public void cool() {
	// TODO Auto-generated method stub
	System.out.println("hi");
}
}
