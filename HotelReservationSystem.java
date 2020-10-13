package com.bridgelabz.problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Calendar;

public class HotelReservationSystem {
	private static List<Hotel> hotelList = new ArrayList<>();

	public static void main(String[] args) throws ParseException {

		Hotel lakeWood = new Hotel("Lakewood", 110, 80, 90, 80, 3);
		Hotel bridgewood = new Hotel("Bridgewood", 160, 110, 60, 50, 4);
		Hotel ridgewood = new Hotel("Ridgewood", 220, 100, 150, 40, 5);
		hotelList.add(lakeWood);
		hotelList.add(bridgewood);
		hotelList.add(ridgewood);
		calculateTotalPrice(hotelList);
		Hotel hotelListOfMinimumPrice = hotelList.stream()
				.min((hotel1, hotel2) -> hotel1.getTotalPrice() > hotel2.getTotalPrice() ? 1 : -1).get();
		Hotel desiredHotelList = hotelList.stream()
				.filter(hotel -> hotel.getTotalPrice() == hotelListOfMinimumPrice.getTotalPrice())
				.max((hotel1, hotel2) -> hotel1.getRating() > hotel2.getRating() ? 1 : -1).get();
		System.out.println(desiredHotelList.getName() + ", Rating: " + desiredHotelList.getRating()
				+ "and Total prices: $" + desiredHotelList.getTotalPrice());
	}

	/**
	 * @param hotelList
	 * @throws ParseException
	 */
	public static void calculateTotalPrice(List<Hotel> hotelList) throws ParseException {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the Custome type ");
		String customerType = scannerObj.next();
		Calendar calendar = Calendar.getInstance();
		String date1 = scannerObj.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("ddMMMyyyy");
		Date yourDate = format.parse(date1);
		calendar.setTime(yourDate);
		int day1 = calendar.get(Calendar.DAY_OF_WEEK);
		String date2 = scannerObj.nextLine();
		Date yourDate2 = format.parse(date2);
		calendar.setTime(yourDate2);
		int day2 = calendar.get(Calendar.DAY_OF_WEEK);
		for (Hotel hotel : hotelList) {
			if (customerType.equals("RewardCustomer")) {
				if ((day1 == 1 || day1 == 7))
					hotel.setTotalPrice(hotel.getTotalPrice() + hotel.getWeekendRateForRewardCustomer());
				else
					hotel.setTotalPrice(hotel.getTotalPrice() + hotel.getWeekdayRateForRewardCustomer());
				if (day2 == 1 || day2 == 7)
					hotel.setTotalPrice(hotel.getTotalPrice() + hotel.getWeekendRateForRewardCustomer());
				else
					hotel.setTotalPrice(hotel.getTotalPrice() + hotel.getWeekdayRateForRewardCustomer());
			} else {
				if ((day1 == 1 || day1 == 7))
					hotel.setTotalPrice(hotel.getTotalPrice() + hotel.getWeekendRateForRegularCustomer());
				else
					hotel.setTotalPrice(hotel.getTotalPrice() + hotel.getWeekdayRateForRegularCustomer());
				if (day2 == 1 || day2 == 7)
					hotel.setTotalPrice(hotel.getTotalPrice() + hotel.getWeekendRateForRegularCustomer());
				else
					hotel.setTotalPrice(hotel.getTotalPrice() + hotel.getWeekdayRateForRegularCustomer());
			}
		}
		scannerObj.close();
	}
}
