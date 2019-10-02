package Homework1_Radoslav_Dishev;

public class Task5_SwapVariables {
	public static void main(String[] args) {
		int a = 5;
		int b = 11;
		
		System.out.println("Method 1:");
		System.out.println("Before the swap: " + a + "," + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After the swap: " + a + "," + b);
		
		System.out.println("Method 2:");
		int y,z;
		y = 15;
		z = 40;
		System.out.println("Before the swap: " + y + "," + z);
		y = y + z;
		z = y - z;
		y = y - z;
		System.out.println("After the swap: " + y + "," + z);
		
	}
}
