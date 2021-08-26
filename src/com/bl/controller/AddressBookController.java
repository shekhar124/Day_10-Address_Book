package com.bl.controller;

import java.util.Scanner;

import com.bl.model.AddressBookModel;
import com.bl.service.AddressBookService;

public class AddressBookController {

	private static AddressBookModel list;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 1;
		AddressBookService addressBookService = new AddressBookService();
		while (choice != 0) {
			System.out.println("1.Add Person\n2.Update Person\n3.Delete Person");
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addressBookService.CreatePerson();
				addressBookService.print();
				break;
			case 2:
				System.out.println("Enter name of person to Update");
				String name = scanner.next();
				System.out.println("Enter what to update(city/state/phone/zip):");
				String update = scanner.next();
				addressBookService.UpdatePerson(name, update);
				addressBookService.print();
				break;
			case 3:
				System.out.println("Enter name of person to Delete");
				String n = scanner.next();
				addressBookService.DeletePerson(n);
				addressBookService.print();
				break;
			}
		}

	}

}
