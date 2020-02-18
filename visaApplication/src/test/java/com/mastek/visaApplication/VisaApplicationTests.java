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

import com.mastek.visaApplication.entities.Gender;

import com.mastek.visaApplication.entities.IssueingAuthority;
import com.mastek.visaApplication.entities.Languages;

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

	CountriesDAO couDAO;
	
	@Autowired
	LanguagesDAO lanDAO;
	
	@Autowired
	IssueingAuthorityDAO issAuthDAO;



	@Test // test add applicant details 
	void testAddApplicant() {
	PersonalDetails appd = new PersonalDetails();
	
	appd.setPassportNo(333333);
	appd.setContactLanguage("English");
	appd.setApplicantSalutation(Salutation.Mr);
	appd.setFirstName("Luke");
	appd.setMiddleName("N/A");
	appd.setFamilyName("Mellor");
	appd.setOtherNames("N/A");
	appd.setApplicantGender(Gender.Male);
	appd.setDateOfBirth("03/07/1995");
	appd.setCountryOfBirth("Italy");
	appd.setPlaceOfBirth("Rome");
	appd.setNationality("Italian");
	appd.setDoYouHaveAnyOtherNationality(false);
	appd.setApplicantRelationship(Relationship.Single);
	appd.setOwnershipStatusOfHome("Renting");
	appd.setAddress("Via delle Fornaci, 11, 00100 Roma RM, Italy");
	appd.setHowLongHaveYouLivedAtThisAddress("7 Years");
	appd.setIsThisYourCorrespondenceAddress(true);
	appd.setTelephoneNumber(0323324123);
	appd.setCanBeContactedByTelephone(true);
	appd.setWhereDoYouUseThisNumber("Personal");
	appd.setContactEmail("LukeM@outlook.com");
	appd.setWhoDoesThisEmailBelongTo("myself");
	appd.setSecondaryEmail("N/A");
	appd.setDrivingLicense(true);
	appd.setDoYouHaveAValidNationalIdentityCard(true);
	appd.setPassportIssueDate("01/03/2015");
	appd.setPassportExpiryDate("01/03/2025");
	appd.setCountryOfNationality("Italy");
	appd.setIssuingAuthority("Italian Govt");
	appd.setDoYouHaveAUkDriversLicense(false);
	appd.setDoYouHaveAUkNationalInsuranceNumber(false);
	appd.setNationalInsuranceNumber("N/A");
	appd.setDependantPassportNo(2221113);
	appd.setDependantFamilyName("Mellor");
	appd.setDependantSalutation(Salutation.Mr);
	appd.setDependantGender(Gender.Male);
	appd.setDependantGivenName("George");
	appd.setDependantRelationshipToYou("Father");
	appd.setDependantNationalitySameAsApplicant("Italian");
	appd.setDependantCountryOfNationality("Italy");
	appd.setDependantDateOfBirth("02/06/1975");
	
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


		pay = payDAO.save(pay);
		System.out.println(pay);
		assertNotNull(pay, "Payment not Added");
	}
	
	@Test
	void testDeletePaymentById() {
	payDAO.deleteById(31);
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

