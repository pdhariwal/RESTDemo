package org.paras.turorials.tokenization.resources;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tokens")
public class TokenResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTokens() {
		return "Hello World!";
	}

}
