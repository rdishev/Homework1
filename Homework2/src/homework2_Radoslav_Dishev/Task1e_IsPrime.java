package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task1e_IsPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 2 <= 0) {
			System.out.println("false");
		}
		else if (number % 3 <= 0) {
			System.out.println("false");
		}
		else if (number % 5 <= 0) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
		}
	}

