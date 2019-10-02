package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String numberprint = "";
		for (int i = 1; i <= number; i++) {
			numberprint = numberprint + sc.nextInt() + " ";	
	}
		System.out.print(numberprint);
}
}