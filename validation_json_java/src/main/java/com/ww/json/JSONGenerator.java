package com.ww.json;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ww.person.Person;

public class JSONGenerator implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		String json = eventContext.getMessage().getPayloadAsString();
		
		Person person =  mapper.readValue(json, Person.class);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getAddress());
		
		return null;
	}

}
