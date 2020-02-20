package com.mastek.visaApplication;

import java.util.List;
import java.util.Optional;

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
public class FindTests {


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
	void testFindPaymentByTotalFee() {

		Payment pay = payDAO.findById(85).get();
		System.out.println(pay);


	}
	//@Test
	void findDnaScreeningStatus() {
		PersonalDetails per = perddao.findById(654321).get();
		System.out.println(per.getDnaDatabaseScreeningStatus());
	}
	
	//@Test
	void findAppStatus () {
		ApplicationForm app = appFormDAO.findById(77).get();
		System.out.println(app.getAppQuestionsStatus());
	}

	//@Test
	void findApplicationDetails () {
		ApplicationForm app = appFormDAO.findById(99).get();
		System.out.println(app);
	}
	//@Test
	void findPersonalDetails () {
		PersonalDetails per = perddao.findById(434).get();
		System.out.println(per);
	}
}
