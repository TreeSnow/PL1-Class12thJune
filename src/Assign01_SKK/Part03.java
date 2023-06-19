package Assign01_SKK;

import java.util.Random;
import java.util.Scanner;

public class Part03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age, origin, guess;
		String firstName, lastName;
		Scanner kb = new Scanner(System.in);

		System.out.println("Please Enter your first Name : ");
		firstName = kb.next();
		System.out.println("Please Enter your last Name : ");
		lastName = kb.next();
		System.out.println("Please Enter your age : ");
		age = kb.nextInt();

		System.out.printf("Hello : %s, you have %d years old; nice to meet you! %n", lastName, age);
		Random rand = new Random();
		origin = rand.nextInt(1, 50 + 1); // random number from 1 to 50

		System.out.println("Please guess a number between 1 and 50 : ");
		guess = kb.nextInt();

		if (guess == origin) {
			System.out.println("You are lucky!!");

		} else if (guess > origin) {
			System.out.println("Choose a smaller one, you were unlucky!!");
		} else {
			System.out.println("Choose a bigger one, you were unlucky!!");
		}

		kb.close();

	}

}
