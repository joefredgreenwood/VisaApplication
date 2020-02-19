package com.mastek.visaApplication.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.visaApplication.entities.Languages;

@Path("/visaapp/")
public interface LanguagesAPI {
	
	// http://localhost:7777/visaapp/languages/list
			@GET
			@Path("/languages/list")
			@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
			public Iterable<Languages> listAllLanguages();
			
			// http://localhost:7777/visaapp/languages/find/
			@GET
			@Path("/languages/find/{languageId}")
			@Produces({MediaType.APPLICATION_JSON})
			public Languages findByLanguageId(@PathParam("languageId") int languageId);

			// http://localhost:7777/visaapp/languages/register
			@POST
			@Path("/languages/register")
			@Consumes (MediaType.APPLICATION_FORM_URLENCODED)
			@Produces(MediaType.APPLICATION_JSON)
			public Languages registerNewLanguages(@BeanParam Languages newLanguage);

}
