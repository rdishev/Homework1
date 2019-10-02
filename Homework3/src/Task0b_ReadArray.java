import java.util.Scanner;

public class Task0b_ReadArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			arr [i] = sc.nextInt(); 
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
			if (arr.length - 1 <= j) {
				break;
			}
			System.out.print(", ");
		}
	}
}
