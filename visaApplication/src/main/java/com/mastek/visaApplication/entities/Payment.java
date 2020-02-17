package com.mastek.visaApplication.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_INFO")
public class Payment {
	
	int paymentId;
	long paymentRef;
	double totalFee;
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
	
	
	
	

}
