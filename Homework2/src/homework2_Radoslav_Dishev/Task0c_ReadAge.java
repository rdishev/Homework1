package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task0c_ReadAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter age:");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("This person is of age.");
		}
		else {
			System.out.println("This person is not of age.");
		}
	}
}
