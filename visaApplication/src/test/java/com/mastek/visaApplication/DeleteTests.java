package com.mastek.visaApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.visaApplication.dao.ApplicationFormDAO;
import com.mastek.visaApplication.dao.CountriesDAO;
import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.dao.LanguagesDAO;
import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.dao.PersonalDetailsDAO;
import com.mastek.visaApplication.entities.ApplicationFormListeners;
import com.mastek.visaApplication.services.VisaApplicationServices;

@SpringBootTest
public class DeleteTests {
	
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
		void testDeletePersonalDetailsById() {
		perddao.deleteById(31);
			}
		
		
		
		
		//@Test
		void testDeleteApplicationById() {
		appFormDAO.deleteById(31);
		}
		
		
		
		
		
		
		//@Test
		void testDeletePaymentById() {
		payDAO.deleteById(78);
		}
			
			
			
			//@Test
			void testDeleteCountryById() {
			couDAO.deleteById(19);
			}
			
			
			
			//@Test
			void testDeleteLanguageById() {
			lanDAO.deleteById(64);
			}
			
			
			
			

}
