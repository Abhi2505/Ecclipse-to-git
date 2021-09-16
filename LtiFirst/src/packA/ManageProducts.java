package packA;

import java.util.Scanner;

public class ManageProducts {
public static void main(String[] args) {
	Scanner o=new Scanner(System.in);
	System.out.println("enter pcount");
	int pcount=o.nextInt();
	Product[] par=new Product[pcount];
	int pid;
	String n;
	int price;
	for(int x=0;x<par.length;x++) {
		System.out.println("enter p ["+(x+1)+"]"+"info");
		System.out.println("pid ");
		pid=o.nextInt();
		System.out.println("name");
		n=o.next();
		System.out.println("price");
		price=o.nextInt();
		par[x]=new Product(pid,n,price);
	}
	System.out.println("product list");
	for(int i=0;i<par.length;i++) {
		System.out.println(par[i]);
	}
}
}
