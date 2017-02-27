package com.ge.toler.dtlp.account.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ge.toler.dtlp.account.exception.NoAccountException;


@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(NoAccountException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> missingMovie(NoAccountException e) {
		return Collections.singletonMap("error", "account " + e.getAccountId() + " not found.");
	}
}
