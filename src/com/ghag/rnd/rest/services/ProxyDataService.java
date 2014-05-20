package com.ghag.rnd.rest.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Path("/dataservice/{param1}")
public class ProxyDataService {
	
	@Path("/getGridRows")
	@GET
	@Produces("text/json")
	public DataResponse getGridRows(@PathParam("param1") String param1) {
		System.out.println("from inside getGridRows with param1 = " + param1);
		return new DataResponse();
	}
	
	@Path("/getGridRowsJson")
	@GET
	@Produces("text/json")
	public List<DataRow> getGridRowsJson(@PathParam("param1") String param1) {
		System.out.println("from inside getGridRowsJson with param1 = " + param1);
		List<DataRow> rows = new ArrayList<DataRow>();
		for(int i = 0 ; i < 100 ; i++)
			rows.add(new DataRow(i));
		
		return rows;
	}

}
