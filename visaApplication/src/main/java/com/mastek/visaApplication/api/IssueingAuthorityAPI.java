package com.mastek.visaApplication.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.visaApplication.entities.Countries;
import com.mastek.visaApplication.entities.IssueingAuthority;

@Path("/visaapp/")
public interface IssueingAuthorityAPI {

	
	// http://localhost:7777/visaapp/issueingauthority/list
			@GET
			@Path("/issueingauthority/list")
			@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
			public Iterable<IssueingAuthority> listAllIssueingAuthorities();
			
			// http://localhost:7777/visaapp/issueingauthority/find/
			@GET
			@Path("/issueingauthority/find/{issueingAuthorityId}")
			@Produces({MediaType.APPLICATION_JSON})
			public IssueingAuthority findByIssueingAuthorityId(@PathParam("issueingAuthorityId") int issueingAuthorityId);

			// http://localhost:7777/visaapp/issueingauthority/register
			@POST
			@Path("/issueingauthority/register")
			@Consumes (MediaType.APPLICATION_FORM_URLENCODED)
			@Produces(MediaType.APPLICATION_JSON)
			public IssueingAuthority registerNewIssueingAuthority(@BeanParam IssueingAuthority newIssueingAuthority);
	
	
	
	
	
}
