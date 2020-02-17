package com.mastek.visaApplication.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JPA_APPLICATION_FORM")
public class ApplicationForm {
	private int applicationID;
	//VISA DETAILS// 
	private String applicationDate; 
	private int durationOfVisa; 
	private SubmissionType SubmissionType; //enum
	private String plannedArriveUK;
	private String plannedDepartUK; 
	private long visaContactNumberUK;
	private long visaContactNumberOutsideUK;
	//language visaContactLanguage; // links to another table??

	//UK INFOMATION//
	private String detailsOfVisit; 
	private String whatYouPaidFor; 
	private double payAmount; 
	private String whoWillBePayingYou; 
	private Boolean anyoneRelyOnYouFinancially; 
	private Boolean receivedAnyUKPublicFunds; 
	private String whereDoYouPlanToStay; 
	private String addressOfWhereYouAreStaying; 
	private Boolean doYouHaveFamilyInUK; 
	private String whyAreTheyHelpingPay; 
	private double howMuchFamilyPaying; 
	private Boolean willAnyoneBePayingTowardsVisit; 
	private String whoWillBePayingTowardsVisit;
	private double monthlySpend; 
	private double plannedUKSpending;
	private Boolean otherIncomeOrSavings; 
	private String discribeYourJob;
	private Double salaryAfterTax;
	private String jobTitle; 
	private String employersName;
	private String employersAddress;
	private long employersPhoneNumber;
	private String startedWorkingForEmployer;
	private EmploymentStatus EmploymentStatus; //enum
	private Boolean hadMedicalTreatmentInUK; 

	//IMMERGRATION QUESTIONS//
	private Boolean haveYouEnteredUKIllegally;
	private Boolean haveYouStayedBeyondYourVisa; 
	private Boolean haveYouBreachedVisaConditions; 
	private Boolean haveYouReceivedPublicFundsWithoutPermission;
	private Boolean haveYouGivenFalseInfoOnVisa; 
	private Boolean haveYouBeenToUKInLast10Years;

	//TRAVEL HISTORY//
	//Countries countriesTraveled; <make a collection>
	private int numberOfTimesTravelled; 
	private Boolean refusedVisa;
	private Boolean refusedEntryAtBorder;
	private Boolean refusedPermissionToStay;
	private Boolean refusedAsylum; 
	private Boolean deportedFromCountry; 
	private Boolean removedFromCountry;
	private Boolean requiredToLeaveCountry;
	private Boolean excludedOrBannedFromEntry; 
	
	//TRAVEL HISTORY REASONS// 
	private String refusedVisaReason;
	private String refusedEntryAtBorderReason;
	private String refusedPermissionToStayReason;
	private String refusedAsylumReason; 
	private String deportedFromCountryReason; 
	private String removedFromCountryReason;
	private String requiredToLeaveCountryReason;
	private String excludedOrBannedFromEntryReason; 

	//TERRORIST THREAT EVALUATION// 	
	private Boolean confirmReadInfoOnTerrorism; 
	private Boolean haveYouJustifiedOrEncouragedTerrorism; 
	private Boolean haveYouBeenAMemberOfTerroristOrginisation;
	private Boolean haveYouSupportedTerrorism; 
	private Boolean haveYouBeenSuspectedOrInvolvedInWarCrimes; 
	private Boolean anyOtherInfoAboutCharacter; 
	private Boolean anyOtherActivitiesShowNotGoodPerson; 
	private Boolean workedForOrginisationDangerousToUKOrAllies; 
	private Boolean haveYouExpressedAnyExtremistViews; 
	private Boolean haveYouSupportedExtreamistOrgisisation;
	
	//TERRORIST THREAT EVALUATION REASONS// 
	private String haveYouJustifiedOrEncouragedTerrorismReason; 
	private String haveYouBeenAMemberOfTerroristOrginisationReason;
	private String haveYouSupportedTerrorismReason; 
	private String haveYouBeenSuspectedOrInvolvedInWarCrimesReason; 
	private String anyOtherInfoAboutCharacterReason; 
	private String anyOtherActivitiesShowNotGoodPersonReason; 
	private String workedForOrginisationDangerousToUKOrAlliesReason; 
	private String haveYouExpressedAnyExtremistViewsReason; 
	private String haveYouSupportedExtreamistOrgisisationReason;
	
