package com.lti.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Product;

public class ProductTest {

	@Test
	public void test1()
	{
		Product pd=new Product(101,"s",12.9,"sree");
		
		Assertions.assertEquals("sree",pd.getCompanyName());
	}
}
