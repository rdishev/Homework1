package Homework1_Radoslav_Dishev;

public class Task2_LeapYear {
	public static void main(String[] args) {
		int year = 2011;
		if ((year % 4 == 0) && (year % 100!= 0) || (year%400 == 0)) {
			System.out.println("Leap year");
		} 
		else  {
			System.out.println("Not a leap year");
		}
		}
		
				
}

