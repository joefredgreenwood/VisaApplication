package com.mastek.visaApplication.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_INFO")
public class Payment {
	
	int paymentId;
	long paymentRef;
	double totalFee;
	
	@Id
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public long getPaymentRef() {
		return paymentRef;
	}
	public void setPaymentRef(long paymentRef) {
		this.paymentRef = paymentRef;
	}
	public double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentRef=" + paymentRef + ", totalFee=" + totalFee + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + paymentId;
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
		if (paymentId != other.paymentId)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
