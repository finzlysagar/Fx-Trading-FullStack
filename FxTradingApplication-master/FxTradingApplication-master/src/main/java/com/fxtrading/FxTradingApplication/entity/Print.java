package com.fxtrading.FxTradingApplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Print {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tradeNo;
	private String currencyPair;
	private String customerName;
	private double inrAmount;
	private double rate;
	public int getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(int tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getCurrencyPair() {
		return currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getInrAmount() {
		return inrAmount;
	}
	public void setInrAmount(double inrAmount) {
		this.inrAmount = inrAmount;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Print [tradeNo=" + tradeNo + ", currencyPair=" + currencyPair + ", customerName=" + customerName
				+ ", inrAmount=" + inrAmount + ", rate=" + rate + "]";
	}
	public Print(String currencyPair, String customerName, double inrAmount, double rate) {
		super();
		this.currencyPair = currencyPair;
		this.customerName = customerName;
		this.inrAmount = inrAmount;
		this.rate = rate;
	}
	public Print() {
	}
	
}
