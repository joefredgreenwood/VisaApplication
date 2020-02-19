package com.mastek.visaApplication.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="JPA_PERSONAL_DETAILS")
public class PersonalDetails {

	@FormParam("passportNo")
	int passportNo;
	
	@FormParam("contactLanguage")
	String contactLanguage;			// change this when Greg has done enum
	
	@FormParam("applicantSalutation")
	Salutation applicantSalutation;
	
	@FormParam("firstName")
	String firstName;
	
	@FormParam("middleName")
	String middleName;
	//
	@FormParam("familyName")
	String familyName;
	
	@FormParam("otherNames")
	String otherNames;
	
	@FormParam("applicantGender")
	Gender applicantGender;
	
	@FormParam("dateOfBirth")
	String dateOfBirth;			// try this with the date
	
	@FormParam("countryOfBirth")
	String countryOfBirth;		// try this with the date
	//
	@FormParam("placeOfBirth")
	String placeOfBirth;	// try this with the date 
	
	@FormParam("nationality")
	String nationality; //Change this once greg has done the enum
	
	@FormParam("doYouHaveAnyOtherNationality")
	Boolean doYouHaveAnyOtherNationality;
	
	@FormParam("applicantRelationship")
	Relationship applicantRelationship;
	
	@FormParam("ownershipStatusOfHome")
	String ownershipStatusOfHome;
	//
	@FormParam("address")
	String address;
	
	@FormParam("howLongHaveYouLivedAtThisAddress")
	String howLongHaveYouLivedAtThisAddress;
	
	@FormParam("isThisYourCorrespondenceAddress")
	Boolean isThisYourCorrespondenceAddress;
	
	@FormParam("telephoneNumber")
	long telephoneNumber;
	
	@FormParam("canBeContactedByTelephone")
	Boolean canBeContactedByTelephone;
	//
	@FormParam("whereDoYouUseThisNumber")
	String whereDoYouUseThisNumber; //possible enum (home/work)
	
	@FormParam("contactEmail")
	String contactEmail;
	
	@FormParam("whoDoesThisEmailBelongTo")
	String whoDoesThisEmailBelongTo;
	
	@FormParam("secondaryEmail")
	String secondaryEmail;
	
	@FormParam("drivingLicense")
	Boolean drivingLicense;
	//
	@FormParam ("doYouHaveAValidNationalIdentityCard")
	Boolean doYouHaveAValidNationalIdentityCard;
	
	@FormParam("passportIssueDate")
	String passportIssueDate;
	
	@FormParam("passportExpiryDate")
	String passportExpiryDate;
	
	@FormParam("countryOfNationality")
	String countryOfNationality;
	
	@FormParam("issuingAuthority")
	String issuingAuthority;
	//
	@FormParam("doYouHaveAUkDriversLicense")
	Boolean	doYouHaveAUkDriversLicense;
	
	@FormParam("doYouHaveAUkNationalInsuranceNumber")
	Boolean doYouHaveAUkNationalInsuranceNumber;
	
	@FormParam("NationalInsuranceNumber")
	String NationalInsuranceNumber;
	
	//Dependants//
	@FormParam("dependantPassportNo")
	long dependantPassportNo;
	
	@FormParam("dependantFamilyName")
	String dependantFamilyName;
	
	@FormParam("dependantSalutation")
	Salutation dependantSalutation;
	
	@FormParam("dependantGender")
	Gender dependantGender;
	
	@FormParam("dependantGivenName")
	String dependantGivenName;
	
	@FormParam("dependantRelationshipToYou")
	String dependantRelationshipToYou;
	
	@FormParam("dependantNationalitySameAsApplicant")
	String dependantNationalitySameAsApplicant;
	
	@FormParam("dependantCountryOfNationality")
	String dependantCountryOfNationality;
	
	@FormParam("dependantDateOfBirth")
	String dependantDateOfBirth;
	
	public PersonalDetails() {
		
	}

	@Id
	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public String getContactLanguage() {
		return contactLanguage;
	}

	public void setContactLanguage(String contactLanguage) {
		this.contactLanguage = contactLanguage;
	}
   @Enumerated(EnumType.STRING)
	public Salutation getApplicantSalutation() {
		return applicantSalutation;
	}

	public void setApplicantSalutation(Salutation applicantSalutation) {
		this.applicantSalutation = applicantSalutation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name="middle_name",nullable=true)
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	@Column(name="other_names",nullable=true)
	public String getOtherNames() {
		return otherNames;
	}

	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	@Enumerated(EnumType.STRING)
	public Gender getApplicantGender() {
		return applicantGender;
	}

