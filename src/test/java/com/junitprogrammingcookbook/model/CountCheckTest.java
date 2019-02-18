package com.junitprogrammingcookbook.model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;

@RunWith(ConcurrentTestRunner.class)
public class CountCheckTest {

	private CountCheck counter = new CountCheck();
	
	@Before
	public void init(){
		System.out.println("@Before CountCheckTest");
		counter.initialize(2);
	}
	
	@Test
	public void testAddOne(){
		counter.addOne();
	}
	
	@After
	public void testCount(){
		System.out.println("@After CountCheckTest");
		assertEquals("Value should be 6.", 6, counter.getCount());
	}
}
