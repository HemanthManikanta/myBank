package com.hemanth.mybank.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hemanth.mybank.demo.LearningProject3Application;
import com.hemanth.mybank.demo.model.AccountRequest;
import com.hemanth.mybank.demo.model.LoginRequest;
import com.hemanth.mybank.demo.repository.AccData;
import com.hemanth.mybank.demo.service.ServiceFunctionality;


@Controller
public class MyController {

	Logger log = LoggerFactory.getLogger(MyController.class);
	@Autowired
	private AccData repository;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@Autowired
	private ServiceFunctionality service;
	
	@GetMapping(value = "/")
	public String getPage() {
		return "welcome";
	}
	@GetMapping(value="/createAccount")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping(value="/login")
	public String login() {
		return "login";
	}


	@GetMapping(value="/validate")
	public String validate(LoginRequest loginrequest) {
		
		

		return "fetchDetails";
	}
	

	@GetMapping(value="/logout")
	public String logout() {
		return "logout";
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
///////////////////////////////////////To save details in table///////////////////////////////
	@PostMapping(value = "/saveDetails")
	public String 
	loadData( AccountRequest request) throws JsonProcessingException {
	long startTime = System.currentTimeMillis();
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(request);
		log.info("Request Json Format: {}",jsonString);
		String url = "http://localhost:8083/receiver";
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<AccountRequest> entity = new HttpEntity<AccountRequest>(request,header);
		request = resttemplate.postForObject(url, entity, AccountRequest.class);
		repository.save(request);
		long endtime = System.currentTimeMillis();
		log.info("Response Received {}",mapper.writeValueAsString(request) );
		return "success";
		

	}

	///To get the details saved in table
	
	/*
	 * @GetMapping(value = "/getDetails") public List<AccountRequest>
	 * getData(AccountRequest request) { List<AccountRequest> requestlist = new
	 * ArrayList<AccountRequest>(); requestlist.add(request); repository.findAll();
	 * return requestlist;
	 * 
	 * }
	 */
	 

}



