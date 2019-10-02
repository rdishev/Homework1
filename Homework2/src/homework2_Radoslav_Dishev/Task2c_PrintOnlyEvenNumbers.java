package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			int nextnumber = sc.nextInt();
		
			if (nextnumber % 2 <= 0) {
				System.out.print(nextnumber + " ");
			}
		}
	}
}
