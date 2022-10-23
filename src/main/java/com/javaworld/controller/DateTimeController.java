package com.javaworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaworld.service.SingletonService;

@RestController
public class DateTimeController {

	@Autowired
	private SingletonService singIngletonService;
	
	@GetMapping("/getDateTime")
	public List<String> getDateAndTime() throws InterruptedException {
		String response1=singIngletonService.getDateTime();
		Thread.sleep(100);
		String response2=singIngletonService.getDateTime();
		return Arrays.asList(response1,response2);
		
	}
}
