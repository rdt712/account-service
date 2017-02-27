package com.ge.toler.dtlp.account.domain;

import java.util.List;

public class AccountResponse {
	
	private List<Account> accounts;

	public AccountResponse() { }
	
	public AccountResponse(List<Account> accounts) {
		this.accounts = accounts;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
