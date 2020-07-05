package com.logistic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.commons.entity.Order;
import com.commons.entity.OrderWrapper;

@RestController
public class LogisticController {
	
	@PostMapping(value = "/logistic", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getBill(@RequestBody OrderWrapper orderWrapper) {
		System.out.println(orderWrapper.getOrder());
		System.out.println("------------------------");
		System.out.println(orderWrapper.getBillInfo());
		return ResponseEntity.status(HttpStatus.OK).body("Order sent");		
	}

}
