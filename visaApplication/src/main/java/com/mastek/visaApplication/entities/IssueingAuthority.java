package com.mastek.visaApplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
@Table(name="ISSUEING_AUTHORITY")
public class IssueingAuthority {
	
	int issueingAuthorityId;
	
	@FormParam("issueingAuthorityName")
	String issueingAuthorityName;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIssueingAuthorityId() {
		return issueingAuthorityId;
	}
	public void setIssueingAuthorityId(int issueingAuthorityId) {
		this.issueingAuthorityId = issueingAuthorityId;
	}
	public String getIssueingAuthorityName() {
		return issueingAuthorityName;
	}
	public void setIssueingAuthorityName(String issueingAuthorityName) {
		this.issueingAuthorityName = issueingAuthorityName;
	}
	@Override
	public String toString() {
		return "IssueingAuthority [issueingAuthorityId=" + issueingAuthorityId + ", issueingAuthorityName="
				+ issueingAuthorityName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + issueingAuthorityId;
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
		IssueingAuthority other = (IssueingAuthority) obj;
		if (issueingAuthorityId != other.issueingAuthorityId)
			return false;
		return true;
	}
	


}
