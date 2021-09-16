package packB;

import packA.D;

public class E {
	
	static int x;
	int y;
	int z;
	E(int y,int z){
	this.y=y;
	this.z=z;
	}
	E(){
		y=22;
		z=33;
	}
	static void sample() {
		x=20;
	//	y=20;
	}
	void sample2() {
		x=20;
		y=10;
		z=203;
	}
	
public static void main(String[] args) {
//	D d=new  D();
//	D d1=new D();
//	d.cool();
//	d1.cool();
	E e=new E(1, 3);
	System.out.println(e.y);
	System.out.println(e.z);
	E e2=new E();

	System.out.println(e2.y);
	System.out.println(e2.z);
}
}
