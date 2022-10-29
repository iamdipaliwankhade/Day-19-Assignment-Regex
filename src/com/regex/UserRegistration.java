package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public boolean userName(String regex, String input) {
		return Pattern.compile(regex).matcher(input).matches();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name :");
		String firstName = "^[A-Z]{1}[a-z]{2,}$";
		String inputFirstName = sc.next();

		System.out.println("Enter Last Name :");
		String lastName = "^[A-z]{1}[a-z]{2,}$";
		String inputLastName = sc.next();

		UserRegistration ur = new UserRegistration();
		System.out.println(ur.userName(firstName, inputFirstName));
		System.out.println(ur.userName(lastName, inputLastName));

	}

}