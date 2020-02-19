package com.mastek.visaApplication.entities;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Transient;



@Entity
@Table(name="JPA_APPLICATION_FORM")
@EntityListeners({ApplicationFormListeners.class}) //
public class ApplicationForm {
	private int applicationID;
	//VISA DETAILS// 
	private String applicationDate; 
	private int durationOfVisa; //months
	private SubmissionType SubmissionType; //enum
	private String plannedArriveUK;
	private String plannedDepartUK; 
	private long visaContactNumberUK;
	private long visaContactNumberOutsideUK;

	//UK INFOMATION//
	private String detailsOfVisit; 
	private String whatYouPaidFor; 
	private double payAmount; 
	private String whoWillBePayingYou; 
	private boolean anyoneRelyOnYouFinancially; 
	private boolean receivedAnyUKPublicFunds; 
	private String whereDoYouPlanToStay; 
	private String addressOfWhereYouAreStaying; 
	private boolean doYouHaveFamilyInUK; 
	private String whyAreTheyHelpingPay; 
	private double howMuchFamilyPaying; 
	private boolean willAnyoneBePayingTowardsVisit; 
	private String whoWillBePayingTowardsVisit;
	private double monthlySpend; 
	private double plannedUKSpending;
	private boolean otherIncomeOrSavings; 
	private String discribeYourJob;
	private Double salaryAfterTax;
	private String jobTitle; 
	private String employersName;
	private String employersAddress;
	private long employersPhoneNumber;
	private String startedWorkingForEmployer;
	private EmploymentStatus EmploymentStatus; //enum
	private boolean hadMedicalTreatmentInUK; 

	//IMMERGRATION QUESTIONS//
	private boolean haveYouEnteredUKIllegally;
	private boolean haveYouStayedBeyondYourVisa; 
	private boolean haveYouBreachedVisaConditions; 
	private boolean haveYouReceivedPublicFundsWithoutPermission;
	private boolean haveYouGivenFalseInfoOnVisa; 
	private boolean haveYouBeenToUKInLast10Years;

	//TRAVEL HISTORY//
	//Countries countriesTraveled; <make a collection>
	private int numberOfTimesTravelled; 
	private boolean refusedVisa;
	private boolean refusedEntryAtBorder;
	private boolean refusedPermissionToStay;
	private boolean refusedAsylum; 
	private boolean deportedFromCountry; 
	private boolean removedFromCountry;
	private boolean requiredToLeaveCountry;
	private boolean excludedOrBannedFromEntry; 
	
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
	private boolean confirmReadInfoOnTerrorism; 
	private boolean haveYouJustifiedOrEncouragedTerrorism; 
	private boolean haveYouBeenAMemberOfTerroristOrginisation;
	private boolean haveYouSupportedTerrorism; 
	private boolean haveYouBeenSuspectedOrInvolvedInWarCrimes; 
	private boolean anyOtherInfoAboutCharacter; 
	private boolean anyOtherActivitiesShowNotGoodPerson; 
	private boolean workedForOrginisationDangerousToUKOrAllies; 
	private boolean haveYouExpressedAnyExtremistViews; 
	private boolean haveYouSupportedExtreamistOrgisisation;
	
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
	
	//CONSTRUCTOR//
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

	@Enumerated(EnumType.STRING)
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

	public boolean getAnyoneRelyOnYouFinancially() {
		return anyoneRelyOnYouFinancially;
	}

	public void setAnyoneRelyOnYouFinancially(boolean anyoneRelyOnYouFinancially) {
		this.anyoneRelyOnYouFinancially = anyoneRelyOnYouFinancially;
	}

	public boolean getReceivedAnyUKPublicFunds() {
		return receivedAnyUKPublicFunds;
	}

