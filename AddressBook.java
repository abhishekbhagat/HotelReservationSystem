package com.bridgelabz.problem;
import java.util.HashSet;
import java.util.Scanner;

public class AddressBook {
	private static HashSet<ContactPerson> contactPersonList = new HashSet();

	public static void main(String[] args) {
		addContactPerson();
		searchContactByState("Jharkhand");
		searchContactByCity("Jamshedpur");
	}

	/**
	 * uc7
	 * 
	 */
	public static void addContactPerson() {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the First Name ");
		String firstName = scannerObj.next();
		System.out.println("Enter the last Name ");
		String lastName = scannerObj.next();
		System.out.println("Enter the address ");
		String address = scannerObj.next();
		System.out.println("Enter the  city ");
		String city = scannerObj.next();
		System.out.println("Enter the state ");
		String state = scannerObj.next();
		System.out.println("Enter the zip ");
		String zip = scannerObj.next();
		System.out.println("Enter the phoneNumber ");
		double phoneNumber = scannerObj.nextDouble();
		System.out.println("Enter the email ");
		String email = scannerObj.next();

		int flag = 0;
		ContactPerson contactPerson = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber,
				email);
		for (ContactPerson contactPersonInList : contactPersonList) {
			if (contactPerson.getFirstName().equals(contactPersonInList.getLastName())
					&& contactPerson.getLastName().equals(contactPersonInList.getLastName()))
				flag = 1;
		}
		if (flag == 0)
			contactPersonList.add(contactPerson);
		scannerObj.close();
	}
	/**
	 * uc8
	 * @param city
	 */
	public static void  searchContactByCity(String city) {
		for (ContactPerson contactPerson : contactPersonList) {
			if (contactPerson.getCity().equals(city))
				showContactPerson(contactPerson);

		}
	}
	
	/**
	 * uc8
	 * @param state
	 */
	public static void  searchContactByState(String state) {
		for (ContactPerson contactPerson : contactPersonList) {
			if (contactPerson.getCity().equals(state))
				showContactPerson(contactPerson);

		}
	}
	public static void showContactPerson(ContactPerson contactPerson) {
		System.out.println(contactPerson.getFirstName());
		System.out.println(contactPerson.getLastName());
		System.out.println(contactPerson.getAddress());
		System.out.println(contactPerson.getCity());
		System.out.println(contactPerson.getState());
		System.out.println(contactPerson.getZip());
		System.out.println(contactPerson.getPhoneNumber());
		System.out.println(contactPerson.getEmail());
	}

}