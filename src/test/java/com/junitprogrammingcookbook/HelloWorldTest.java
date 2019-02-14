package com.junitprogrammingcookbook;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("@Before Class");
	}

	@Before
	public void before() {
		System.out.println("@Before");
	}

	@Test
	public void test() {
		System.out.println("@Test");
		HelloWorld hw = new HelloWorld();
		assertTrue("Number 1 is greater than number 2.", hw.isGreater(2, 1));
	}
	
	@After
	public void after(){
		System.out.println("@After");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("@After Class");
	}
}
