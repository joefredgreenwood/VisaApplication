package com.mastek.visaApplication.entities;

public class PersonalDetails {

	long passportNo;
	String contactLanguage;
	Salutation applicantSalutation;
	String firstName;
	String middleName;
	String familyName;
	String otherNames;
	Gender applicantGender;
	String dateOfBirth; 		// try this with the date
	String countryOfBirth;		// try this with the date
	String placeOfBirth;		// try this with the date 
	String nationality; //Change this once greg has done the enum
	String doYouHaveAnyOtherNationality;
	Relationship applicantRelationship;
	String ownershipStatusOfHome;
	String address;
	String howLongHaveYouLivedAtThisAddress;
	Boolean isThisYourCorrespondenceAddress;
	long telephoneNumber;
	Boolean canBeContactedByTelephone;
	String whereDoYouUseThisNumber; //possible enum (home/work)
	String contactEmail;
	String whoDoesThisEmailBelongTo;
	String secondaryEmail;
	Boolean drivingLicense;
	Boolean doYouHaveAValidNationalIdentityCard;
	//long passportNo;
	String passportIssueDate;
	String passportExpiryDate;
	String countryOfNationality;
	String issuingAuthority;
	Boolean	doYouHaveAUkDriversLicense;
	Boolean doYouHaveAUkNationalInsuranceNumber;
	String NationalInsuranceNumber;
	
	//Dependents//
	
	
	String dependantFamilyName;
	Salutation dependentSalutation;
	String dependantGivenName;
	String dependantRelationshipToYou;
	String dependantNationalitySameAsApplicant;
	String dependantCountryOfNationality;
	String dependantDateOfBirth;
}
