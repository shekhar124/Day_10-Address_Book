package com.bl.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bl.model.AddressBookModel;

public class AddressBookService {
	static ArrayList<AddressBookModel> addressBookModels = new ArrayList<>();

	public static Scanner scanner = new Scanner(System.in);

	static public AddressBookModel getContact(String name) {
		for (AddressBookModel cont : addressBookModels) {
			if (cont.getFirstName().equals(name)) {
				return cont;
			}
		}
		return null;
	}

	public void CreatePerson() {
		AddressBookModel addressBookModel = new AddressBookModel();

		System.out.println("Enter Your First Name");

		String firstName = scanner.next();
		System.out.println("Enter Your Last Name");
		String lastName = scanner.next();
		System.out.println("Enter Your city Name");
		String city = scanner.next();
		System.out.println("Enter Your state Name");
		String state = scanner.next();
		System.out.println("Enter Your phone Number");
		Double phNo = scanner.nextDouble();
		System.out.println("Enter Your zip");
		Double zip = scanner.nextDouble();
		System.out.println("Enter Your email");
		String email = scanner.next();

		addressBookModel.setFirstName(firstName);
		addressBookModel.setLastName(lastName);
		addressBookModel.setCity(city);
		addressBookModel.setEmail(email);
		addressBookModel.setPhoneNo(phNo);
		addressBookModel.setState(state);
		addressBookModel.setZip(zip);

		addressBookModels.add(addressBookModel);

	}

	public void UpdatePerson(String name, String update) // Update Person
	{
		int flag = 0;
		for (AddressBookModel model : addressBookModels) {
			if (model.getFirstName().equals(name)) {
				flag = 1;
				switch (update) {
				case "city":
					System.out.println("Enter city name to update:");
					String city = scanner.next();
					model.setCity(city);

					break;
				case "state":
					System.out.println("Enter state name to update:");
					String state = scanner.next();
					model.setState(state);
					break;
				case "phone":
					System.out.println("Enter phone number to update:");
					Double phNo = scanner.nextDouble();
					model.setPhoneNo(phNo);
					break;
				case "zip":
					System.out.println("Enter Your zip");
					Double zip = scanner.nextDouble();
					model.setZip(zip);
					break;
				}
			}
		}
		if (flag == 0)
			System.out.println("Person Not Found");
		else
			System.out.println("Updated Successfully");

	}

	public void DeletePerson(String name) // Delete Person
	{

		addressBookModels.remove(getContact(name));
		// int flag = 0;
		/*
		 * boolean equal = model.getFirstName().equals(name); if (equal == true) {
		 * 
		 * flag = 1; boolean s = addressBookModels.remove(model.getFirstName());
		 * System.out.println("remove data......."+s); // addressBookModels.remove(0);
		 * 
		 * }
		 */
		/*
		 * if (flag == 0)
		 * 
		 * System.out.println("Person Not found"); else
		 * System.out.println("Deleted Person");
		 */
		// }

	}

	public void print() {
		for (Object items : addressBookModels) {
			System.out.println(items);
		}
	}

}
