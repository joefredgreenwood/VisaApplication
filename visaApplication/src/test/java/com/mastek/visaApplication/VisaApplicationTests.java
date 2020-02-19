package com.mastek.visaApplication;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mastek.visaApplication.dao.ApplicationFormDAO;
import com.mastek.visaApplication.dao.CountriesDAO;
import com.mastek.visaApplication.dao.DNADatabaseDAO;
import com.mastek.visaApplication.entities.ApplicationForm;

import com.mastek.visaApplication.entities.ApplicationFormListeners;
import com.mastek.visaApplication.entities.Countries;
import com.mastek.visaApplication.entities.DNADatabase;
import com.mastek.visaApplication.entities.EmploymentStatus;
import com.mastek.visaApplication.entities.Gender;
import com.mastek.visaApplication.entities.IssueingAuthority;
import com.mastek.visaApplication.entities.Languages;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.dao.IssueingAuthorityDAO;
import com.mastek.visaApplication.dao.LanguagesDAO;
import com.mastek.visaApplication.dao.PaymentDAO;
import com.mastek.visaApplication.dao.PersonalDetailsDAO;
import com.mastek.visaApplication.entities.PersonalDetails;
import com.mastek.visaApplication.entities.Relationship;
import com.mastek.visaApplication.entities.Salutation;
import com.mastek.visaApplication.entities.SubmissionType;
import com.mastek.visaApplication.services.VisaApplicationServices;


@SpringBootTest
class VisaApplicationTests {
	//AUTOWIRE DAOS//
	@Autowired
	DNADatabaseDAO dnadao;// May need to Change - naming convention not the same as others
	
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
	IssueingAuthorityDAO issAuthDAO;


	@Autowired
	ApplicationFormListeners appL;

	@Autowired
	VisaApplicationServices visaAppServices;




	

	
	
	@Test
	void testAddApplicant() {

	PersonalDetails appd = new PersonalDetails();

	appd.setPassportNo(333333);
	appd.setContactLanguage("English");
	appd.setApplicantSalutation(Salutation.MR);
	appd.setFirstName("Luke");
	appd.setMiddleName("N/A");
	appd.setFamilyName("Mellor");
	appd.setOtherNames("N/A");
	appd.setApplicantGender(Gender.MALE);
	appd.setDateOfBirth("03/07/1995");
	appd.setCountryOfBirth("Italy");
	appd.setPlaceOfBirth("Rome");
	appd.setNationality("Italian");
	appd.setDoYouHaveAnyOtherNationality(false);
	appd.setApplicantRelationship(Relationship.SINGLE);
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
	appd.setDependantSalutation(Salutation.MR);
	appd.setDependantGender(Gender.MALE);
	appd.setDependantGivenName("George");
	appd.setDependantRelationshipToYou("Father");
	appd.setDependantNationalitySameAsApplicant("Italian");
	appd.setDependantCountryOfNationality("Italy");
	appd.setDependantDateOfBirth("02/06/1975");

	appd = perddao.save(appd);
	System.out.println(appd);
	assertNotNull(appd, "applicant not added");

	}


	/*@Test
	void testTerrorism() {
		VisaApplicationServices visaServices= new VisaApplicationServices();
		ApplicationForm app = new ApplicationForm();

		app.setHaveYouEnteredUKIllegally(true);
		app.setHaveYouStayedBeyondYourVisa(true);
		visaServices.terrorTest(app);
		visaServices.testTravelHistory(app);
		visaServices.immgrationTest(app);
		visaServices.overallDecision(app);
		System.out.println(visaServices.getDecision());
}				
*/
	

