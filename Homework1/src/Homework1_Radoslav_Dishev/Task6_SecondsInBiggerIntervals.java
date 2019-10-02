package Homework1_Radoslav_Dishev;

public class Task6_SecondsInBiggerIntervals {
	public static void main(String[] args) {
		int input = 776564;
		int D = input / 86400;
		int Drem = input % 86400;
		int H = Drem / 3600;
		int Hrem = Drem % 3600;
		int M = Hrem / 60;
		int S = Hrem % 60;
		System.out.println("Days: " + D + " Hours: " + H + " Minutes: " + M + " Seconds: " + S);
	}
}
