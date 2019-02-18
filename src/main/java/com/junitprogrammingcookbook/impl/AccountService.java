package com.junitprogrammingcookbook.impl;

import java.util.List;

import com.junitprogrammingcookbook.model.Account;

public interface AccountService {

	public Account createNewAccount(Account account);

	public Account updateAccount(Account account);

	public Boolean removeAccount(Account account);

	public List listAllTransactions(Account account);
}