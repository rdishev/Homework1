package Task2;

import java.util.Scanner;

public class Task2d_PrintSplitIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr [i] = sc.nextInt();
			sum += arr[i];
		}
		int leftsum = 0;
		for (int j = 0; j < arr.length; j++) {
			leftsum += arr[j];
			sum = sum - arr[j];
			if (leftsum == sum) {
				System.out.println(j);
				break;
			}
			else if (leftsum >= sum) {
				System.out.println("NO");
				
			}
		}
	}
}
