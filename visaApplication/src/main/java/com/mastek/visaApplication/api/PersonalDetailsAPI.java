package com.mastek.visaApplication.api;

import java.util.Set;

import javax.print.attribute.standard.Media;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.mastek.visaApplication.entities.ApplicationForm;
import com.mastek.visaApplication.entities.PersonalDetails;

@Path("/visaapp/")
public interface PersonalDetailsAPI {
	
	// http://localhost:7777/visaapp/personaldetails/list
	@GET
	@Path("/personaldetails/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<PersonalDetails> listAllPersonalDetails();
	
	// http://localhost:7777/visaapp/personaldetails/find/333333
	@GET
	@Path("/personaldetails/find/{passportNo}")
	@Produces({MediaType.APPLICATION_JSON})
	public PersonalDetails findByPassportNo(@PathParam("passportNo") int passportNo);

	// http://localhost:7777/visaapp/personaldetails/register
	@POST
	@Path("/personaldetails/register")
	@Consumes (MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public PersonalDetails registerNewPersonalDetails(@BeanParam PersonalDetails newPersonalDetails);
	
	@GET
	@Path("/personaldetails/applicationform/{passportNo}")
	@Produces({MediaType.APPLICATION_JSON})
	public Set<ApplicationForm> getPersonalApplications(@PathParam("passportNo") int passportNo);

	@POST
	@Path("/personaldetails/applicationform/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public ApplicationForm registerApplicationFormForPersonalDetails(
			@FormParam("passportNo") int passportNo,
			@BeanParam ApplicationForm newApplicationForm);
	
	
}

