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


	//////////////////////////////////////Dependent Fail////////////////////////////////////////////////////////////////////
	//Crime committed by applicant over 10 years ago, by dependent within last 10 years
	@Test
	void testAddPersonalDetailsDependant() {
		PersonalDetails perd = new PersonalDetails();
		perd.setPassportNo(373837);////////////////////////////////////////////////////////////////////////////////////
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
		perd.setDependantPassportNo(262923);///////////////////////////////////////////////////////////////////////////////////
		perd.setDependantFamilyName("Mellor");
		perd.setDependantSalutation(Salutation.MR);
		perd.setDependantGender(Gender.MALE);
		perd.setDependantGivenName("George");
		perd.setDependantRelationshipToYou("Father");
		perd.setDependantNationalitySameAsApplicant("Italian");
		perd.setDependantCountryOfNationality("Italy");
		perd.setDependantDateOfBirth("02/06/1975");

		perd = perddao.save(perd);
//		visaAppServices.mongoDecisionMaker(perd);
//		System.out.println(visaAppServices.mongoDecisionMaker(perd));
//		perd.setDnaDatabaseScreeningStatus(visaAppServices.getMongoDecisionV());
//		perd = perddao.save(perd);

	}


	////////////////////////////////////// Applicant Fail////////////////////////////////////////////////////////////////////
	//Crime committed by applicant within 10 years ago, dependent not committed crime
	//@Test
	void testAddPersonalDetailsApplicant() {
		PersonalDetails perd = new PersonalDetails();
		perd.setPassportNo(111128);////////////////////////////////////////////////////////////////////////////////////
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
		perd.setDependantPassportNo(40);///////////////////////////////////////////////////////////////////////////////////
		perd.setDependantFamilyName("Mellor");
		perd.setDependantSalutation(Salutation.MR);
		perd.setDependantGender(Gender.MALE);
		perd.setDependantGivenName("George");
		perd.setDependantRelationshipToYou("Father");
		perd.setDependantNationalitySameAsApplicant("Italian");
		perd.setDependantCountryOfNationality("Italy");
		perd.setDependantDateOfBirth("02/06/1975");

		perd = perddao.save(perd);
//		visaAppServices.mongoDecisionMaker(perd);
//		System.out.println(visaAppServices.mongoDecisionMaker(perd));
//		perd.setDnaDatabaseScreeningStatus(visaAppServices.getMongoDecisionV());
//		perd = perddao.save(perd);

	}

	//////////////////////////////////////////////Passing Person//////////////////////////////////////////////////////////
	//@Test
	void testAddPersonalDetails() {
		PersonalDetails perd = new PersonalDetails();
		perd.setPassportNo(10);////////////////////////////////////////////////////////////////////////////////////
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
		perd.setDependantPassportNo(20);///////////////////////////////////////////////////////////////////////////////////
		perd.setDependantFamilyName("Mellor");
		perd.setDependantSalutation(Salutation.MR);
		perd.setDependantGender(Gender.MALE);
		perd.setDependantGivenName("George");
		perd.setDependantRelationshipToYou("Father");
		perd.setDependantNationalitySameAsApplicant("Italian");
		perd.setDependantCountryOfNationality("Italy");
		perd.setDependantDateOfBirth("02/06/1975");

		perd = perddao.save(perd);
//		visaAppServices.mongoDecisionMaker(perd);
//		System.out.println(visaAppServices.mongoDecisionMaker(perd));
//		perd.setDnaDatabaseScreeningStatus(visaAppServices.getMongoDecisionV());
//		perd = perddao.save(perd);

	}


}
