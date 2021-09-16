package day5;

import java.util.ArrayList;
import java.util.List;

public class LambdawithList {
public static void main(String[] args) {
	List<Integer>ar=new ArrayList<Integer>();
	ar.add(15);ar.add(25);ar.add(24);ar.add(98);
	ar.forEach((val)->{
		if(val%5==0)	
			System.out.println(val);
		});
}
}