	public ApplicationForm() {
		
	}

	//GETTERS AND SETTERS// 
	@Id
	@Column(name="Application_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(int applicationID) {
		this.applicationID = applicationID;
	}

	public String getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public int getDurationOfVisa() {
		return durationOfVisa;
	}

	public void setDurationOfVisa(int durationOfVisa) {
		this.durationOfVisa = durationOfVisa;
	}

	public SubmissionType getSubmissionType() {
		return SubmissionType;
	}

	public void setSubmissionType(SubmissionType submissionType) {
		SubmissionType = submissionType;
	}

	public String getPlannedArriveUK() {
		return plannedArriveUK;
	}

	public void setPlannedArriveUK(String plannedArriveUK) {
		this.plannedArriveUK = plannedArriveUK;
	}

	public String getPlannedDepartUK() {
		return plannedDepartUK;
	}

	public void setPlannedDepartUK(String plannedDepartUK) {
		this.plannedDepartUK = plannedDepartUK;
	}

	public long getVisaContactNumberUK() {
		return visaContactNumberUK;
	}

	public void setVisaContactNumberUK(long visaContactNumberUK) {
		this.visaContactNumberUK = visaContactNumberUK;
	}

	public long getVisaContactNumberOutsideUK() {
		return visaContactNumberOutsideUK;
	}

	public void setVisaContactNumberOutsideUK(long visaContactNumberOutsideUK) {
		this.visaContactNumberOutsideUK = visaContactNumberOutsideUK;
	}

	public String getDetailsOfVisit() {
		return detailsOfVisit;
	}

	public void setDetailsOfVisit(String detailsOfVisit) {
		this.detailsOfVisit = detailsOfVisit;
	}

	public String getWhatYouPaidFor() {
		return whatYouPaidFor;
	}

	public void setWhatYouPaidFor(String whatYouPaidFor) {
		this.whatYouPaidFor = whatYouPaidFor;
	}

