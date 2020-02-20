package com.mastek.visaApplication.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.visaApplication.entities.Payment;
@Path("/visaapp/")			// path: is the URl path to access this API
public interface PaymentAPI {
	
				// http://localhost:7777/visaapp/payment/list
				@GET		// GET is used to retrieve the data
				@Path("/payment/list")
				@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
				public Iterable<Payment> listAllPayments();
				
				// http://localhost:7777/visaapp/payment/find/
				@GET
				@Path("/payment/find/{paymentRef}")
				@Produces({MediaType.APPLICATION_JSON})
				public Payment findByPaymentRef(@PathParam("paymentRef") int paymentRef);

				// http://localhost:7777/visaapp/payment/register
				@POST
				@Path("/payment/register")
				@Consumes (MediaType.APPLICATION_FORM_URLENCODED)
				@Produces(MediaType.APPLICATION_JSON)
				public Payment registerNewPayment(@BeanParam Payment newPayment);


}
