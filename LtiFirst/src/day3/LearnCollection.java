package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;

import com.lti.Student;

public class LearnCollection {
static List returnlist(String input) {
	List l=new ArrayList();	
	//String ar[]=input.split(",");
	StringTokenizer st=new StringTokenizer(input,",");
	while(st.hasMoreTokens()) {
		String token=st.nextToken();
		l.add(token.substring(0, 1).toUpperCase()+token.substring(1));
	}
//	for(String s:ar) {
//		s=(s.substring(0, 1).toUpperCase())+s.substring(1);
//		l.add(s);
//	}
	return l;
	}
static void removedup(String s) {
	//directly u can use a treeset to get sorted and duplicate removed
	ArrayList<Character>l=new  ArrayList<>();
	for(char c:s.toCharArray()) {
		if(!l.contains(c)) {
			l.add(c);
		}		
	}
	String p="";
	for(char c:l)
		p+=c;
	System.out.println(p);
//System.out.println(String.valueOf(ar));
}
	public static void main(String[] args) {
		removedup("cassandra");
		removedup("banana");
//		Set<Integer> setobj=new HashSet<Integer>();
//		setobj.add(100);
//		setobj.add(100);
//		setobj.add(100);
//		setobj.add(110);
//				Iterator<Integer>it=setobj.iterator();
//				while(it.hasNext()) {
//					System.out.println(it.next());
//				}
//		System.out.println(setobj);
//		//	System.out.println(returnlist("abhi,ram,shyam"));
//	ArrayList<Integer> ar1=new ArrayList<Integer>();
//	
//ar1.add(2);
//
//ListIterator<Integer>l2=ar1.listIterator();
//l2=ar1.listIterator();
//while(l2.hasNext()) {
//	System.out.println(l2.next());
//}
//while(l2.hasPrevious()) {
//	
//	System.out.println(l2.previous());
//}
//String b="a";
//using the iterator removal is possible
//with the listiterator we can modify and remove both
//System.out.println(Integer.parseInt((int)b.toString().charAt(0)+""));
//System.out.println(ar1.remove(1));
//System.out.println(ar1);
//through list iterator we can iterate on both next and previous data as well
//but for that the iterator var ned to move at end then on it can come backword

//	ar1.add(12);
//	ar2.add(123);
//	ar1.addAll(ar2);
//	ar2.clear();
	//System.out.println(ar1);
}
}
