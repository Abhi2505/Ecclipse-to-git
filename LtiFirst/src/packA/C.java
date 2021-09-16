package packA;

import java.util.Scanner;

public class C {
public static void main(String[] args) {
	D d=new  D();
	d.cool();
	int n[];
	Scanner o=new Scanner(System.in);
	System.out.println("enter size");
	int s=o.nextInt();
	n=new int[s];
	int i=0;
	while(i<s) {
		n[i++]=o.nextInt();
	}
	for(int k:n) {
		System.out.print(k+" ");
	}
}
}
