package com.bridgelabz.problem;

public class Hotel {
	private String name;
	private int weekdayRateForRegularCustomer;
	private int weekdayRateForRewardCustomer;
	private int weekendRateForRewardCustomer;
	private int weekendRateForRegularCustomer;
	private int rating;
	private int totalPrices;

	public void setTotalPrice(int totalPrices) {
		this.totalPrices = totalPrices;
	}

	public int getTotalPrice() {
		return totalPrices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeekdayRateForRegularCustomer() {
		return weekdayRateForRegularCustomer;
	}

	public void setWeekdayRateForRegularCustomer( int weekdayRateForRegularCustomer) {
		this.weekdayRateForRegularCustomer = weekdayRateForRegularCustomer;
	}

	public int getWeekdayRateForRewardCustomer() {
		return weekdayRateForRewardCustomer;
	}

	public void setWeekdayRateForRewardCustomer(int weekdayRateForRewardCustomer) {
		this.weekdayRateForRewardCustomer = weekdayRateForRewardCustomer;
	}

	public int getWeekendRateForRewardCustomer() {
		return weekendRateForRewardCustomer;
	}

	public void setWeekendRateForRewardCustomer(int weekendRateForRewardCustomer) {
		this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
	}

	public int getWeekendRateForRegularCustomer() {
		return weekendRateForRegularCustomer;
	}

	public void setWeekendRateForRegularCustomer(int weekendRateForRegularCustomer) {
		this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	public Hotel(String name, int weekdayRateForRegularCustomer, int weekdayRateForRewardCustomer,
			int weekendRateForRegularCustomer, int weekendRateForRewardCustomer, int rating) {
		super();
		this.name = name;
		this.weekdayRateForRegularCustomer = weekdayRateForRegularCustomer;
		this.weekdayRateForRewardCustomer = weekdayRateForRewardCustomer;
		this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
		this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
		this.rating = rating;
	}

}
