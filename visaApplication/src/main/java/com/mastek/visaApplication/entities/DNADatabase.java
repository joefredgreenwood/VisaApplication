package com.mastek.visaApplication.entities;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.NamedQueries;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="DNA_Database")
public class DNADatabase {
	
	public DNADatabase() {
		// TODO Auto-generated constructor stub
	}
	
	long passportNumber;
	String firstName;
	String lastName;
	String crimeDescription;
	String crimeDate;
	
	@Id
	public long getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(long passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCrimeDescription() {
		return crimeDescription;
	}
	public void setCrimeDescription(String crimeDescription) {
		this.crimeDescription = crimeDescription;
	}
	public String getCrimeDate() {
		return crimeDate;
	}
	public void setCrimeDate(String crimeDate) {
		this.crimeDate = crimeDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (passportNumber ^ (passportNumber >>> 32));
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
		DNADatabase other = (DNADatabase) obj;
		if (passportNumber != other.passportNumber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DNADatabase [passportNumber=" + passportNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", crimeDescription=" + crimeDescription + ", crimeDate=" + crimeDate + "]";
	}
	
	

	
		

}
