package com.junitprogrammingcookbook.model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import com.anarsoft.vmlens.concurrent.junit.ThreadCount;

@RunWith(ConcurrentTestRunner.class)
public class CountCheckTest {

	private CountCheck counter = new CountCheck();
	private static final int THREAD_COUNT = 5;
	
	@Before
	public void init(){
		System.out.println("@Before CountCheckTest");
		counter.initialize(2);
	}
	
	@Test
    @ThreadCount(THREAD_COUNT)//without this annotation, the thread's default number is 4.
	public void testAddOne(){
		counter.addOne();
	}
	
	@After
	public void testCount(){
		System.out.println("@After CountCheckTest");
		assertEquals("Value should be 7.", 7, counter.getCount());
	}
}
