package com.org;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService(endpointInterface = "com.org.HelloWorld",
serviceName = "HelloWorldService")
public class HelloWorldImpl implements HelloWorld {

	@Override
	@WebMethod()
	public ResponseType sayHi()
	{
	  ResponseType r1 = new ResponseType();
	  r1.setId("123");
	  r1.setName("Asif");
	  return r1;
	}
	
}
