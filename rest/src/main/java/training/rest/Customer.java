package training.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Customer{

        String id;
	String name;
	String address;

	@XmlElement
	public String getId() {
		return id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	@XmlElement
	public String getAddress() {
		return address;
	}


	public Customer() {
		this("001", "Middleware School", "London, United Kingdom");
	}

	public Customer(String id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

}