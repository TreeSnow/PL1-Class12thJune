package Assign01_SKK;

import java.util.Random;

public class Part01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Random rand = new Random();

		num = rand.nextInt(1, 12 + 1);

		switch (num) {
		case 1:
			System.out.println("Selected number is " + num + " : The month is January!");
			break;
		case 2:
			System.out.println("Selected number is " + num + " : The month is February!");
			break;
		case 3:
			System.out.println("Selected number is " + num + " : The month is March!");
			break;
		case 4:
			System.out.println("Selected number is " + num + " : The month is April!");
			break;
		case 5:
			System.out.println("Selected number is " + num + " : The month is May!");
			break;
		case 6:
			System.out.println("Selected number is " + num + " : The month is June!");
			break;
		case 7:
			System.out.println("Selected number is " + num + " : The month is July!");
			break;
		case 8:
			System.out.println("Selected number is " + num + " : The month is August!");
			break;
		case 9:
			System.out.println("Selected number is " + num + " : The month is September!");
			break;
		case 10:
			System.out.println("Selected number is " + num + " : The month is October!");
			break;
		case 11:
			System.out.println("Selected number is " + num + " : The month is November!");
			break;
		case 12:
			System.out.println("Selected number is " + num + " : The month is December!");
			break;
		default:
			System.out.println("Selected number is " + num + " : There is no month like that number!");
			break;
		}

	}

}
