package com.mastek.visaApplication.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mastek.visaApplication.services.VisaApplicationServices;

@Component 	// declare it as spring component
public class APIConfig
			 extends ResourceConfig{	// configure the service classes using resourceConfig
	
	public APIConfig() {
		// register each service class to enable service as PI
		register(VisaApplicationServices.class);
	}

}
