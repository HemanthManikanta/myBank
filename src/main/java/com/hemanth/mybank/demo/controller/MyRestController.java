
package com.hemanth.mybank.demo.controller;



import java.util.List;

import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
org.springframework.beans.factory.annotation.Autowired; 
import
org.springframework.web.bind.annotation.GetMapping; import
org.springframework.web.bind.annotation.RestController;

import com.hemanth.mybank.demo.model.AccountRequest; 
import com.hemanth.mybank.demo.service.ServiceFunctionality;

@RestController 
public class MyRestController 
{ 
	Logger log =LoggerFactory.getLogger(MyRestController.class);

	@Autowired
	private ServiceFunctionality service;
		

	@GetMapping(value = "/getDetails") 
	public List<AccountRequest> getData() { 
		for(AccountRequest request : service.findAll()) {
			
		log.info("Request saved to DB :{}",request.toString());
		
		}
		return  service.findAll();



	
	
	}

}
