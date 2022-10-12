package com.fxtrading.FxTradingApplication.entity;

public class Book {
	private String currencyPair;
	private String customerName;
	private double tranferAmount;
	public String rate;
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
	public double getTranferAmount() {
		return tranferAmount;
	}
	public void setTranferAmount(double tranferAmount) {
		this.tranferAmount = tranferAmount;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Book [currencyPair=" + currencyPair + ", customerName=" + customerName + ", tranferAmount="
				+ tranferAmount + ", rate=" + rate + "]";
	}
	
	

		
	

}
