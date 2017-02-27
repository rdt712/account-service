package com.ge.toler.dtlp.account.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ge.toler.dtlp.account.domain.Account;

public interface AccountDao extends JpaRepository<Account, Long> {
	
}
