package com.mastek.visaApplication;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.entities.DNADatabase;


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



	//@Test
	void testAddApplicant() {
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

	@Test
	void testAddDNA() {
		DNADatabase dna = new DNADatabase();
		dna.setFirstName("Joe");
		dna.setLastName("Bramhall");
		dna.setPassportNumber(111111);
		dna.setCrimeDescription("Stealing");
		dna.setCrimeDate("20/01/1997");

		dna=dnadao.save(dna);
		System.out.println(dna);
	}
}

