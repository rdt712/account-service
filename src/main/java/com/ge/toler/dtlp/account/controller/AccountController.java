package com.ge.toler.dtlp.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ge.toler.dtlp.account.dao.AccountDao;
import com.ge.toler.dtlp.account.domain.Account;
import com.ge.toler.dtlp.account.domain.AccountResponse;
import com.ge.toler.dtlp.account.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Account getAccount(@PathVariable long id) {
		return accountService.getAccountById(id);
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public AccountResponse getAllAccounts() {
		return new AccountResponse(accountDao.findAll());
	}
}
