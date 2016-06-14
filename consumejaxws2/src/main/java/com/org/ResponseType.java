package com.org;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name = "ResponseJax")

@XmlType(propOrder = { "name", "id" })
public class ResponseType {

	String name;
	String id;
	
	@XmlElement(name = "EmpId")
	@XmlSchemaType(name = "http://samplejax.se.mulesoft.com")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name = "EmpName")
	@XmlSchemaType(name = "http://samplejax.se.mulesoft.com")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Test Respone "+this.id+" ::"+this.name;
	}
	
}
