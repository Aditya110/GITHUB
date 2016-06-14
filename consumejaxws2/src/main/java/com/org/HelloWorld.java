package com.org;

import javax.jws.WebService;

@WebService(targetNamespace = "http://samplejax.se.mulesoft.com/", name = "HelloService")
public interface HelloWorld {
	
	
ResponseType sayHi();

}