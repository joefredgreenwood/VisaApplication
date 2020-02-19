package com.mastek.visaApplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;

@Entity
@Table(name="LANGUAGES")
public class Languages {
	
	int languageId;
	@FormParam("languageName")
	String languageName;
	
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
	
	
	

}
