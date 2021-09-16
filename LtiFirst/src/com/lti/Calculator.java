package com.lti;

public class Calculator {
	int x,y;
	double res;
public Calculator() {
	this(10,20);
	x=100;
	y=200;
	res=x+y;
	System.out.println(res);
}
public Calculator(int x,int y) {
	this(5.6,5.4);
	this.res=x+y;
	System.out.println(" 2pa"+res);
}

public Calculator(double x,double y) {
	this.res=x+y;
	System.out.println(" 3pa"+res);
}
public static void main(String[] args) {
	Calculator c=new Calculator();
//	Calculator c2=new Calculator(10,20);
//	Calculator c3=new Calculator(5.6,4.4);;


}
}
