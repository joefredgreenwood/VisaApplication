package com.mastek.visaApplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Transient;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="PAYMENT_INFO")
public class Payment {
	
	private int paymentRef;
	
	@FormParam("totalFee")
	private double totalFee;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	public int getPaymentRef() {
		return paymentRef;
	}
	public void setPaymentRef(int paymentRef) {
		this.paymentRef = paymentRef;
	}
	public double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (paymentRef ^ (paymentRef >>> 32));
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
		Payment other = (Payment) obj;
		if (paymentRef != other.paymentRef)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Payment [paymentRef=" + paymentRef + ", totalFee=" + totalFee + "]";
	}
	
	PersonalDetails paymentLink;



	
	// Join to Personal Details

	@ManyToOne
	@JoinColumn(name="fk_passportNo")
	@org.springframework.data.annotation.Transient
	@XmlTransient
	public PersonalDetails getPaymentLink() {
		return paymentLink;
	}
	public void setPaymentLink(PersonalDetails paymentLink) {
		this.paymentLink = paymentLink;
	}
	
	
	
	
	
	
	
	

}
