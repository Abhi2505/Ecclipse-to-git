package day5;
interface Sumcalc{
	int findsum(int x,int y);
}
public class LambdawithAargs {
public static void main(String[] args) {
	Sumcalc calc;
	calc=(a, b)->{
		return a+b;
	};
	System.out.println(calc.findsum(2, 3));
}
}
