package org.paras.turorials.tokenization.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.paras.turorials.tokenization.model.DataModel;

@Path("/accounts")
public class AccountResource {

	@GET
	@Path("/{account}")
	@Produces("application/json")
	public Response getTokenForAccount(@PathParam("account") String account) {
		String token = String.valueOf((Long.parseLong(account) * 2));
		DataModel model = new DataModel();
		model.setAccount(account);
		model.setToken(token);

		return Response.status(200).entity(model).build();
	}
}
