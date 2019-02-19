package com.junitprogrammingcookbook.model;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.isIn;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;


public class AccountTest {
	
	private static Account acc = new Account();
	
	@BeforeClass
	public static void init(){
		acc.setName("name");
		acc.setDescription("description");
		acc.setFones(new ArrayList<String>());
		acc.getFones().add("123456789");
	}
	
	@Test
	public void testIfAccountIsAccount(){
		assertThat(acc, isA(Account.class));
	}
	
	@Test
	public void testIfAccountHasProperty(){
		assertThat(acc, hasProperty("name"));
		assertThat(acc, hasProperty("description"));
		assertThat(acc, hasProperty("fones"));
	}
	
	@Test
	public void testIfAccountHasPropertyAndSomeValue(){
		assertThat("123456789",  isIn(acc.getFones()));
	}

}
