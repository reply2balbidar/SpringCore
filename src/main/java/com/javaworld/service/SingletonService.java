package com.javaworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {

	@Autowired
//	private PrototypeService prototypeService;
	
	public String getDateTime() {
		//return prototypeService.getDateTime();
		return getDateTimes().getDateTime();
	}
	
	@Lookup
	public PrototypeService getDateTimes() {
		return null;
		
	}
}
