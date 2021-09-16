package day4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//int a=[10,20,40,60] x=2 //230
//int b=[70,30,15,100] y=2

public class ProdDemo {
public static void main(String[] args) {
	List<Product>l=new ArrayList<Product>();
	Product p1=new Product(300,"Colgate",90);
	Product p2=new Product(100,"Gun",790);
	Product p3=new Product(400,"Soap",50);
	Product p4=new Product(200,"Oil",210);
	l.add(p1);
	l.add(p2);
	l.add(p3);
	l.add(p4);
	for(Product p:l) {
		System.out.println(p);
	}
	//based on prodid
	Collections.sort(l,new Comparator<Product>() {
		@Override
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			return o2.getPrice()-o1.getPrice();
		}		
	});
	System.out.println(l);
}
}
