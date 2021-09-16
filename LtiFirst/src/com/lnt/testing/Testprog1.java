package com.lnt.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class CustomException extends Exception{
	public CustomException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
public class Testprog1 {
public String makeUpper(String s) {
	return s.toUpperCase();
}
public int getLength(String s) {
	return s.length();
}

public int[] remove(int a[]) throws CustomException {
	ArrayList<Integer> l2=new ArrayList<Integer>();
	for(int val:a) 
		if(!l2.contains(val)) {
			if(val<=0) {
				throw new CustomException("Invalid Element");
			}
			l2.add(val);
		}
		
		
	int i=0;
	Collections.sort(l2);
	Collections.reverse(l2);
	int ans[]=new int[l2.size()];
	System.out.println(l2);
	for(int v:l2) 
		ans[i++]=v;
	return ans;
}
public int divide(int a,int b) {
	//divide a by b any number is 0 return -1;
	return a/b;
	//here logic for -1 nhi likkha
}
public static void main(String[] args) {
	
}
}
