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
import com.mastek.visaApplication.entities.Gender;
import com.mastek.visaApplication.entities.PersonalDetails;
import com.mastek.visaApplication.entities.Relationship;
import com.mastek.visaApplication.entities.Salutation;
import com.mastek.visaApplication.services.VisaApplicationServices;


@SpringBootTest
public class TestDNADatabase {
	
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
			void testAddPersonalDetails() {
			PersonalDetails perd = new PersonalDetails();
			perd.setPassportNo(111136);
			perd.setApplicantSalutation(Salutation.MR);
			perd.setFirstName("Barry");
			perd.setMiddleName("N/A");
			perd.setFamilyName("Mellor");
			perd.setOtherNames("N/A");
			perd.setApplicantGender(Gender.MALE);
			perd.setDateOfBirth("03/07/1995");
			perd.setPlaceOfBirth("Rome");
			perd.setDoYouHaveAnyOtherNationality(false);
			perd.setApplicantRelationship(Relationship.SINGLE);
			perd.setOwnershipStatusOfHome("Renting");
			perd.setAddress("Via delle Fornaci, 11, 00100 Roma RM, Italy");
			perd.setHowLongHaveYouLivedAtThisAddress("7 Years");
			perd.setIsThisYourCorrespondenceAddress(true);
			perd.setTelephoneNumber(0323324123);
			perd.setCanBeContactedByTelephone(true);
			perd.setWhereDoYouUseThisNumber("Personal");
			perd.setWhoDoesThisEmailBelongTo("myself");
			perd.setSecondaryEmail("N/A");
			perd.setDrivingLicense(true);
			perd.setDoYouHaveAValidNationalIdentityCard(true);
			perd.setPassportIssueDate("01/03/2015");
			perd.setPassportExpiryDate("01/03/2025");
			perd.setCountryOfNationality("Italy");
			perd.setIssuingAuthority("Italian Govt");
			perd.setDoYouHaveAUkDriversLicense(false);
			perd.setDoYouHaveAUkNationalInsuranceNumber(false);
			perd.setNationalInsuranceNumber("N/A");
			perd.setDependantPassportNo(111111);
			perd.setDependantFamilyName("Mellor");
			perd.setDependantSalutation(Salutation.MR);
			perd.setDependantGender(Gender.MALE);
			perd.setDependantGivenName("George");
			perd.setDependantRelationshipToYou("Father");
			perd.setDependantNationalitySameAsApplicant("Italian");
			perd.setDependantCountryOfNationality("Italy");
			perd.setDependantDateOfBirth("02/06/1975");
			
			   perd = perddao.save(perd);
			    visaAppServices.mongoDecisionMaker(perd);
			    System.out.println(visaAppServices.mongoDecisionMaker(perd));
			    perd.setDnaDatabaseScreeningStatus(visaAppServices.getMongoDecisionV());
			    perd = perddao.save(perd);
			
			}

}