	public void setApplicantGender(Gender applicantGender) {
		this.applicantGender = applicantGender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Column(name="do_you_have_another_nationality")
	public Boolean getDoYouHaveAnyOtherNationality() {
		return doYouHaveAnyOtherNationality;
	}

	public void setDoYouHaveAnyOtherNationality(Boolean doYouHaveAnyOtherNationality) {
		this.doYouHaveAnyOtherNationality = doYouHaveAnyOtherNationality;
	}
	@Enumerated(EnumType.STRING)
	public Relationship getApplicantRelationship() {
		return applicantRelationship;
	}

	public void setApplicantRelationship(Relationship applicantRelationship) {
		this.applicantRelationship = applicantRelationship;
	}
	@Column(name="what_is_your_ownership_status")
	public String getOwnershipStatusOfHome() {
		return ownershipStatusOfHome;
	}

	public void setOwnershipStatusOfHome(String ownershipStatusOfHome) {
		this.ownershipStatusOfHome = ownershipStatusOfHome;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="how_long_have_you_lived_at_the_current_address")
	public String getHowLongHaveYouLivedAtThisAddress() {
		return howLongHaveYouLivedAtThisAddress;
	}

	public void setHowLongHaveYouLivedAtThisAddress(String howLongHaveYouLivedAtThisAddress) {
		this.howLongHaveYouLivedAtThisAddress = howLongHaveYouLivedAtThisAddress;
	}
	@Column(name="is_this_your_correspondence_address")
	public Boolean getIsThisYourCorrespondenceAddress() {
		return isThisYourCorrespondenceAddress;
	}

	public void setIsThisYourCorrespondenceAddress(Boolean isThisYourCorrespondenceAddress) {
		this.isThisYourCorrespondenceAddress = isThisYourCorrespondenceAddress;
	}

	public long getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	@Column(name="can_you_be_contacted_by_telehphone")
	public Boolean getCanBeContactedByTelephone() {
		return canBeContactedByTelephone;
	}

	public void setCanBeContactedByTelephone(Boolean canBeContactedByTelephone) {
		this.canBeContactedByTelephone = canBeContactedByTelephone;
	}
	
	public String getWhereDoYouUseThisNumber() {
		return whereDoYouUseThisNumber;
	}

	public void setWhereDoYouUseThisNumber(String whereDoYouUseThisNumber) {
		this.whereDoYouUseThisNumber = whereDoYouUseThisNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getWhoDoesThisEmailBelongTo() {
		return whoDoesThisEmailBelongTo;
	}

	public void setWhoDoesThisEmailBelongTo(String whoDoesThisEmailBelongTo) {
		this.whoDoesThisEmailBelongTo = whoDoesThisEmailBelongTo;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public Boolean getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(Boolean drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public Boolean getDoYouHaveAValidNationalIdentityCard() {
		return doYouHaveAValidNationalIdentityCard;
	}

	public void setDoYouHaveAValidNationalIdentityCard(Boolean doYouHaveAValidNationalIdentityCard) {
		this.doYouHaveAValidNationalIdentityCard = doYouHaveAValidNationalIdentityCard;
	}

	public String getPassportIssueDate() {
		return passportIssueDate;
	}

	public void setPassportIssueDate(String passportIssueDate) {
		this.passportIssueDate = passportIssueDate;
	}

	public String getPassportExpiryDate() {
		return passportExpiryDate;
	}

	public void setPassportExpiryDate(String passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	public String getCountryOfNationality() {
		return countryOfNationality;
	}

	public void setCountryOfNationality(String countryOfNationality) {
		this.countryOfNationality = countryOfNationality;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public Boolean getDoYouHaveAUkDriversLicense() {
		return doYouHaveAUkDriversLicense;
	}

	public void setDoYouHaveAUkDriversLicense(Boolean doYouHaveAUkDriversLicense) {
		this.doYouHaveAUkDriversLicense = doYouHaveAUkDriversLicense;
	}

	public Boolean getDoYouHaveAUkNationalInsuranceNumber() {
		return doYouHaveAUkNationalInsuranceNumber;
	}

	public void setDoYouHaveAUkNationalInsuranceNumber(Boolean doYouHaveAUkNationalInsuranceNumber) {
		this.doYouHaveAUkNationalInsuranceNumber = doYouHaveAUkNationalInsuranceNumber;
	}

	public String getNationalInsuranceNumber() {
		return NationalInsuranceNumber;
	}

	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		NationalInsuranceNumber = nationalInsuranceNumber;
	}
	
	public long getDependantPassportNo() {
		return dependantPassportNo;
	}

	public void setDependantPassportNo(long dependantPassportNo) {
		this.dependantPassportNo = dependantPassportNo;
	}
	
	public String getDependantFamilyName() {
		return dependantFamilyName;
	}

	public void setDependantFamilyName(String dependantFamilyName) {
		this.dependantFamilyName = dependantFamilyName;
	}
	@Enumerated(EnumType.STRING)
	public Salutation getDependantSalutation() {
		return dependantSalutation;
	}

	public void setDependantSalutation(Salutation dependantSalutation) {
		this.dependantSalutation = dependantSalutation;
	}

	@Enumerated(EnumType.STRING)
	public Gender getDependantGender() {
		return dependantGender;
	}

	public void setDependantGender(Gender dependantGender) {
		this.dependantGender = dependantGender;
	}

	public String getDependantGivenName() {
		return dependantGivenName;
	}

	public void setDependantGivenName(String dependantGivenName) {
		this.dependantGivenName = dependantGivenName;
	}
	
	public String getDependantRelationshipToYou() {
		return dependantRelationshipToYou;
	}

	public void setDependantRelationshipToYou(String dependantRelationshipToYou) {
		this.dependantRelationshipToYou = dependantRelationshipToYou;
	}

	public String getDependantNationalitySameAsApplicant() {
		return dependantNationalitySameAsApplicant;
	}

	public void setDependantNationalitySameAsApplicant(String dependantNationalitySameAsApplicant) {
		this.dependantNationalitySameAsApplicant = dependantNationalitySameAsApplicant;
	}

	public String getDependantCountryOfNationality() {
		return dependantCountryOfNationality;
	}

	public void setDependantCountryOfNationality(String dependantCountryOfNationality) {
		this.dependantCountryOfNationality = dependantCountryOfNationality;
	}

	public String getDependantDateOfBirth() {
		return dependantDateOfBirth;
	}

	public void setDependantDateOfBirth(String dependantDateOfBirth) {
		this.dependantDateOfBirth = dependantDateOfBirth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (passportNo ^ (passportNo >>> 32));
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
		PersonalDetails other = (PersonalDetails) obj;
		if (passportNo != other.passportNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersonalDetails [passportNo=" + passportNo + ", contactLanguage=" + contactLanguage
				+ ", applicantSalutation=" + applicantSalutation + ", firstName=" + firstName + ", middleName="
				+ middleName + ", familyName=" + familyName + ", otherNames=" + otherNames + ", applicantGender="
				+ applicantGender + ", dateOfBirth=" + dateOfBirth + ", countryOfBirth=" + countryOfBirth
				+ ", placeOfBirth=" + placeOfBirth + ", nationality=" + nationality + ", doYouHaveAnyOtherNationality="
				+ doYouHaveAnyOtherNationality + ", applicantRelationship=" + applicantRelationship
				+ ", ownershipStatusOfHome=" + ownershipStatusOfHome + ", address=" + address
				+ ", howLongHaveYouLivedAtThisAddress=" + howLongHaveYouLivedAtThisAddress
				+ ", isThisYourCorrespondenceAddress=" + isThisYourCorrespondenceAddress + ", telephoneNumber="
				+ telephoneNumber + ", canBeContactedByTelephone=" + canBeContactedByTelephone
				+ ", whereDoYouUseThisNumber=" + whereDoYouUseThisNumber + ", contactEmail=" + contactEmail
				+ ", whoDoesThisEmailBelongTo=" + whoDoesThisEmailBelongTo + ", secondaryEmail=" + secondaryEmail
				+ ", drivingLicense=" + drivingLicense + ", doYouHaveAValidNationalIdentityCard="
				+ doYouHaveAValidNationalIdentityCard + ", passportIssueDate=" + passportIssueDate
				+ ", passportExpiryDate=" + passportExpiryDate + ", countryOfNationality=" + countryOfNationality
				+ ", issuingAuthority=" + issuingAuthority + ", doYouHaveAUkDriversLicense="
				+ doYouHaveAUkDriversLicense + ", doYouHaveAUkNationalInsuranceNumber="
				+ doYouHaveAUkNationalInsuranceNumber + ", NationalInsuranceNumber=" + NationalInsuranceNumber
				+ ", dependantPassportNo=" + dependantPassportNo + ", dependantFamilyName=" + dependantFamilyName
				+ ", dependantSalutation=" + dependantSalutation + ", dependantGender=" + dependantGender
				+ ", dependantGivenName=" + dependantGivenName + ", dependantRelationshipToYou="
				+ dependantRelationshipToYou + ", dependantNationalitySameAsApplicant="
				+ dependantNationalitySameAsApplicant + ", dependantCountryOfNationality="
				+ dependantCountryOfNationality + ", dependantDateOfBirth=" + dependantDateOfBirth + "]";
	}



	
}
