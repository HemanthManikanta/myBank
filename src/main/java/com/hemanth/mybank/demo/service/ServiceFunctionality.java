package com.hemanth.mybank.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hemanth.mybank.demo.model.AccountRequest;
import com.hemanth.mybank.demo.model.LoginRequest;
import com.hemanth.mybank.demo.repository.AccData;

@Service
public class ServiceFunctionality {
	
	@Autowired
	private AccData repository;
	

	

	public List<AccountRequest> findAll(){
		
		
		return  repository.findAll();
		}
	
	
}
