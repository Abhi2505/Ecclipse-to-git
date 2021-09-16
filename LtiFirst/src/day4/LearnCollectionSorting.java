package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionSorting {
public static void main(String[] args) {
	List<String>vals =new ArrayList<String>();
	vals.add("Orange");
	vals.add("Banana");
	vals.add("Kiwi");
	vals.add("Dragon");
	vals.add("Grapes");
	Collections.sort(vals);
	System.out.println(vals);
	Collections.shuffle(vals);
	System.out.println(vals);
	//Comparable And Comparator
	//when the collection is made up of user defined objects
	
}
}
