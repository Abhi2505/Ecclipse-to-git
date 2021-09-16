package day3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Learnstring {
	static String change(String s) {
		String ans="";
		for(char c:s.toCharArray()) {
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				ans+=c;	
			}
			else {
				if(c=='Z')
					ans+='A';
				else if(c=='z')
					ans+='a';
				else
				ans+=(char)(c+1);
				
			}
		}
		return ans;
	}
	static String move(String s) {
		String digit="";
		String other="";
		for(char c:s.toCharArray()) {
			if(Character.isDigit(c))
				digit+=c;
			else
				other+=c;
		}
		return other+digit;
	}
	
	static boolean isdigitonly(String s) {
		for(char c:s.toCharArray()) {
			if(!Character.isDigit(c))
				return false;
		}
		return true;
	}
	void pproblem1() {
		System.out.print("Enter phone numbers : ");
		String numbers = new Scanner(System.in).next();
		StringTokenizer stz = new StringTokenizer(numbers, ",");
		int c = 0;
		String regex = "[0-9]+";
		while(stz.hasMoreTokens()) {
		if(stz.nextToken().length() == 10 && stz.nextToken().matches(regex)) 
		c++;

		}
	}
	static int validphone(String p) {
		String s[]=p.split(",");
		int count=0;
		for(String st:s) {
			if(st.length()==10&&isdigitonly(st.trim())) {
				count++;
			}
		}
		return count;
	}
	
	static int findsum(String s) {
			int sum=0;
			for(char c:s.toCharArray()) {
			if(Character.isDigit(c)) {
					sum+=Character.getNumericValue(c);
				}
			}
			return sum;
		
	}
	public static void main(String[] args) {
		System.out.println(validphone("8939413522,9827276658,98128,9981315567,Ab219789,%%wqoi20"));
//		String fruits ="aple,banana,grape,orange";
//		StringTokenizer st=new StringTokenizer(fruits,",");
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		//String fr[]=fruits.split(",");
		//	System.out.println(findsum("JAVA"));
//	System.out.println(move("123app4"));
//	System.out.println(move("1a2b3c"));
//		StringBuffer sb=new StringBuffer("abhi");
//	sb.setCharAt(0, 'r');
//	sb.insert(0, 'A');
//	sb.replace(0, 4, "a");
//	System.out.println(sb);
//	System.out.println(change("JAVA"));
//	System.out.println(change("java"));
//	System.out.println(change("ZEEL"));
//	System.out.println(change("MAAN"));
//	System.out.println(change("ZabE"));
	}	
}
