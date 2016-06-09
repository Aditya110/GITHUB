package training.rest;
 
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
 
/**
 * Class demonstrating REST component in Mule ESB
 * 
 * @author Middleware School (http://training.middlewareschool.com/mule)
 *
 */
@Path("/")
public class HelloRESTService {
  
	@GET
	@Path("hello/{name}")
	public String sayHello(@PathParam("name") String name) {
		return "Hello " + name + "!";
	}
 
	/**
	 * REST method that returns JSON representation of Customer object.
	 * Return type is controlled by @Produces keyword
	 * @return XML representation of Customer object
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("json/customer")
	public Customer getDemoCustomerJSON() {
		return new Customer();
	}
 
	/**
	 * REST method that returns XML representation of Customer object.
	 * Return type is controlled by @Produces keyword
	 * @return XML representation of Customer object
	 */
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("xml/customer")
	public Customer getDemoCustomerXML() {
		return new Customer();
	}
	
}