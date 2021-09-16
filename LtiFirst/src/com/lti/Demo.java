package com.lti;

public class Demo {
	int empid;
	String name;
	void setData() {
		empid=12;
		name="abhi";
	}
	void display() {
		System.out.println("emp id "+empid);
		System.out.println("name is "+name);
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
		d.setData();
		d.display();
	}
}
