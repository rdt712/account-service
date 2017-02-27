package com.ge.toler.dtlp.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.toler.dtlp.account.dao.AccountDao;
import com.ge.toler.dtlp.account.domain.Account;
import com.ge.toler.dtlp.account.exception.NoAccountException;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;
	
	@Override
	public Account getAccountById(Long id) {
		Account account = accountDao.findOne(id);
		if (account == null) {
			throw new NoAccountException(id);
		}
		return account;
	}

}
