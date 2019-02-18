package com.junitprogrammingcookbook;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
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
	public void testIfN1IsGreaterThanN2() {
		System.out.println("@Test");
		HelloWorld hw = new HelloWorld();
		assertTrue("Number 1 is greater than number 2.", hw.isGreater(2, 1));
	}
	
	@Test
	@Ignore
	public void testIfN1IsMinorThanN2() {
		System.out.println("@Test and @Ignore");
		HelloWorld hw = new HelloWorld();
		assertTrue("Number 1 is minor than number 2.", hw.isMinor(1, 2));
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
