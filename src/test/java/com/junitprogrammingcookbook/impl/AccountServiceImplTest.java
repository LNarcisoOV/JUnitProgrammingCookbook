package com.junitprogrammingcookbook.impl;



import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.junitprogrammingcookbook.model.Account;

public class AccountServiceImplTest {
	
	AccountServiceImpl accountService = new AccountServiceImpl();

	@Test
	public void testCreateNewAccount() {
		Account acc = new Account();
		acc.setName("Name");
		acc.setDescription("Description");
		
		Account accountInserted = accountService.createNewAccount(acc);
		assertThat(accountInserted, isA(Account.class));
		assertEquals(accountInserted.getName(), acc.getName());
	}
	
	@Test
	public void testUpdateAcount(){
		Account oldAccount = new Account();
		oldAccount.setName("Name");
		oldAccount.setDescription("Description");
		String nameToCompare = "Alvin Reyes: New Name";
		String descriptionToCompare = "Description: new Description";
		
		Account expectedAccountObj = new Account();
		expectedAccountObj = accountService.updateAccount(oldAccount);
		
		assertThat(expectedAccountObj, isA(Account.class));
		assertEquals(nameToCompare, expectedAccountObj.getName());
		assertEquals(descriptionToCompare, expectedAccountObj.getDescription());
	}
	
	@Test
	public void testRemoveAcount(){
		Account acc = new Account();
		acc.setName("Name");
		acc.setDescription("Description");
		assertTrue(accountService.removeAccount(acc));
	}
	
	@Test
	public void testListAllTransactions(){
		Account acc = new Account();
		acc.setName("Name");
		assertTrue(accountService.listAllTransactions(acc).size() > 1);
	}
}
