package com.card.model;

public class card {

	private String userName;
	private String cardType;
	private double usageAmount;
	private int topUpLimit;
	private int weeklyLimit;
	private int monthlyLimit;
	private long yearlyLimit;
	private double fees;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public double getUsageAmount() {
		return usageAmount;
	}
	public void setUsageAmount(double usageAmount) {
		this.usageAmount = usageAmount;
	}
	public int getTopUpLimit() {
		return topUpLimit;
	}
	public void setTopUpLimit(int topUpLimit) {
		this.topUpLimit = topUpLimit;
	}
	public int getWeeklyLimit() {
		return weeklyLimit;
	}
	public void setWeeklyLimit(int weeklyLimit) {
		this.weeklyLimit = weeklyLimit;
	}
	public int getMonthlyLimit() {
		return monthlyLimit;
	}
	public void setMonthlyLimit(int monthlyLimit) {
		this.monthlyLimit = monthlyLimit;
	}
	public long getYearlyLimit() {
		return yearlyLimit;
	}
	public void setYearlyLimit(long yearlyLimit) {
		this.yearlyLimit = yearlyLimit;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
}
