package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task0d_ReadNNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			int numberprint = sc.nextInt();
			System.out.println(numberprint);
		}
	}
}
