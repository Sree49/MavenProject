package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.lti.demo.MyApp;

class MyAppTest {
/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	@Test
	void testShow()
	{
		MyApp m=new MyApp();
		String s=m.show();
		Assertions.assertEquals("hello Maven", s);	
	}
}







