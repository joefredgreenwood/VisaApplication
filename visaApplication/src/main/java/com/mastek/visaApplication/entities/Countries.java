package com.mastek.visaApplication.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement
@Entity
@Table(name="COUNTRIES")
public class Countries {
	
	int countryId;
	
	@FormParam("countryName")
	String countryName;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", countryName=" + countryName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryId;
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
		Countries other = (Countries) obj;
		if (countryId != other.countryId)
			return false;
		return true;
	}
	
	
	
	Set<PersonalDetails> nationalityHistory = new HashSet<>();


	@OneToMany(mappedBy= "nationalityLink", cascade= CascadeType.ALL)
	@XmlTransient
	public Set<PersonalDetails> getNationalityHistory() {
		return nationalityHistory;
	}
	public void setNationalityHistory(Set<PersonalDetails> nationalityHistory) {
		this.nationalityHistory = nationalityHistory;
	}
	
	
	Set<PersonalDetails>birthPlaceHistory = new HashSet<>();


	@OneToMany(mappedBy="birthPlaceLink", cascade= CascadeType.ALL)
	@XmlTransient
	public Set<PersonalDetails> getBirthPlaceHistory() {
		return birthPlaceHistory;
	}
	public void setBirthPlaceHistory(Set<PersonalDetails> birthPlaceHistory) {
		this.birthPlaceHistory = birthPlaceHistory;
	}
	
	Set<ApplicationForm> applicationFormAssigned = new HashSet<>();


@ManyToMany(mappedBy="countryVisitedAssigned")
@XmlTransient
	public Set<ApplicationForm> getApplicationFormAssigned() {
		return applicationFormAssigned;
	}
	public void setApplicationFormAssigned(Set<ApplicationForm> applicationFormAssigned) {
		this.applicationFormAssigned = applicationFormAssigned;
	}
	
	

	
	

	}
	


