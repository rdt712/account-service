package com.ge.toler.dtlp.account.exception;

public class NoAccountException extends RuntimeException {

	private static final long serialVersionUID = 4981705376918397941L;
	
	private long accountId;

	public NoAccountException(long accountId) {
		this.accountId = accountId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
}