	@Test
	void testAddPayment() {
	Payment pay = new Payment();
	pay.setTotalFee(14.50);

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




	@Test

	void testAddApplicationForm() {
		ApplicationForm appForm = new ApplicationForm(); 

		appForm.setApplicationDate("17/02/2020");
		appForm.setDurationOfVisa(4);
		appForm.setSubmissionType(SubmissionType.ONLINE);
		appForm.setPlannedArriveUK("20/05/2020");
		appForm.setPlannedDepartUK("20/09/2020");
		appForm.setVisaContactNumberUK(0244123453);
		appForm.setVisaContactNumberOutsideUK(0744123453);
		//add contact language
		appForm.setDetailsOfVisit("Example Details of Visit");
		appForm.setWhatYouPaidFor("Accomodation and Flights");
		appForm.setPayAmount(1000.00);
		appForm.setWhoWillBePayingYou("Family member");
		appForm.setAnyoneRelyOnYouFinancially(false);
		appForm.setReceivedAnyUKPublicFunds(false);
		appForm.setWhereDoYouPlanToStay("With Friends");
		appForm.setAddressOfWhereYouAreStaying("Example Address");
		appForm.setDoYouHaveFamilyInUK(true);
		appForm.setWhyAreTheyHelpingPay("They want to see me");
		appForm.setHowMuchFamilyPaying(3000.00);
		appForm.setWillAnyoneBePayingTowardsVisit(true);
		appForm.setWhoWillBePayingTowardsVisit("Family and Partner");
		appForm.setMonthlySpend(700.00);
		appForm.setPlannedUKSpending(2000.00);
		appForm.setOtherIncomeOrSavings(true);
		appForm.setDiscribeYourJob("Job Description");
		appForm.setSalaryAfterTax(20000.00);
		appForm.setJobTitle("Builder");
		appForm.setEmployersName("Example Company");
		appForm.setEmployersAddress("Employers Address");
		appForm.setEmployersPhoneNumber(0276453213);
		appForm.setStartedWorkingForEmployer("01/01/2004");
		appForm.setEmploymentStatus(EmploymentStatus.FULLTIME);
		appForm.setHadMedicalTreatmentInUK(false);
		appForm.setHaveYouEnteredUKIllegally(false);
		appForm.setHaveYouStayedBeyondYourVisa(false);
		appForm.setHaveYouBreachedVisaConditions(false);
		appForm.setHaveYouReceivedPublicFundsWithoutPermission(false);
		appForm.setHaveYouGivenFalseInfoOnVisa(false);
		appForm.setHaveYouBeenToUKInLast10Years(true);
		//countries question 
		appForm.setRefusedVisa(true);
		if (appForm.getRefusedVisa()) {
			appForm.setRefusedVisaReason("Add Reason");
		}
		else {
				appForm.setRefusedVisaReason(null);
			}
		appForm.setRefusedEntryAtBorder(false);
		if (appForm.getRefusedEntryAtBorder()) {
			appForm.setRefusedEntryAtBorderReason("Add Reason");
		}
		else {
				appForm.setRefusedEntryAtBorderReason(null);
			}
		appForm.setRefusedPermissionToStay(true);
		if (appForm.getRefusedPermissionToStay()) {
			appForm.setRefusedPermissionToStayReason("Add Reason");	
		}
		else {
			appForm.setRefusedPermissionToStayReason(null);
		}
		appForm.setRefusedAsylum(false);
		if (appForm.getRefusedAsylum()) {
			appForm.setRefusedAsylumReason("Add Reason");	
		}
		else {
			appForm.setRefusedAsylumReason(null);
		}
		appForm.setDeportedFromCountry(true);
		if(appForm.getDeportedFromCountry()) {
			appForm.setDeportedFromCountryReason("Add Reason");
		}
		else {
			appForm.setDeportedFromCountryReason(null);
		}
		appForm.setRemovedFromCountry(false);
		if (appForm.getRemovedFromCountry()) {
			appForm.setRemovedFromCountryReason("Add Reason");
		} 
		else {
			appForm.setRemovedFromCountryReason(null);
		}
		appForm.setRequiredToLeaveCountry(true);
		if (appForm.getRequiredToLeaveCountry()) {
			appForm.setRequiredToLeaveCountryReason("Add Reason");
		}
		else {
			appForm.setRequiredToLeaveCountryReason(null);
		}
		appForm.setExcludedOrBannedFromEntry(false);
		if (appForm.getExcludedOrBannedFromEntry()) {
			appForm.setExcludedOrBannedFromEntryReason("Add Reason");
		}
		else {
			appForm.setExcludedOrBannedFromEntryReason(null);
		}
		appForm.setConfirmReadInfoOnTerrorism(true);
		appForm.setHaveYouJustifiedOrEncouragedTerrorism(false);
		if (appForm.getHaveYouJustifiedOrEncouragedTerrorism()) {
			appForm.setHaveYouJustifiedOrEncouragedTerrorismReason("Add Reason");
		}
		else { 
			appForm.setHaveYouJustifiedOrEncouragedTerrorismReason(null);
		}
		appForm.setHaveYouBeenAMemberOfTerroristOrginisation(false);
		if (appForm.getHaveYouBeenAMemberOfTerroristOrginisation()) {
			appForm.setHaveYouBeenAMemberOfTerroristOrginisationReason("Add Reason");
		}
		else {
			appForm.setHaveYouBeenAMemberOfTerroristOrginisationReason(null);	
		}
		appForm.setHaveYouSupportedTerrorism(false); 
		if (appForm.getHaveYouSupportedTerrorism()) {
			appForm.setHaveYouSupportedTerrorismReason("Add Reason");
		}
		else {
			appForm.setHaveYouSupportedTerrorismReason(null);
		}
		appForm.setHaveYouBeenSuspectedOrInvolvedInWarCrimes(true);
		if (appForm.getHaveYouBeenSuspectedOrInvolvedInWarCrimes()) {
			appForm.setHaveYouBeenSuspectedOrInvolvedInWarCrimesReason("Add Reason");
		}
		else {
			appForm.setHaveYouBeenSuspectedOrInvolvedInWarCrimesReason(null);
		}
		appForm.setAnyOtherInfoAboutCharacter(false);
		if (appForm.getAnyOtherInfoAboutCharacter()) {
			appForm.setAnyOtherInfoAboutCharacterReason("Add Reason");
		}
		else {
			appForm.setAnyOtherInfoAboutCharacterReason(null);
		}
		appForm.setAnyOtherActivitiesShowNotGoodPerson(false);
		if (appForm.getAnyOtherActivitiesShowNotGoodPerson()) {
			appForm.setAnyOtherActivitiesShowNotGoodPersonReason("Add Reason");
		}
		else {
			appForm.setAnyOtherActivitiesShowNotGoodPersonReason(null);
		}
		appForm.setWorkedForOrginisationDangerousToUKOrAllies(false);
		if (appForm.getWorkedForOrginisationDangerousToUKOrAllies()) {
			appForm.setWorkedForOrginisationDangerousToUKOrAlliesReason("Add Reason");
		}
		else {
			appForm.setWorkedForOrginisationDangerousToUKOrAlliesReason(null);
		}
		appForm.setHaveYouExpressedAnyExtremistViews(false);
		if (appForm.getHaveYouExpressedAnyExtremistViews()) {
			appForm.setHaveYouExpressedAnyExtremistViewsReason("Add Reason");
		}
		else {
			appForm.setHaveYouExpressedAnyExtremistViewsReason(null);
		}
		appForm.setHaveYouSupportedExtreamistOrgisisation(false);
		if (appForm.getHaveYouSupportedExtreamistOrgisisation()) {
			appForm.setHaveYouSupportedExtreamistOrgisisationReason("Add Reason");
		}
		else {
			appForm.setHaveYouSupportedExtreamistOrgisisationReason(null);
		}

		appForm = appFormDAO.save(appForm);
		System.out.println(appForm);
		//visaAppServices.DecisionMaker(appForm);
		//System.out.println(visaAppServices.getDecision());


		}

	@Test
	void testMongoCheck() {
		PersonalDetails per = new PersonalDetails();
		ApplicationForm app = new ApplicationForm();
		per.setPassportNo(111140);
		app.setHaveYouBeenAMemberOfTerroristOrginisation(false);
		visaAppServices.overallDecision(app, per);
		System.out.println(visaAppServices.getDecision());
	}



	

	@Test
	void testAddCountry() {
		Countries cou = new Countries();
		cou.setCountryName("Brazil");

		cou = couDAO.save(cou);
		System.out.println(cou);

	}



	@Test
	void testAddLanguages() {
		Languages lan = new Languages();
		lan.setLanguageName("Brazilian");

		lan = lanDAO.save(lan);
		System.out.println(lan);

	}

	@Test
	void testAddIssueingAuthority() {
		IssueingAuthority issAuth = new IssueingAuthority();
		issAuth.setIssueingAuthorityName("Brazilian Government");

		issAuth = issAuthDAO.save(issAuth);
		System.out.println(issAuth);}




	
	
	// DELETE TESTS//
	@Test
	void testDeletePaymentById() {
	payDAO.deleteById(31);
	}
	
	//b
	
/*	@Test
	void testTerrorism() {
		VisaApplicationServices visaServices= new VisaApplicationServices();
		ApplicationForm app = new ApplicationForm();
		
		app.setHaveYouEnteredUKIllegally(true);
		app.setHaveYouStayedBeyondYourVisa(true);
		visaServices.terrorTest(app);
		visaServices.testTravelHistory(app);
		visaServices.immgrationTest(app);
		visaServices.overallDecision(app);
		System.out.println(visaServices.getDecision());
	}*/				



	 




}


