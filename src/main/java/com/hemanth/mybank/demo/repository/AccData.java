package com.hemanth.mybank.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hemanth.mybank.demo.model.AccountRequest;

public interface AccData extends JpaRepository<AccountRequest, Integer> {
	
	
	
}
