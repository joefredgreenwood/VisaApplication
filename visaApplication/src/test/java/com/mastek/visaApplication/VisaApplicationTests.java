package com.mastek.visaApplication;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.visaApplication.entities.PersonalDetails;


import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.services.VisaApplicationServices;

@SpringBootTest
class VisaApplicationTests {
	
	@Autowired
	VisaApplicationServices visappDAO;
	
	@Autowired
	PaymentDAO payDAO;


	@Test // test add applicant details 
	void testAddApplicant() {
	PersonalDetails appd = new PersonalDetails();
	appd.setPassportNo(1111111111);
	appd.setContactLanguage("English");

	}

	@Test
		void testAddPayment() {
			Payment pay = new Payment();
			pay.setPaymentRef(12345);
			pay.setTotalFee(12.50);
			
			pay = payDAO.save(pay);
			System.out.println(pay);
			assertNotNull(pay, "Payment not Added");


}
	
}
