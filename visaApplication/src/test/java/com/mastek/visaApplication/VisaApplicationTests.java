package com.mastek.visaApplication;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.entities.ApplicationForm;
import com.mastek.visaApplication.entities.DNADatabase;


import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.services.VisaApplicationServices;


@SpringBootTest
class VisaApplicationTests {
	@Autowired
	DNADatabaseDAO dnadao;


	@Autowired
	PaymentDAO payDAO;


//	@Test // test add applicant details 
//	void testAddApplicant() {
//	PersonalDetails appd = new PersonalDetails();
//	appd.setPassportNo(1111111111);
//	appd.setContactLanguage("English");
//
//	}

//	//@Test
//	void testAddApplicant() {
//	}
//
//	@Test
//	void testAddPayment() {
//		Payment pay = new Payment();
//		pay.setPaymentRef(12346);
//		pay.setTotalFee(13.50);
//
//		pay = payDAO.save(pay);
//		System.out.println(pay);
//		assertNotNull(pay, "Payment not Added");
//	}
//
//	@Test
//	void testAddDNA() {
//		DNADatabase dna = new DNADatabase();
//		dna.setFirstName("Mike");
//		dna.setLastName("Bramhall");
//		dna.setPassportNumber(111116);
//		dna.setCrimeDescription("Staling");
//		dna.setCrimeDate("20/01/1897");
//
//		dna=dnadao.save(dna);
//		System.out.println(dna);
//	}
	
//	@Test
//	void testTerrorism() {
//		VisaApplicationServices visaServices= new VisaApplicationServices();
//		ApplicationForm app = new ApplicationForm();
//		app.setHaveYouBeenAMemberOfTerroristOrginisation(true);
//		visaServices.terrorTest(app);
//				
//	}
	
	@Test
	void testTerrorism() {
		VisaApplicationServices visaServices= new VisaApplicationServices();
		ApplicationForm app = new ApplicationForm();
		
		app.setHaveYouEnteredUKIllegally(true);
		app.setHaveYouStayedBeyondYourVisa(true);
		visaServices.terrorTest(app);
		visaServices.testTravelHistory(app);
		visaServices.immgrationTest(app);
		visaServices.overallDecision(app);
		System.out.println(visaServices.getDecision());
				
	}

}


