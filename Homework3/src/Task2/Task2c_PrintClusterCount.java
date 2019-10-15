package Task2;

import java.util.Scanner;

public class Task2c_PrintClusterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		for (int i = 0; i < arr.length; i++) {
			arr [i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 == arr.length) {
				break;
			}
			if (arr [i] != arr [i + 1]) {
				if (arr [i] == arr [i-1]) {
					count++;
				}
			}
			else if (arr [i] == arr [i + 1]) {
				if (i + 2 == arr.length)
				count++;
			}
		}
		System.out.println(count);
	}
}
