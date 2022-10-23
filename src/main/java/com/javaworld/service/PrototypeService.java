package com.javaworld.service;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class PrototypeService {

	String time=LocalDateTime.now().toString();
	int temp=new Random().nextInt(60);
	
	public String getDateTime() {
		return time +"-->>"+temp;
	}
}
