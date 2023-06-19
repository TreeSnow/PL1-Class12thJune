package Assign01_SKK;

import java.util.Scanner;

public class Part02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month, year, yearCheck;
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the Month number : ");
		month = kb.nextInt();
		System.out.println("Input the Year number : ");
		year = kb.nextInt();

//		if (year % 400 == 0) {
//			yearCheck = 1; // Leap year check - Yes!
//		} else if (year % 100 == 0) {
//			if (year % 4 == 0) {
//				yearCheck = 1;
//			} else {
//				yearCheck = 2; // Common year
//			}
//
//		} else if (year % 4 == 0) {
//			yearCheck = 1;
//		} else {
//			yearCheck = 2;
//		}
//		

		if (year % 400 == 0) {
			yearCheck = 1; // Leap Year
		} else if (year % 4 == 0 && year % 100 != 0) {
			yearCheck = 1; // Leap Year
		} else {
			yearCheck = 2; // Common Year
		}

		if (yearCheck == 1) {
			System.out.println(year + " is Leap Year!!");
			switch (month) {
			case 1:
				System.out.println("January : 31 Days");
				break;
			case 2:
				System.out.println("February : 29 Days");
				break;
			case 3:
				System.out.println("March : 31 Days");
				break;
			case 4:
				System.out.println("April : 30 Days");
				break;
			case 5:
				System.out.println("May : 31 Days");
				break;
			case 6:
				System.out.println("June : 30 Days");
				break;
			case 7:
				System.out.println("July : 31 Days");
				break;
			case 8:
				System.out.println("August : 31 Days");
				break;
			case 9:
				System.out.println("September : 30 Days");
				break;
			case 10:
				System.out.println("October : 31 Days");
				break;
			case 11:
				System.out.println("November : 30 Days");
				break;
			case 12:
				System.out.println("December : 31 Days");
				break;
			default:
				System.out.println("Selected month number is " + month + " : There is no month like that number!");
				break;
			}

		} else {
			System.out.println(year + " is Common Year!!");
			switch (month) {
			case 1:
				System.out.println("January : 31 Days");
				break;
			case 2:
				System.out.println("February : 28 Days");
				break;
			case 3:
				System.out.println("March : 31 Days");
				break;
			case 4:
				System.out.println("April : 30 Days");
				break;
			case 5:
				System.out.println("May : 31 Days");
				break;
			case 6:
				System.out.println("June : 30 Days");
				break;
			case 7:
				System.out.println("July : 31 Days");
				break;
			case 8:
				System.out.println("August : 31 Days");
				break;
			case 9:
				System.out.println("September : 30 Days");
				break;
			case 10:
				System.out.println("October : 31 Days");
				break;
			case 11:
				System.out.println("November : 30 Days");
				break;
			case 12:
				System.out.println("December : 31 Days");
				break;
			default:
				System.out.println("Selected month number is " + month + " : There is no month like that number!");
				break;
			}

		}

		kb.close();
	}

}
