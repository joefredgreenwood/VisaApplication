package com.mastek.visaApplication.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;

@Entity
@Table(name="LANGUAGES")
public class Languages {
	
	private int languageId;
	@FormParam("languageName")
	private String languageName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	@Override
	public String toString() {
		return "Languages [languageId=" + languageId + ", languageName=" + languageName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + languageId;
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
		Languages other = (Languages) obj;
		if (languageId != other.languageId)
			return false;
		return true;
	}
	
	
	
	// Join to Personal Details
	
	
	
	Set<PersonalDetails>languageHistory = new HashSet<>();
	@OneToMany(mappedBy="languageLink", cascade= CascadeType.ALL)
	public Set<PersonalDetails> getLanguageHistory() {
		return languageHistory;
	}
	public void setLanguageHistory(Set<PersonalDetails> languageHistory) {
		this.languageHistory = languageHistory;
	}


	
	
	
	
	

}
