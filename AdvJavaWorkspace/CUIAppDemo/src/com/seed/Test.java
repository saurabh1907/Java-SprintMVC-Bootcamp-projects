package com.seed;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {		

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------");
			System.out.println("1:Get Current Time");			
			System.out.println("2:Exit");
			System.out.println("-----------------------");
			int choice = scanner.nextInt();
			
			if (choice == 1) {
				Date date = new Date();
				DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
				
				System.out.println("Current Time: " + dateFormat.format(date));
			} else if (choice == 2) {

				System.out.println("Application will be exited, now...");
				return;
			}
		}

	}
}
