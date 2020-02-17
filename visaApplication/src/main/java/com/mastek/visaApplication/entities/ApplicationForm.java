package com.mastek.visaApplication.entities;

public class ApplicationForm {
	//VISA DETAILS// 
	String applicationDate; 
	int durationOfVisa; 
	//SubmissionType SubmissionType; //enum
	String plannedArriveUK;
	String plannedDepartUK; 
	long visaContactNumberUK;
	long visaContactNumberOutsideUK;
	//language visaContactLanguage; // links to another table??

	//UK INFOMATION//
	String detailsOfVisit; 
	String whatYouPaidFor; 
	int payAmount; 
	String whoWillBePayingYou; 
	Boolean anyoneRelyOnYouFinancially; 
	Boolean receivedAnyUKPublicFunds; 
	String whereDoYouPlanToStay; 
	String addressOfWhereYouAreStaying; 
	Boolean doYouHaveFamilyInUK; 
	String whyAreTheyHelpingPay; 
	double howMuchFamilyPaying; 
	Boolean willAnyoneBePayingTowardsVisit; 
	String whoWillBePayingTowardsVisit;
	double monthlySpend; 
	double plannedUKSpending;
	Boolean otherIncomeOrSavings; 
	String discribeYourJob;
	Double salaryAfterTax;
	String jobTitle; 
	String employersName;
	String employersAddress;
	long employersPhoneNumber;
	String startedWorkingForEmployer;
	//EmploymentStatus EmploymentStatus; //enum
	Boolean hadMedicalTreatmentInUK; 

	//IMMERGRATION QUESTIONS//
	Boolean haveYouEnteredUKIllegally;
	Boolean haveYouStayedBeyondYourVisa; 
	Boolean haveYouBreachedVisaConditions; 
	Boolean haveYouReceivedPublicFundsWithoutPermission;
	Boolean haveYouGivenFalseInfoOnVisa; 
	Boolean haveYouBeenToUKInLast10Years;

	//TRAVEL HISTORY//
	//Countries countriesTraveled; <make a collection>
	int numberOfTimesTravelled; 
	Boolean refusedVisa;
	Boolean refusedEntryAtBorder;
	Boolean refusedPermissionToStay;
	Boolean refusedAsylum; 
	Boolean deportedFromCountry; 
	Boolean removedFromCountry;
	Boolean requiredToLeaveCountry;
	Boolean excludedOrBannedFromEntry; 
	
	//TRAVEL HISTORY REASONS// 
	String refusedVisaReason;
	String refusedEntryAtBorderReason;
	String refusedPermissionToStayReason;
	String refusedAsylumReason; 
	String deportedFromCountryReason; 
	String removedFromCountryReason;
	String requiredToLeaveCountryReason;
	String excludedOrBannedFromEntryReason; 

	//TERRORIST THREAT EVALUATION// 	
	Boolean confirmReadInfoOnTerrorism; 
	Boolean haveYouJustifiedOrEncouragedTerrorism; 
	Boolean haveYouBeenAMemberOfTerroristOrginisation;
	Boolean haveYouSupportedTerrorism; 
	Boolean haveYouBeenSuspectedOrInvolvedInWarCrimes; 
	Boolean anyOtherInfoAboutCharacter; 
	Boolean anyOtherActivitiesShowNotGoodPerson; 
	Boolean workedForOrginisationDangerousToUKOrAllies; 
	Boolean haveYouExpressedAnyExtremistViews; 
	Boolean haveYouSupportedExtreamistOrgisisation;
	
	//TERRORIST THREAT EVALUATION REASONS// 
	String haveYouJustifiedOrEncouragedTerrorismReason; 
	String haveYouBeenAMemberOfTerroristOrginisationReason;
	String haveYouSupportedTerrorismReason; 
	String haveYouBeenSuspectedOrInvolvedInWarCrimesReason; 
	String anyOtherInfoAboutCharacterReason; 
	String anyOtherActivitiesShowNotGoodPersonReason; 
	String workedForOrginisationDangerousToUKOrAlliesReason; 
	String haveYouExpressedAnyExtremistViewsReason; 
	String haveYouSupportedExtreamistOrgisisationReason;
}
