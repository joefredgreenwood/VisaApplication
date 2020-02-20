package com.mastek.visaApplication;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.visaApplication.dao.ApplicationFormDAO;
import com.mastek.visaApplication.dao.CountriesDAO;
import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.dao.LanguagesDAO;
import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.dao.PersonalDetailsDAO;
import com.mastek.visaApplication.entities.ApplicationForm;
import com.mastek.visaApplication.entities.ApplicationFormListeners;
import com.mastek.visaApplication.entities.Countries;
import com.mastek.visaApplication.entities.Languages;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.entities.PersonalDetails;
import com.mastek.visaApplication.services.VisaApplicationServices;


@SpringBootTest
public class ListTests {

	
	@Autowired
	VisaApplicationServices visaServices;
	

	@Autowired
	DNADatabaseDAO dnadao;

	@Autowired
	PaymentDAO payDAO;


	@Autowired
	PersonalDetailsDAO perddao;


	@Autowired
	ApplicationFormDAO appFormDAO;
	
	@Autowired
	CountriesDAO couDAO;

	@Autowired
	LanguagesDAO lanDAO;

	

	@Autowired
	ApplicationFormListeners appL;

	@Autowired
	VisaApplicationServices visaAppServices;
	
	
	
	
	
	//@Test
		void testListPersonalDetails() {
			Iterable<PersonalDetails> pdets = perddao.findAll();
			assertNotNull(pdets, "Personal Details Not Found");
			for(PersonalDetails personalDetails : pdets) {
				System.out.println(personalDetails);
			}
			}
	
	
	
	//@Test
	void testListApplications() {
		Iterable<ApplicationForm> appforms = appFormDAO.findAll();
		assertNotNull(appforms, "Applications Not Found");
		for(ApplicationForm applicationForm : appforms) {
			System.out.println(applicationForm);
		}
		}
	
	
	//@Test
			void testListPayments() {
				Iterable<Payment> pays = payDAO.findAll();
				assertNotNull(pays, "Payment Not Found");
				for(Payment payment : pays) {
					System.out.println(payment);
				}
				}
	
	
	//@Test
	void testListCountries() {
		Iterable<Countries> counts = couDAO.findAll();
		assertNotNull(counts, "Countries Not Found");
		for(Countries countries : counts) {
			System.out.println(countries);
		}
	}
	
	
	//@Test
	void testListLanguages() {
		Iterable<Languages> langs = lanDAO.findAll();
		assertNotNull(langs, "Languages Not Found");
		for(Languages languages : langs) {
			System.out.println(languages);
		}
		}
	
	
	
		
			
	
	
	
}
