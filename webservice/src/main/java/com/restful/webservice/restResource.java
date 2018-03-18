package com.restful.webservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public class restResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<TORest> get() {
		System.out.println("Get method called");
		restRepo repo = new restRepo();
		return repo.get();
		
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("test")	
	public TORest create(TORest t1) {
		restRepo repo = new restRepo();
		repo.create(t1);
		System.out.println(t1);
		return t1;
	}

}
