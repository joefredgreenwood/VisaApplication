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

@Path("/visaapp/")
public interface CountriesAPI {

	
	// http://localhost:7777/visaapp/countries/list
		@GET
		@Path("/countries/list")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public Iterable<Countries> listAllCountries();
		
		// http://localhost:7777/visaapp/countries/find/
		@GET
		@Path("/countries/find/{countryId}")
		@Produces({MediaType.APPLICATION_JSON})
		public Countries findByCountryId(@PathParam("countryId") int countryId);

		// http://localhost:7777/visaapp/country/register
		@POST
		@Path("/country/register")
		@Consumes (MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.APPLICATION_JSON)
		public Countries registerNewCountry(@BeanParam Countries newCountry);
}
