package com.ge.toler.dtlp.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.ge.toler.dtlp.account.dao.AccountDao;
import com.ge.toler.dtlp.account.domain.Account;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(AccountDao accountDao) {
		return args -> {
			accountDao.save(new Account(1L, "Ryan", "Toler", "rdt712@gmail.com", "(859)240-6422"));
		};
	}
}
