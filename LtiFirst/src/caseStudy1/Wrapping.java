package caseStudy1;

public class Wrapping {
	public static void main(String[] args) {
		int x=12;
		Integer x1=new Integer(x);
		//System.out.println(x1.MIN_VALUE);
	char ch='a';
	Character c=new Character(ch);
	c=Character.toUpperCase(ch);
//	System.out.println(c.isDigit(ch));
	System.out.println(c.isUpperCase(ch));
	int y=Integer.valueOf(x1);//unwraping x1 ie object
	int b=x1.intValue();//same as above unwrapping
	
	}
}
