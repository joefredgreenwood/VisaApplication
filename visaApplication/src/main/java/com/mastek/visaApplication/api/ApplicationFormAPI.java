package com.mastek.visaApplication.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.visaApplication.entities.ApplicationForm;

@Path("/visaapp/")	//Url pattern to access the current API interface
public interface ApplicationFormAPI {

	// http://localhost:7777/visaapp/applicationforms/list
	@GET											// this is to let us know we do support the Http method:GET
	@Path("/applicationforms/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<ApplicationForm> listAllApplicationForms();
	
	
	// http://localhost:7777/visaapp/applicationforms/find/2
	@GET														// this is to let us know we do support the Http method:GET
	@Path("/applicationforms/find/{applicationID}")
	@Produces({MediaType.APPLICATION_JSON})
	public ApplicationForm findByApplicationID(@PathParam("applicationID") int applicationID);
	
	// http://localhost:7777/visaapp/applicationforms/register
		@POST
		@Path("/applicationforms/register")
		@Consumes (MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.APPLICATION_JSON)
		public ApplicationForm registerNewApplicationForm(@BeanParam ApplicationForm newApplicationForm);
	
	
}
