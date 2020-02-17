package com.mastek.visaApplication;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.entities.DNADatabase;

@SpringBootTest
class VisaApplicationTests {
	
	
	@Autowired
	DNADatabaseDAO dnadao;

	//@Test
	void testAddApplicant() {
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
