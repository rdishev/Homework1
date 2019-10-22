package task1_DateDifference;

import java.time.LocalDate;

public class SwiftDate {

	private int year;
	private int month;
	private int day;

	public SwiftDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public boolean isLeapyear(int year) {
		if (year % 4 == 0) {
			return true;
		} else {
			if (year % 100 == 0 && year % 400 == 0) {
				return true;
			}
			return false;
		}
	}

	public int getCentury(int year) {
		if (year < 100) {
			return 1;
		} else {
			return year / 100 + 1;
		}
	}

	public int getDaysDifference(SwiftDate other) {
		return (this.year - other.year) * 365 + (this.month - other.month) * 30 + (this.day - other.day);
	}

	public void printInfo(SwiftDate toprint) {
		LocalDate date = LocalDate.of(toprint.year, toprint.month, toprint.day);
		System.out.print("" + date + " - " + toprint.getCentury(toprint.year) + " century.");
		if (toprint.isLeapyear(toprint.year) == true) {
			System.out.print(" It is LEAP Year.");
		}
		System.out.println();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int newYear) {
		year = newYear;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int newMonth) {
		month = newMonth;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int newDay) {
		day = newDay;
	}

	public static void main(String[] args) {
		SwiftDate date1 = new SwiftDate(2000, 8, 14);

		SwiftDate date2 = new SwiftDate(1994, 6, 25);
		System.out.println(date1.getDaysDifference(date2));
		date1.printInfo(date1);
		date2.printInfo(date2);
	}
}
