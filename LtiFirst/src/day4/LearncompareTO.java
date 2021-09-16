package day4;

import java.util.Comparator;

public class LearncompareTO implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
	return o1.getProdid()-o2.getProdid();
		// TODO Auto-generated method stub
	
	}
}