	public double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}

	public String getWhoWillBePayingYou() {
		return whoWillBePayingYou;
	}

	public void setWhoWillBePayingYou(String whoWillBePayingYou) {
		this.whoWillBePayingYou = whoWillBePayingYou;
	}

	public Boolean getAnyoneRelyOnYouFinancially() {
		return anyoneRelyOnYouFinancially;
	}

	public void setAnyoneRelyOnYouFinancially(Boolean anyoneRelyOnYouFinancially) {
		this.anyoneRelyOnYouFinancially = anyoneRelyOnYouFinancially;
	}

	public Boolean getReceivedAnyUKPublicFunds() {
		return receivedAnyUKPublicFunds;
	}

	public void setReceivedAnyUKPublicFunds(Boolean receivedAnyUKPublicFunds) {
		this.receivedAnyUKPublicFunds = receivedAnyUKPublicFunds;
	}

	public String getWhereDoYouPlanToStay() {
		return whereDoYouPlanToStay;
	}

	public void setWhereDoYouPlanToStay(String whereDoYouPlanToStay) {
		this.whereDoYouPlanToStay = whereDoYouPlanToStay;
	}

	public String getAddressOfWhereYouAreStaying() {
		return addressOfWhereYouAreStaying;
	}

	public void setAddressOfWhereYouAreStaying(String addressOfWhereYouAreStaying) {
		this.addressOfWhereYouAreStaying = addressOfWhereYouAreStaying;
	}

	public Boolean getDoYouHaveFamilyInUK() {
		return doYouHaveFamilyInUK;
	}

	public void setDoYouHaveFamilyInUK(Boolean doYouHaveFamilyInUK) {
		this.doYouHaveFamilyInUK = doYouHaveFamilyInUK;
	}

	public String getWhyAreTheyHelpingPay() {
		return whyAreTheyHelpingPay;
	}

	public void setWhyAreTheyHelpingPay(String whyAreTheyHelpingPay) {
		this.whyAreTheyHelpingPay = whyAreTheyHelpingPay;
	}

	public double getHowMuchFamilyPaying() {
		return howMuchFamilyPaying;
	}

	public void setHowMuchFamilyPaying(double howMuchFamilyPaying) {
		this.howMuchFamilyPaying = howMuchFamilyPaying;
	}

	public Boolean getWillAnyoneBePayingTowardsVisit() {
		return willAnyoneBePayingTowardsVisit;
	}

	public void setWillAnyoneBePayingTowardsVisit(Boolean willAnyoneBePayingTowardsVisit) {
		this.willAnyoneBePayingTowardsVisit = willAnyoneBePayingTowardsVisit;
	}

	public String getWhoWillBePayingTowardsVisit() {
		return whoWillBePayingTowardsVisit;
	}

	public void setWhoWillBePayingTowardsVisit(String whoWillBePayingTowardsVisit) {
		this.whoWillBePayingTowardsVisit = whoWillBePayingTowardsVisit;
	}

	public double getMonthlySpend() {
		return monthlySpend;
	}

	public void setMonthlySpend(double monthlySpend) {
		this.monthlySpend = monthlySpend;
	}

	public double getPlannedUKSpending() {
		return plannedUKSpending;
	}

	public void setPlannedUKSpending(double plannedUKSpending) {
		this.plannedUKSpending = plannedUKSpending;
	}

	public Boolean getOtherIncomeOrSavings() {
		return otherIncomeOrSavings;
	}

	public void setOtherIncomeOrSavings(Boolean otherIncomeOrSavings) {
		this.otherIncomeOrSavings = otherIncomeOrSavings;
	}

	public String getDiscribeYourJob() {
		return discribeYourJob;
	}

	public void setDiscribeYourJob(String discribeYourJob) {
		this.discribeYourJob = discribeYourJob;
	}

	public Double getSalaryAfterTax() {
		return salaryAfterTax;
	}

	public void setSalaryAfterTax(Double salaryAfterTax) {
		this.salaryAfterTax = salaryAfterTax;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getEmployersName() {
		return employersName;
	}

	public void setEmployersName(String employersName) {
		this.employersName = employersName;
	}

	public String getEmployersAddress() {
		return employersAddress;
	}

	public void setEmployersAddress(String employersAddress) {
		this.employersAddress = employersAddress;
	}

	public long getEmployersPhoneNumber() {
		return employersPhoneNumber;
	}

	public void setEmployersPhoneNumber(long employersPhoneNumber) {
		this.employersPhoneNumber = employersPhoneNumber;
	}

	public String getStartedWorkingForEmployer() {
		return startedWorkingForEmployer;
	}

	public void setStartedWorkingForEmployer(String startedWorkingForEmployer) {
		this.startedWorkingForEmployer = startedWorkingForEmployer;
	}

	public EmploymentStatus getEmploymentStatus() {
		return EmploymentStatus;
	}

	public void setEmploymentStatus(EmploymentStatus employmentStatus) {
		EmploymentStatus = employmentStatus;
	}

	public Boolean getHadMedicalTreatmentInUK() {
		return hadMedicalTreatmentInUK;
	}

	public void setHadMedicalTreatmentInUK(Boolean hadMedicalTreatmentInUK) {
		this.hadMedicalTreatmentInUK = hadMedicalTreatmentInUK;
	}

	public Boolean getHaveYouEnteredUKIllegally() {
		return haveYouEnteredUKIllegally;
	}

	public void setHaveYouEnteredUKIllegally(Boolean haveYouEnteredUKIllegally) {
		this.haveYouEnteredUKIllegally = haveYouEnteredUKIllegally;
	}

	public Boolean getHaveYouStayedBeyondYourVisa() {
		return haveYouStayedBeyondYourVisa;
	}

	public void setHaveYouStayedBeyondYourVisa(Boolean haveYouStayedBeyondYourVisa) {
		this.haveYouStayedBeyondYourVisa = haveYouStayedBeyondYourVisa;
	}

	public Boolean getHaveYouBreachedVisaConditions() {
		return haveYouBreachedVisaConditions;
	}

	public void setHaveYouBreachedVisaConditions(Boolean haveYouBreachedVisaConditions) {
		this.haveYouBreachedVisaConditions = haveYouBreachedVisaConditions;
	}

	public Boolean getHaveYouReceivedPublicFundsWithoutPermission() {
		return haveYouReceivedPublicFundsWithoutPermission;
	}

	public void setHaveYouReceivedPublicFundsWithoutPermission(Boolean haveYouReceivedPublicFundsWithoutPermission) {
		this.haveYouReceivedPublicFundsWithoutPermission = haveYouReceivedPublicFundsWithoutPermission;
	}

	public Boolean getHaveYouGivenFalseInfoOnVisa() {
		return haveYouGivenFalseInfoOnVisa;
	}

	public void setHaveYouGivenFalseInfoOnVisa(Boolean haveYouGivenFalseInfoOnVisa) {
		this.haveYouGivenFalseInfoOnVisa = haveYouGivenFalseInfoOnVisa;
	}

	public Boolean getHaveYouBeenToUKInLast10Years() {
		return haveYouBeenToUKInLast10Years;
	}

	public void setHaveYouBeenToUKInLast10Years(Boolean haveYouBeenToUKInLast10Years) {
		this.haveYouBeenToUKInLast10Years = haveYouBeenToUKInLast10Years;
	}

	public int getNumberOfTimesTravelled() {
		return numberOfTimesTravelled;
	}

	public void setNumberOfTimesTravelled(int numberOfTimesTravelled) {
		this.numberOfTimesTravelled = numberOfTimesTravelled;
	}

	public Boolean getRefusedVisa() {
		return refusedVisa;
	}

	public void setRefusedVisa(Boolean refusedVisa) {
		this.refusedVisa = refusedVisa;
	}

	public Boolean getRefusedEntryAtBorder() {
		return refusedEntryAtBorder;
	}

	public void setRefusedEntryAtBorder(Boolean refusedEntryAtBorder) {
		this.refusedEntryAtBorder = refusedEntryAtBorder;
	}

	public Boolean getRefusedPermissionToStay() {
		return refusedPermissionToStay;
	}

	public void setRefusedPermissionToStay(Boolean refusedPermissionToStay) {
		this.refusedPermissionToStay = refusedPermissionToStay;
	}

	public Boolean getRefusedAsylum() {
		return refusedAsylum;
	}

	public void setRefusedAsylum(Boolean refusedAsylum) {
		this.refusedAsylum = refusedAsylum;
	}

	public Boolean getDeportedFromCountry() {
		return deportedFromCountry;
	}

	public void setDeportedFromCountry(Boolean deportedFromCountry) {
		this.deportedFromCountry = deportedFromCountry;
	}

	public Boolean getRemovedFromCountry() {
		return removedFromCountry;
	}

	public void setRemovedFromCountry(Boolean removedFromCountry) {
		this.removedFromCountry = removedFromCountry;
	}

	public Boolean getRequiredToLeaveCountry() {
		return requiredToLeaveCountry;
	}

	public void setRequiredToLeaveCountry(Boolean requiredToLeaveCountry) {
		this.requiredToLeaveCountry = requiredToLeaveCountry;
	}

	public Boolean getExcludedOrBannedFromEntry() {
		return excludedOrBannedFromEntry;
	}

	public void setExcludedOrBannedFromEntry(Boolean excludedOrBannedFromEntry) {
		this.excludedOrBannedFromEntry = excludedOrBannedFromEntry;
	}

	public String getRefusedVisaReason() {
		return refusedVisaReason;
	}

	public void setRefusedVisaReason(String refusedVisaReason) {
		this.refusedVisaReason = refusedVisaReason;
	}

	public String getRefusedEntryAtBorderReason() {
		return refusedEntryAtBorderReason;
	}

	public void setRefusedEntryAtBorderReason(String refusedEntryAtBorderReason) {
		this.refusedEntryAtBorderReason = refusedEntryAtBorderReason;
	}

	public String getRefusedPermissionToStayReason() {
		return refusedPermissionToStayReason;
	}

	public void setRefusedPermissionToStayReason(String refusedPermissionToStayReason) {
		this.refusedPermissionToStayReason = refusedPermissionToStayReason;
	}

	public String getRefusedAsylumReason() {
		return refusedAsylumReason;
	}

	public void setRefusedAsylumReason(String refusedAsylumReason) {
		this.refusedAsylumReason = refusedAsylumReason;
	}

	public String getDeportedFromCountryReason() {
		return deportedFromCountryReason;
	}

	public void setDeportedFromCountryReason(String deportedFromCountryReason) {
		this.deportedFromCountryReason = deportedFromCountryReason;
	}

	public String getRemovedFromCountryReason() {
		return removedFromCountryReason;
	}

	public void setRemovedFromCountryReason(String removedFromCountryReason) {
		this.removedFromCountryReason = removedFromCountryReason;
	}

	public String getRequiredToLeaveCountryReason() {
		return requiredToLeaveCountryReason;
	}

	public void setRequiredToLeaveCountryReason(String requiredToLeaveCountryReason) {
		this.requiredToLeaveCountryReason = requiredToLeaveCountryReason;
	}

	public String getExcludedOrBannedFromEntryReason() {
		return excludedOrBannedFromEntryReason;
	}

	public void setExcludedOrBannedFromEntryReason(String excludedOrBannedFromEntryReason) {
		this.excludedOrBannedFromEntryReason = excludedOrBannedFromEntryReason;
	}

	public Boolean getConfirmReadInfoOnTerrorism() {
		return confirmReadInfoOnTerrorism;
	}

	public void setConfirmReadInfoOnTerrorism(Boolean confirmReadInfoOnTerrorism) {
		this.confirmReadInfoOnTerrorism = confirmReadInfoOnTerrorism;
	}

	public Boolean getHaveYouJustifiedOrEncouragedTerrorism() {
		return haveYouJustifiedOrEncouragedTerrorism;
	}

	public void setHaveYouJustifiedOrEncouragedTerrorism(Boolean haveYouJustifiedOrEncouragedTerrorism) {
		this.haveYouJustifiedOrEncouragedTerrorism = haveYouJustifiedOrEncouragedTerrorism;
	}

	public Boolean getHaveYouBeenAMemberOfTerroristOrginisation() {
		return haveYouBeenAMemberOfTerroristOrginisation;
	}

	public void setHaveYouBeenAMemberOfTerroristOrginisation(Boolean haveYouBeenAMemberOfTerroristOrginisation) {
		this.haveYouBeenAMemberOfTerroristOrginisation = haveYouBeenAMemberOfTerroristOrginisation;
	}

	public Boolean getHaveYouSupportedTerrorism() {
		return haveYouSupportedTerrorism;
	}

	public void setHaveYouSupportedTerrorism(Boolean haveYouSupportedTerrorism) {
		this.haveYouSupportedTerrorism = haveYouSupportedTerrorism;
	}

	public Boolean getHaveYouBeenSuspectedOrInvolvedInWarCrimes() {
		return haveYouBeenSuspectedOrInvolvedInWarCrimes;
	}

	public void setHaveYouBeenSuspectedOrInvolvedInWarCrimes(Boolean haveYouBeenSuspectedOrInvolvedInWarCrimes) {
		this.haveYouBeenSuspectedOrInvolvedInWarCrimes = haveYouBeenSuspectedOrInvolvedInWarCrimes;
	}

	public Boolean getAnyOtherInfoAboutCharacter() {
		return anyOtherInfoAboutCharacter;
	}

	public void setAnyOtherInfoAboutCharacter(Boolean anyOtherInfoAboutCharacter) {
		this.anyOtherInfoAboutCharacter = anyOtherInfoAboutCharacter;
	}

	public Boolean getAnyOtherActivitiesShowNotGoodPerson() {
		return anyOtherActivitiesShowNotGoodPerson;
	}

	public void setAnyOtherActivitiesShowNotGoodPerson(Boolean anyOtherActivitiesShowNotGoodPerson) {
		this.anyOtherActivitiesShowNotGoodPerson = anyOtherActivitiesShowNotGoodPerson;
	}

	public Boolean getWorkedForOrginisationDangerousToUKOrAllies() {
		return workedForOrginisationDangerousToUKOrAllies;
	}

	public void setWorkedForOrginisationDangerousToUKOrAllies(Boolean workedForOrginisationDangerousToUKOrAllies) {
		this.workedForOrginisationDangerousToUKOrAllies = workedForOrginisationDangerousToUKOrAllies;
	}

	public Boolean getHaveYouExpressedAnyExtremistViews() {
		return haveYouExpressedAnyExtremistViews;
	}

	public void setHaveYouExpressedAnyExtremistViews(Boolean haveYouExpressedAnyExtremistViews) {
		this.haveYouExpressedAnyExtremistViews = haveYouExpressedAnyExtremistViews;
	}

	public Boolean getHaveYouSupportedExtreamistOrgisisation() {
		return haveYouSupportedExtreamistOrgisisation;
	}

	public void setHaveYouSupportedExtreamistOrgisisation(Boolean haveYouSupportedExtreamistOrgisisation) {
		this.haveYouSupportedExtreamistOrgisisation = haveYouSupportedExtreamistOrgisisation;
	}

	public String getHaveYouJustifiedOrEncouragedTerrorismReason() {
		return haveYouJustifiedOrEncouragedTerrorismReason;
	}

	public void setHaveYouJustifiedOrEncouragedTerrorismReason(String haveYouJustifiedOrEncouragedTerrorismReason) {
		this.haveYouJustifiedOrEncouragedTerrorismReason = haveYouJustifiedOrEncouragedTerrorismReason;
	}

	public String getHaveYouBeenAMemberOfTerroristOrginisationReason() {
		return haveYouBeenAMemberOfTerroristOrginisationReason;
	}

	public void setHaveYouBeenAMemberOfTerroristOrginisationReason(String haveYouBeenAMemberOfTerroristOrginisationReason) {
		this.haveYouBeenAMemberOfTerroristOrginisationReason = haveYouBeenAMemberOfTerroristOrginisationReason;
	}

	public String getHaveYouSupportedTerrorismReason() {
		return haveYouSupportedTerrorismReason;
	}

	public void setHaveYouSupportedTerrorismReason(String haveYouSupportedTerrorismReason) {
		this.haveYouSupportedTerrorismReason = haveYouSupportedTerrorismReason;
	}

	public String getHaveYouBeenSuspectedOrInvolvedInWarCrimesReason() {
		return haveYouBeenSuspectedOrInvolvedInWarCrimesReason;
	}

	public void setHaveYouBeenSuspectedOrInvolvedInWarCrimesReason(String haveYouBeenSuspectedOrInvolvedInWarCrimesReason) {
		this.haveYouBeenSuspectedOrInvolvedInWarCrimesReason = haveYouBeenSuspectedOrInvolvedInWarCrimesReason;
	}

	public String getAnyOtherInfoAboutCharacterReason() {
		return anyOtherInfoAboutCharacterReason;
	}

	public void setAnyOtherInfoAboutCharacterReason(String anyOtherInfoAboutCharacterReason) {
		this.anyOtherInfoAboutCharacterReason = anyOtherInfoAboutCharacterReason;
	}

	public String getAnyOtherActivitiesShowNotGoodPersonReason() {
		return anyOtherActivitiesShowNotGoodPersonReason;
	}

	public void setAnyOtherActivitiesShowNotGoodPersonReason(String anyOtherActivitiesShowNotGoodPersonReason) {
		this.anyOtherActivitiesShowNotGoodPersonReason = anyOtherActivitiesShowNotGoodPersonReason;
	}

	public String getWorkedForOrginisationDangerousToUKOrAlliesReason() {
		return workedForOrginisationDangerousToUKOrAlliesReason;
	}

	public void setWorkedForOrginisationDangerousToUKOrAlliesReason(
			String workedForOrginisationDangerousToUKOrAlliesReason) {
		this.workedForOrginisationDangerousToUKOrAlliesReason = workedForOrginisationDangerousToUKOrAlliesReason;
	}

	public String getHaveYouExpressedAnyExtremistViewsReason() {
		return haveYouExpressedAnyExtremistViewsReason;
	}

	public void setHaveYouExpressedAnyExtremistViewsReason(String haveYouExpressedAnyExtremistViewsReason) {
		this.haveYouExpressedAnyExtremistViewsReason = haveYouExpressedAnyExtremistViewsReason;
	}

	public String getHaveYouSupportedExtreamistOrgisisationReason() {
		return haveYouSupportedExtreamistOrgisisationReason;
	}

	public void setHaveYouSupportedExtreamistOrgisisationReason(String haveYouSupportedExtreamistOrgisisationReason) {
		this.haveYouSupportedExtreamistOrgisisationReason = haveYouSupportedExtreamistOrgisisationReason;
	}
	
	
}
