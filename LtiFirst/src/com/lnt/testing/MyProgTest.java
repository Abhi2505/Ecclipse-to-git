package com.lnt.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class Custom extends Exception{
	Custom(String m){
		super(m);
	}
}
class MyProgTest {
	
//@Test
//void check1() {
//	Testprog1 p1=new Testprog1();
//	
//	//assertEquals(5, p1.divide(10, 0));
//	int res=0;
//	//exception ayga toh j unit m error show krega
//	try {
//		res=p1.divide(10, 0);
//	}
//	catch (Exception e) {
//		// TODO: handle exception
//	//yha pr divide by zero m exception ayga
//	//toh hm intentionally test case fail krwayenge
//	//	fail("Exception occurs");
//	}
//	assertEquals(res, -1);
//}
	@Test
void check2() {
	Testprog1 p1=new Testprog1();
	try {
	int a[]=p1.remove(new int[] {10,20,20,30});
	assertArrayEquals(new int [] {30,20,10}, a);
	
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		assertEquals(e.getMessage(),"Invalid Element");
	}
}
	@Test
	void check3() {
		Testprog1 p1=new Testprog1();
		try {
		int a[]=p1.remove(new int[] {5,5,5,2,2});
		assertArrayEquals(new int [] {5,2}, a);
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			assertEquals(e.getMessage(),"Invalid Element");
		}
		}
	@Test
	void check4() {
		Testprog1 p1=new Testprog1();
		try {
		int a[]=p1.remove(new int[] {0,0,0,0});
		assertArrayEquals(new int [] {0}, a);
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			assertEquals(e.getMessage(),"Invalid Element");
		}

		}
	@Test
	void check5() {
		Testprog1 p1=new Testprog1();
		try {
		int a[]=p1.remove(new int[] {4,5,6,-1});
		assertArrayEquals(new int [] {6,5,4,-1}, a);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			assertEquals(e.getMessage(),"Invalid Element");
		}

		}
//	@BeforeEach
//	void setUp() throws Exception{
//		System.out.println("Before");
//	}
//	
//
//	@Test
//	void makeupperTest1(){
//		Testprog1 p=new Testprog1();
//		String s=p.makeUpper("stars");
//		assertEquals("STARS", s);
//		//asertequal(expected,given)
//	}
//	@Test
//	void makeupperTest2() {
//		Testprog1 p1=new Testprog1();
//		String s2=p1.makeUpper("ant");
//		assertEquals("ANT", s2);
//	}
//	@Test
//	void makeupperTest3() {
//		Testprog1 p3=new Testprog1();
//		String s2=p3.makeUpper("Abhi");
//		assertEquals("ABHK", s2);
//		
//	}
//	@Test
//	void testlength() {
//		Testprog1 p3=new Testprog1();
//		assertEquals(5,p3.getLength("adwjk"));
//	}
//	@Test
//	void testlength2() {
//		Testprog1 p3=new Testprog1();
//		assertEquals(6,p3.getLength("asadwjk"));
//	}

}
