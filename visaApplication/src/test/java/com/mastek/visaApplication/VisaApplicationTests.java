package com.mastek.visaApplication;


import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.entities.DNADatabase;
import com.mastek.visaApplication.entities.Gender;
import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.dao.PersonalDetailsDAO;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.entities.PersonalDetails;
import com.mastek.visaApplication.entities.Relationship;
import com.mastek.visaApplication.entities.Salutation;
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
	PersonalDetailsDAO perddao;


	@Test // test add applicant details 
	void testAddApplicant() {
	PersonalDetails appd = new PersonalDetails();
	
	appd.setPassportNo(1111111111);
	appd.setContactLanguage("English");
	appd.setApplicantSalutation(Salutation.Mr);
	appd.setFirstName("Shujahat");
	appd.setMiddleName("ali");
	appd.setFamilyName("bhatti");
	appd.setOtherNames("saj");
	appd.setApplicantGender(Gender.Male);
	appd.setDateOfBirth("05/02/1996");
	appd.setCountryOfBirth("United Kingdom");
	appd.setPlaceOfBirth("Birmingham");
	appd.setNationality("British");
	appd.setDoYouHaveAnyOtherNationality(false);
	appd.setApplicantRelationship(Relationship.Married);
	appd.setOwnershipStatusOfHome("Renting");
	appd.setAddress("123 Coventry Road, Birmingham,CV10 9AQ");
	appd.setHowLongHaveYouLivedAtThisAddress("5 Years");
	appd.setIsThisYourCorrespondenceAddress(true);
	appd.setTelephoneNumber(0123324123);
	appd.setWhereDoYouUseThisNumber("Personal");
	appd.setContactEmail("saj@outlook.com");
	appd.setWhoDoesThisEmailBelongTo("myself");
	appd.setSecondaryEmail("N/A");
	appd.setDrivingLicense(true);
	appd.setDoYouHaveAValidNationalIdentityCard(true);
	appd.setPassportIssueDate("01/01/2013");
	appd.setPassportExpiryDate("01/01/2023");
	appd.setCountryOfNationality("United Kingdom");
	appd.setIssuingAuthority("HM Government");
	appd.setDoYouHaveAUkDriversLicense(true);
	appd.setDoYouHaveAUkNationalInsuranceNumber(true);
	appd.setNationalInsuranceNumber("SA156 7666 PA");
	appd.setDependantFamilyName("bhatti");
	appd.setDependantSalutation(Salutation.Dr);
	appd.setDependantGivenName("Mo");
	appd.setDependantRelationshipToYou("Father");
	appd.setDependantNationalitySameAsApplicant("British");
	appd.setDependantCountryOfNationality("United Kingdom");
	appd.setDependantDateOfBirth("03/11/1971");
	
	appd = perddao.save(appd);
	System.out.println(appd);
	assertNotNull(appd, "applicant not added");

	}

	

	@Test
	void testAddPayment() {
		Payment pay = new Payment();
		pay.setTotalFee(14.50);

		pay = payDAO.save(pay);
		System.out.println(pay);
		assertNotNull(pay, "Payment not Added");
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

}

