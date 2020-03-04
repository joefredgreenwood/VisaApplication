/*package com.mastek.visaApplication;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
import com.mastek.visaApplication.entities.Countries;
import com.mastek.visaApplication.entities.DNADatabase;
import com.mastek.visaApplication.entities.EmploymentStatus;
import com.mastek.visaApplication.entities.Gender;
import com.mastek.visaApplication.entities.Languages;
import com.mastek.visaApplication.entities.Payment;
import com.mastek.visaApplication.entities.PersonalDetails;
import com.mastek.visaApplication.entities.Relationship;
import com.mastek.visaApplication.entities.Salutation;
import com.mastek.visaApplication.entities.SubmissionType;
import com.mastek.visaApplication.services.VisaApplicationServices;


@SpringBootTest
public class AddTests {
	
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
	
	@Test
		void testAddPersonalDetails() {
		PersonalDetails perd = new PersonalDetails();
		perd.setPassportNo(232425);
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
		perd.setDependantPassportNo(2221113);
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
		
		
		
		
		
	
		
		
		@Test
		void testAddApplicationForm() {
			ApplicationForm appForm = new ApplicationForm(); 

			appForm.setApplicationDate("20/02/2020");
			appForm.setDurationOfVisa(14);
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
		        visaAppServices.DecisionMaker(appForm);
		        System.out.println(visaAppServices.DecisionMaker(appForm));
		        appForm.setAppQuestionsStatus(visaAppServices.getDecision());
		        System.out.println(appForm);
		        appFormDAO.save(appForm);
			


			}
		
		
		
		@Test
				void testAddPayment() {
				Payment pay = new Payment();
				pay.setTotalFee(84.50);

				pay = payDAO.save(pay);
				System.out.println(pay);
				assertNotNull(pay, "Payment not Added");
				}
				
				
				
				@Test
				void testAddCountry() {
					Countries cou = new Countries();
					cou.setCountryName("Japan");

					cou = couDAO.save(cou);
					System.out.println(cou);

				}
				
				
				
				@Test
				void testAddLanguages() {
					Languages lan = new Languages();
					lan.setLanguageName("Japanese");


					lan = lanDAO.save(lan);
					System.out.println(lan);

				}
				
				
				
				

}
*/