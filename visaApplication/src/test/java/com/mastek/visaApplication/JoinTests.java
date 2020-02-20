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
import com.mastek.visaApplication.entities.ApplicationForm;
import com.mastek.visaApplication.entities.ApplicationFormListeners;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.entities.PersonalDetails;
import com.mastek.visaApplication.services.VisaApplicationServices;


@SpringBootTest
public class JoinTests {
	
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
			void testAssignPaymentToPersonalDetails() {
			Payment pay = visaServices.assignPaymentToPersonalDetails(234567, 84);
			}
			
			//@Test
			void testAssignApplicationToPersonalDetails() {
			ApplicationForm app = visaServices.assignApplicationToPersonalDetails(123456, 73);
			}
			
			//@Test
			void testAssignApplicationToCountry() {
			ApplicationForm app = visaServices.assignApplicationFormToCountry(73, 43);
			}
			
			//@Test
			void testPersonalDetailsToCountryOfBirth() {
			PersonalDetails perd = visaServices.assignBirthPlaceToPersonalDetails(123456, 43);
			}
			
			//@Test
			void testPersonalDetailsToCountryOfNationality() {
			PersonalDetails perd = visaServices.assignNationalityToPersonalDetails(123456, 43);
			}
			
			//@Test
			void testPersonalDetailsToLanguage() {
			PersonalDetails perd = visaServices.assignLanguageToPersonalDetails(123456, 48);
			}

}
