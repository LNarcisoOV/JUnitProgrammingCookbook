package com.junitprogrammingcookbook.impl;

import java.util.ArrayList;
import java.util.List;

import com.junitprogrammingcookbook.model.Account;

public class AccountServiceImpl implements AccountService{

	public Account createNewAccount(Account account) {
		return account;
	}

	public Account updateAccount(Account account) {
		account.setName("Alvin Reyes: New Name");
		account.setDescription("Description: new Description");
		return account;
	}

	public Boolean removeAccount(Account account) {
		return true;
	}

	public List listAllTransactions(Account account) {
		List<Account> accountList = new ArrayList<Account>();
		accountList.add(new Account());
		accountList.add(new Account());
		return accountList;
	}

}
