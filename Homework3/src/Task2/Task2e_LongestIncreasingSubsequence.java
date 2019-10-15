package Task2;

import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		String longest = "" + arr[0] + " ";
		String check = "" + arr[0] + " ";
		for (int i = 1; i < arr.length; i++) {
			if (arr [i-1] < arr [i] || check == "") {
				check += "" + arr[i] + " ";
			}
			else {
				check = arr[i] + " ";
			}
			if (check.length()>longest.length()) {
				longest = check;
			}
		}
		System.out.println(longest);
	}
}
