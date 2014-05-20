package com.ghag.rnd.rest.services.crud;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.map.ObjectMapper;

@Path("/party")
public class PartyRestService {
	
	private PartyService service = new PartyServiceMapImpl();
	
	@GET
	@Path("/listall")
	@Produces("text/json")
	public Collection<Party> getAll(){
		
		System.out.println("inside getAll()");
		return service.getAll();
	}
	
	@GET
	@Path("/listallEx")
	@Produces("application/json")
	public Parties getAllEx(){
		
		System.out.println("inside getAllEx()");
		return new Parties(service.getAll());
	}
	
	
	@GET
	@Path("/{partyId}")
	@Produces("text/json")
	public Party getPartyInfo(@PathParam("partyId") String partyId){
		return service.getByPk(Long.parseLong(partyId));
	}
	
	@GET
	@Path("/{partyId}/update")
	@Produces("text/json")
	public boolean updatePartyInfo(@PathParam("partyId") String partyId, @QueryParam("description") String description){
		Party party = service.getByPk(Long.parseLong(partyId));
		party.setDescription(description);
		service.update(party);
		return true;
	}
	
	@POST
	@Path("/updateEx")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void updatePartyInfoEx(@FormParam("partyId") String partyId,
			@FormParam("name") String name,
			@FormParam("address") String address,
			@FormParam("telephone") String telephone,
			@FormParam("description") String description,
			@Context HttpServletRequest servletRequest,
			@Context HttpServletResponse servletResponse
		) throws IOException{
		
		Party party = service.getByPk(Long.parseLong(partyId));
		party.setName(name);
		party.setAddress(address);
		party.setTelephone(telephone);
		party.setDescription(description);
		service.update(party);
		
		servletResponse.sendRedirect("http://172.16.84.129:8081/jqueryrest/partylist.html");
	}
	
	@POST
	@Path("/updateExEx")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void updatePartyInfoExEx(MultivaluedMap<String, String>	formParams, @Context HttpServletRequest servletRequest,
			@Context HttpServletResponse servletResponse
		) throws IOException{
		
		System.out.println(formParams);
		
		String partyId = formParams.get("partyId").get(0);
		String name = formParams.get("name").get(0);
		String address = formParams.get("address").get(0);
		String telephone = formParams.get("telephone").get(0);
		String description = formParams.get("description").get(0);
	
		Party party = service.getByPk(Long.parseLong(partyId));
		party.setName(name);
		party.setAddress(address);
		party.setTelephone(telephone);
		party.setDescription(description);
		service.update(party);
		
		servletResponse.sendRedirect("http://172.16.84.129:8081/jqueryrest/partylist.html");
	}
	
	@POST
	@Path("/directUpdate")
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_JSON)
	public void updatePartyInfoExExEx(Party input, @Context HttpServletResponse servletResponse) throws IOException{
		
		System.out.println("input param party object"+input);

		Party party = service.getByPk(input.getPartyId());
		party.setName(input.getName());
		party.setAddress(input.getAddress());
		party.setTelephone(input.getTelephone());
		party.setDescription(input.getDescription());
		service.update(party);
		
		servletResponse.sendRedirect("http://172.16.84.129:8081/jqueryrest/partylist.html");

	}
	
	@GET
	@Path("/{partyId}/delete")
	@Produces("text/json")
	public boolean deletePartyInfo(@PathParam("partyId") String partyId){
		Party party = service.getByPk(Long.parseLong(partyId));
		service.delete(party);
		return true;
	}

}
