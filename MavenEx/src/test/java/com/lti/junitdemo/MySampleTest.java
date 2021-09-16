package com.lti.junitdemo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

public class MySampleTest {

	@Test
	void testAdd() {
		int r=Calculator.add(100,200);
		Assertions.assertEquals(300,r); //expected,actual
		Assertions.assertEquals(100,Calculator.add(50,50),"Testing add method");//expected,actual,optional
		Assertions.assertNotEquals(200,r);
		
	}
	
	@Test
	
	void testAssertFalse()
	{
		Assertions.assertFalse("Akash".length()==10);
		Assertions.assertFalse(10>20,"comparing two values");
	}
	
	@Test
	
	void testAssertNull()
	{
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);

	}
	
	@Test
	
	void testAssertAll()
	{
		String s1="abc";
		String s2="pqr";
		String s3="xyz";
	/*
		Assertions.assertAll(
				() -> Assertions.assertEquals(s1,"abc"),
				() -> Assertions.assertEquals(s2,"pqr"),
				() -> Assertions.assertEquals(s3,"xyz")
				);*/
				
	}
	
	@Test
	
	void testCollections()
	{
		/*
		ArrayList<String> myList = new ArrayList<>();
		myList.add("hello");
		Assertions.assertFalse(myList.isEmpty());
		
		ArrayList<Integer> myList1= new ArrayList<>();
		Assertions.assertEquals(true,myList1.isEmpty());
	*/}
	

}

