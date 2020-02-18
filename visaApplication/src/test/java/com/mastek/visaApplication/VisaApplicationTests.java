package com.mastek.visaApplication;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.visaApplication.dao.CountriesDAO;
import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.dao.IssueingAuthorityDAO;
import com.mastek.visaApplication.dao.LanguagesDAO;
import com.mastek.visaApplication.entities.Countries;
import com.mastek.visaApplication.entities.DNADatabase;
import com.mastek.visaApplication.entities.IssueingAuthority;
import com.mastek.visaApplication.entities.Languages;
import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.services.VisaApplicationServices;


@SpringBootTest
class VisaApplicationTests {
	@Autowired
	DNADatabaseDAO dnadao;

	@Autowired
	VisaApplicationServices visappDAO;

	@Autowired
	PaymentDAO payDAO;
	
	@Autowired
	CountriesDAO couDAO;
	
	@Autowired
	LanguagesDAO lanDAO;
	
	@Autowired
	IssueingAuthorityDAO issAuthDAO;
//
//
//	@Test // test add applicant details 
//	void testAddApplicant() {
//	PersonalDetails appd = new PersonalDetails();
//	appd.setPassportNo(1111111111);
//	appd.setContactLanguage("English");
//
//	}

	//@Test
	void testAddApplicant() {
	}

	@Test
	void testAddPayment() {
		Payment pay = new Payment();
		pay.setTotalFee(16.50);

		pay = payDAO.save(pay);
		System.out.println(pay);
		assertNotNull(pay, "Payment not Added");
	}
	
	@Test
		void testDeletePaymentById() {
		payDAO.deleteById(31);
	}

//	@Test
//	void testAddDNA() {
//		DNADatabase dna = new DNADatabase();
//		dna.setFirstName("Joe");
//		dna.setLastName("Bramhall");
//		dna.setPassportNumber(111111);
//		dna.setCrimeDescription("Stealing");
//		dna.setCrimeDate("20/01/1997");
//
//		dna=dnadao.save(dna);
//		System.out.println(dna);
//	}
	
	//@Test
	void testAddCountry() {
		Countries cou = new Countries();
		cou.setCountryName("Brazil");
		
		cou = couDAO.save(cou);
		System.out.println(cou);
		
	}
	
	//@Test
	void testAddLanguages() {
		Languages lan = new Languages();
		lan.setLanguageName("Brazilian");
		
		lan = lanDAO.save(lan);
		System.out.println(lan);
		
	}
	
	//@Test
	void testAddIssueingAuthority() {
		IssueingAuthority issAuth = new IssueingAuthority();
		issAuth.setIssueingAuthorityName("Brazilian Government");
		
		issAuth = issAuthDAO.save(issAuth);
		System.out.println(issAuth);
		
	}

}

