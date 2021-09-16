package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStreams {
public static void main(String[] args) {
	List<Integer>l=new ArrayList<Integer>();
	//to convert array to list
	l=Arrays.asList(12,13,40,9,15,18);
	System.out.println(l);
	//Collectors can be used to store value in map,list,set etc

   	List<Integer>result=l.stream().map(item->item*item).collect(Collectors.toList());
	l.stream().map(item->item*item).forEach(val->System.out.println(val));
	result.stream().map(item->item+6).forEach(val->System.out.println(val));
	//every value of stream is squared and printed 
	//System.out.println(result);
	List<String>names=Arrays.asList("Inky","chinky","lassan");
	System.out.println(names);
	List<String>nresult=names.stream().filter(val->val.startsWith("l")).collect(Collectors.toList());
	System.out.println(nresult);
	List<String>fruits=Arrays.asList("watermelon","mango","Pear","papaya","banana");
	List<String>fresult=fruits.stream().sorted().collect(Collectors.toList());
	System.out.println(fresult);
	List<Integer>num=Arrays.asList(2,3,4,5,12);
	int sum=num.stream().reduce(1, (item,i)->item+i);
	//the first argument above is the initial value of i
	int product=num.stream().reduce(1, (item,i)->item*i);
	//reduce is used to reduce down to a single value
	System.out.println(sum);
	System.out.println(product);
	
}
}