	public void setReceivedAnyUKPublicFunds(boolean receivedAnyUKPublicFunds) {
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

	public boolean getDoYouHaveFamilyInUK() {
		return doYouHaveFamilyInUK;
	}

	public void setDoYouHaveFamilyInUK(boolean doYouHaveFamilyInUK) {
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

	public boolean getWillAnyoneBePayingTowardsVisit() {
		return willAnyoneBePayingTowardsVisit;
	}

	public void setWillAnyoneBePayingTowardsVisit(boolean willAnyoneBePayingTowardsVisit) {
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

	public boolean getOtherIncomeOrSavings() {
		return otherIncomeOrSavings;
	}

	public void setOtherIncomeOrSavings(boolean otherIncomeOrSavings) {
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

	@Enumerated(EnumType.STRING)
	public EmploymentStatus getEmploymentStatus() {
		return EmploymentStatus;
	}

	public void setEmploymentStatus(EmploymentStatus employmentStatus) {
		EmploymentStatus = employmentStatus;
	}

	public boolean getHadMedicalTreatmentInUK() {
		return hadMedicalTreatmentInUK;
	}

	public void setHadMedicalTreatmentInUK(boolean hadMedicalTreatmentInUK) {
		this.hadMedicalTreatmentInUK = hadMedicalTreatmentInUK;
	}

	public boolean getHaveYouEnteredUKIllegally() {
		return haveYouEnteredUKIllegally;
	}

	public void setHaveYouEnteredUKIllegally(boolean haveYouEnteredUKIllegally) {
		this.haveYouEnteredUKIllegally = haveYouEnteredUKIllegally;
	}

	public boolean getHaveYouStayedBeyondYourVisa() {
		return haveYouStayedBeyondYourVisa;
	}

	public void setHaveYouStayedBeyondYourVisa(boolean haveYouStayedBeyondYourVisa) {
		this.haveYouStayedBeyondYourVisa = haveYouStayedBeyondYourVisa;
	}

	public boolean getHaveYouBreachedVisaConditions() {
		return haveYouBreachedVisaConditions;
	}

	public void setHaveYouBreachedVisaConditions(boolean haveYouBreachedVisaConditions) {
		this.haveYouBreachedVisaConditions = haveYouBreachedVisaConditions;
	}

	public boolean getHaveYouReceivedPublicFundsWithoutPermission() {
		return haveYouReceivedPublicFundsWithoutPermission;
	}

	public void setHaveYouReceivedPublicFundsWithoutPermission(boolean haveYouReceivedPublicFundsWithoutPermission) {
		this.haveYouReceivedPublicFundsWithoutPermission = haveYouReceivedPublicFundsWithoutPermission;
	}

	public boolean getHaveYouGivenFalseInfoOnVisa() {
		return haveYouGivenFalseInfoOnVisa;
	}

	public void setHaveYouGivenFalseInfoOnVisa(boolean haveYouGivenFalseInfoOnVisa) {
		this.haveYouGivenFalseInfoOnVisa = haveYouGivenFalseInfoOnVisa;
	}

	public boolean getHaveYouBeenToUKInLast10Years() {
		return haveYouBeenToUKInLast10Years;
	}

	public void setHaveYouBeenToUKInLast10Years(boolean haveYouBeenToUKInLast10Years) {
		this.haveYouBeenToUKInLast10Years = haveYouBeenToUKInLast10Years;
	}

	public int getNumberOfTimesTravelled() {
		return numberOfTimesTravelled;
	}

	public void setNumberOfTimesTravelled(int numberOfTimesTravelled) {
		this.numberOfTimesTravelled = numberOfTimesTravelled;
	}

	public boolean getRefusedVisa() {
		return refusedVisa;
	}

	public void setRefusedVisa(boolean refusedVisa) {
		this.refusedVisa = refusedVisa;
	}

	public boolean getRefusedEntryAtBorder() {
		return refusedEntryAtBorder;
	}

	public void setRefusedEntryAtBorder(boolean refusedEntryAtBorder) {
		this.refusedEntryAtBorder = refusedEntryAtBorder;
	}

	public boolean getRefusedPermissionToStay() {
		return refusedPermissionToStay;
	}

	public void setRefusedPermissionToStay(boolean refusedPermissionToStay) {
		this.refusedPermissionToStay = refusedPermissionToStay;
	}

	public boolean getRefusedAsylum() {
		return refusedAsylum;
	}

	public void setRefusedAsylum(boolean refusedAsylum) {
		this.refusedAsylum = refusedAsylum;
	}

	public boolean getDeportedFromCountry() {
		return deportedFromCountry;
	}

	public void setDeportedFromCountry(boolean deportedFromCountry) {
		this.deportedFromCountry = deportedFromCountry;
	}

	public boolean getRemovedFromCountry() {
		return removedFromCountry;
	}

	public void setRemovedFromCountry(boolean removedFromCountry) {
		this.removedFromCountry = removedFromCountry;
	}

	public boolean getRequiredToLeaveCountry() {
		return requiredToLeaveCountry;
	}

	public void setRequiredToLeaveCountry(boolean requiredToLeaveCountry) {
		this.requiredToLeaveCountry = requiredToLeaveCountry;
	}

	public boolean getExcludedOrBannedFromEntry() {
		return excludedOrBannedFromEntry;
	}

	public void setExcludedOrBannedFromEntry(boolean excludedOrBannedFromEntry) {
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

	public boolean getConfirmReadInfoOnTerrorism() {
		return confirmReadInfoOnTerrorism;
	}

	public void setConfirmReadInfoOnTerrorism(boolean confirmReadInfoOnTerrorism) {
		this.confirmReadInfoOnTerrorism = confirmReadInfoOnTerrorism;
	}

	public boolean getHaveYouJustifiedOrEncouragedTerrorism() {
		return haveYouJustifiedOrEncouragedTerrorism;
	}

	public void setHaveYouJustifiedOrEncouragedTerrorism(boolean haveYouJustifiedOrEncouragedTerrorism) {
		this.haveYouJustifiedOrEncouragedTerrorism = haveYouJustifiedOrEncouragedTerrorism;
	}

	public boolean getHaveYouBeenAMemberOfTerroristOrginisation() {
		return haveYouBeenAMemberOfTerroristOrginisation;
	}

	public void setHaveYouBeenAMemberOfTerroristOrginisation(boolean haveYouBeenAMemberOfTerroristOrginisation) {
		this.haveYouBeenAMemberOfTerroristOrginisation = haveYouBeenAMemberOfTerroristOrginisation;
	}

	public boolean getHaveYouSupportedTerrorism() {
		return haveYouSupportedTerrorism;
	}

	public void setHaveYouSupportedTerrorism(boolean haveYouSupportedTerrorism) {
		this.haveYouSupportedTerrorism = haveYouSupportedTerrorism;
	}

	public boolean getHaveYouBeenSuspectedOrInvolvedInWarCrimes() {
		return haveYouBeenSuspectedOrInvolvedInWarCrimes;
	}

	public void setHaveYouBeenSuspectedOrInvolvedInWarCrimes(boolean haveYouBeenSuspectedOrInvolvedInWarCrimes) {
		this.haveYouBeenSuspectedOrInvolvedInWarCrimes = haveYouBeenSuspectedOrInvolvedInWarCrimes;
	}

	public boolean getAnyOtherInfoAboutCharacter() {
		return anyOtherInfoAboutCharacter;
	}

	public void setAnyOtherInfoAboutCharacter(boolean anyOtherInfoAboutCharacter) {
		this.anyOtherInfoAboutCharacter = anyOtherInfoAboutCharacter;
	}

	public boolean getAnyOtherActivitiesShowNotGoodPerson() {
		return anyOtherActivitiesShowNotGoodPerson;
	}

	public void setAnyOtherActivitiesShowNotGoodPerson(boolean anyOtherActivitiesShowNotGoodPerson) {
		this.anyOtherActivitiesShowNotGoodPerson = anyOtherActivitiesShowNotGoodPerson;
	}

	public boolean getWorkedForOrginisationDangerousToUKOrAllies() {
		return workedForOrginisationDangerousToUKOrAllies;
	}

	public void setWorkedForOrginisationDangerousToUKOrAllies(boolean workedForOrginisationDangerousToUKOrAllies) {
		this.workedForOrginisationDangerousToUKOrAllies = workedForOrginisationDangerousToUKOrAllies;
	}

	public boolean getHaveYouExpressedAnyExtremistViews() {
		return haveYouExpressedAnyExtremistViews;
	}

	public void setHaveYouExpressedAnyExtremistViews(boolean haveYouExpressedAnyExtremistViews) {
		this.haveYouExpressedAnyExtremistViews = haveYouExpressedAnyExtremistViews;
	}

	public boolean getHaveYouSupportedExtreamistOrgisisation() {
		return haveYouSupportedExtreamistOrgisisation;
	}

	public void setHaveYouSupportedExtreamistOrgisisation(boolean haveYouSupportedExtreamistOrgisisation) {
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

	//TO STRING// 
	@Override
	public String toString() {
		return "ApplicationForm [applicationID=" + applicationID + ", applicationDate=" + applicationDate
				+ ", durationOfVisa=" + durationOfVisa + ", SubmissionType=" + SubmissionType + ", plannedArriveUK="
				+ plannedArriveUK + ", plannedDepartUK=" + plannedDepartUK + ", visaContactNumberUK="
				+ visaContactNumberUK + ", visaContactNumberOutsideUK=" + visaContactNumberOutsideUK
				+ ", detailsOfVisit=" + detailsOfVisit + ", whatYouPaidFor=" + whatYouPaidFor + ", payAmount="
				+ payAmount + ", whoWillBePayingYou=" + whoWillBePayingYou + ", anyoneRelyOnYouFinancially="
				+ anyoneRelyOnYouFinancially + ", receivedAnyUKPublicFunds=" + receivedAnyUKPublicFunds
				+ ", whereDoYouPlanToStay=" + whereDoYouPlanToStay + ", addressOfWhereYouAreStaying="
				+ addressOfWhereYouAreStaying + ", doYouHaveFamilyInUK=" + doYouHaveFamilyInUK
				+ ", whyAreTheyHelpingPay=" + whyAreTheyHelpingPay + ", howMuchFamilyPaying=" + howMuchFamilyPaying
				+ ", willAnyoneBePayingTowardsVisit=" + willAnyoneBePayingTowardsVisit
				+ ", whoWillBePayingTowardsVisit=" + whoWillBePayingTowardsVisit + ", monthlySpend=" + monthlySpend
				+ ", plannedUKSpending=" + plannedUKSpending + ", otherIncomeOrSavings=" + otherIncomeOrSavings
				+ ", discribeYourJob=" + discribeYourJob + ", salaryAfterTax=" + salaryAfterTax + ", jobTitle="
				+ jobTitle + ", employersName=" + employersName + ", employersAddress=" + employersAddress
				+ ", employersPhoneNumber=" + employersPhoneNumber + ", startedWorkingForEmployer="
				+ startedWorkingForEmployer + ", EmploymentStatus=" + EmploymentStatus + ", hadMedicalTreatmentInUK="
				+ hadMedicalTreatmentInUK + ", haveYouEnteredUKIllegally=" + haveYouEnteredUKIllegally
				+ ", haveYouStayedBeyondYourVisa=" + haveYouStayedBeyondYourVisa + ", haveYouBreachedVisaConditions="
				+ haveYouBreachedVisaConditions + ", haveYouReceivedPublicFundsWithoutPermission="
				+ haveYouReceivedPublicFundsWithoutPermission + ", haveYouGivenFalseInfoOnVisa="
				+ haveYouGivenFalseInfoOnVisa + ", haveYouBeenToUKInLast10Years=" + haveYouBeenToUKInLast10Years
				+ ", numberOfTimesTravelled=" + numberOfTimesTravelled + ", refusedVisa=" + refusedVisa
				+ ", refusedEntryAtBorder=" + refusedEntryAtBorder + ", refusedPermissionToStay="
				+ refusedPermissionToStay + ", refusedAsylum=" + refusedAsylum + ", deportedFromCountry="
				+ deportedFromCountry + ", removedFromCountry=" + removedFromCountry + ", requiredToLeaveCountry="
				+ requiredToLeaveCountry + ", excludedOrBannedFromEntry=" + excludedOrBannedFromEntry
				+ ", refusedVisaReason=" + refusedVisaReason + ", refusedEntryAtBorderReason="
				+ refusedEntryAtBorderReason + ", refusedPermissionToStayReason=" + refusedPermissionToStayReason
				+ ", refusedAsylumReason=" + refusedAsylumReason + ", deportedFromCountryReason="
				+ deportedFromCountryReason + ", removedFromCountryReason=" + removedFromCountryReason
				+ ", requiredToLeaveCountryReason=" + requiredToLeaveCountryReason
				+ ", excludedOrBannedFromEntryReason=" + excludedOrBannedFromEntryReason
				+ ", confirmReadInfoOnTerrorism=" + confirmReadInfoOnTerrorism
				+ ", haveYouJustifiedOrEncouragedTerrorism=" + haveYouJustifiedOrEncouragedTerrorism
				+ ", haveYouBeenAMemberOfTerroristOrginisation=" + haveYouBeenAMemberOfTerroristOrginisation
				+ ", haveYouSupportedTerrorism=" + haveYouSupportedTerrorism
				+ ", haveYouBeenSuspectedOrInvolvedInWarCrimes=" + haveYouBeenSuspectedOrInvolvedInWarCrimes
				+ ", anyOtherInfoAboutCharacter=" + anyOtherInfoAboutCharacter
				+ ", anyOtherActivitiesShowNotGoodPerson=" + anyOtherActivitiesShowNotGoodPerson
				+ ", workedForOrginisationDangerousToUKOrAllies=" + workedForOrginisationDangerousToUKOrAllies
				+ ", haveYouExpressedAnyExtremistViews=" + haveYouExpressedAnyExtremistViews
				+ ", haveYouSupportedExtreamistOrgisisation=" + haveYouSupportedExtreamistOrgisisation
				+ ", haveYouJustifiedOrEncouragedTerrorismReason=" + haveYouJustifiedOrEncouragedTerrorismReason
				+ ", haveYouBeenAMemberOfTerroristOrginisationReason=" + haveYouBeenAMemberOfTerroristOrginisationReason
				+ ", haveYouSupportedTerrorismReason=" + haveYouSupportedTerrorismReason
				+ ", haveYouBeenSuspectedOrInvolvedInWarCrimesReason=" + haveYouBeenSuspectedOrInvolvedInWarCrimesReason
				+ ", anyOtherInfoAboutCharacterReason=" + anyOtherInfoAboutCharacterReason
				+ ", anyOtherActivitiesShowNotGoodPersonReason=" + anyOtherActivitiesShowNotGoodPersonReason
				+ ", workedForOrginisationDangerousToUKOrAlliesReason="
				+ workedForOrginisationDangerousToUKOrAlliesReason + ", haveYouExpressedAnyExtremistViewsReason="
				+ haveYouExpressedAnyExtremistViewsReason + ", haveYouSupportedExtreamistOrgisisationReason="
				+ haveYouSupportedExtreamistOrgisisationReason + "]";
	}

	//HASHCODE AND EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + applicationID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationForm other = (ApplicationForm) obj;
		if (applicationID != other.applicationID)
			return false;
		return true;
	}
	

	PersonalDetails applicationLink;

	
	
	@ManyToOne
	@JoinColumn(name="fk_passportNo")
	@org.springframework.data.annotation.Transient
	public PersonalDetails getApplicationLink() {
		return applicationLink;
	}

	public void setApplicationLink(PersonalDetails applicationLink) {
		this.applicationLink = applicationLink;
	}
	
	Set<Countries> countryVisitedAssigned = new HashSet<>();
@ManyToMany(cascade= CascadeType.ALL)
@JoinTable(name="Countries_Visited", joinColumns= {@JoinColumn(name="fk_Application_Form_ID")}, 
inverseJoinColumns= {@JoinColumn(name="fk_Country_ID")})
	public Set<Countries> getCountryVisitedAssigned() {
		return countryVisitedAssigned;
	}

	public void setCountryVisitedAssigned(Set<Countries> countryVisitedAssigned) {
		this.countryVisitedAssigned = countryVisitedAssigned;
	}
	
	

	
	 
	
	
	
}
