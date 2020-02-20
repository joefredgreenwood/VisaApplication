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
import com.mastek.visaApplication.entities.Countries;
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
public class UpdateTests {
	
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
	void testUpdatePersonalDetails() {
		PersonalDetails perd = perddao.findById(696969).get();
		System.out.println("Personal Details Fetched: "+perd);
		perd.setPassportNo(696969);
		perd.setApplicantSalutation(Salutation.MR);
		perd.setFirstName("Gerry");
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
		System.out.println("Updated Personal Details: "+perd);
	}
	
	
	//@Test
		void testUpdateApplications() {
			ApplicationForm appForm = appFormDAO.findById(76).get();
			System.out.println("Application Form Fetched: "+appForm);
			appForm.setApplicationDate("17/02/2020");
			appForm.setDurationOfVisa(5);
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
			
			appForm = appFormDAO.save(appForm);
			System.out.println("Updated Application: "+appForm);
		}
		
		
		//@Test
		void testUpdatePayments() {
			Payment pay = payDAO.findById(75).get();
			System.out.println("Payment Fetched: "+pay);
			pay.setTotalFee(33.69);
			pay = payDAO.save(pay);
			System.out.println("Updated Payment: "+pay);
		}
		
		
		//@Test
				void testUpdateCountries() {
					Countries cou = couDAO.findById(47).get();
					System.out.println("Country Fetched: "+cou);
					cou.setCountryName("Finland");
					cou = couDAO.save(cou);
					System.out.println("Updated Country: "+cou);
				}

				
				//@Test
				void testUpdateLanguages() {
					Languages lan = lanDAO.findById(74).get();
					System.out.println("Language Fetched: "+lan);
					lan.setLanguageName("English");
					lan = lanDAO.save(lan);
					System.out.println("Updated Language: "+lan);
				}
}
