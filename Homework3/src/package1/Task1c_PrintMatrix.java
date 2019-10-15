package package1;

import java.util.Scanner;

public class Task1c_PrintMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] arr = new int[N][N];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (col % 2 <= 0) {
					arr [row][col] = col * N + 1 - col;
				}
				else {
					arr [row][col] = N * row + 1 + col;
				}
				System.out.print(arr[row][col] + " ");
		}
		System.out.println();
	}
}
}
