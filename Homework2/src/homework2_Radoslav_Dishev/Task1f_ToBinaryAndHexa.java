package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(Integer.toBinaryString(number));
		System.out.println(Integer.toHexString(number));
	}
}
