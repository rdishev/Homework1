package task2_EmployeeSalarySort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {

	private String name;
	private int salary;
	private String position;
	private String department;
	private int age = 0;
	private String email = "not set";
	
	public Employee (String name, int salary, String position, String department) {
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int newSalary) {
		salary = newSalary;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String newPosition) {
		position = newPosition;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Employee[] allemployees = new Employee[number];
		for(int i = 0; i < number; i++) {
			allemployees[i] = new Employee(sc.next(), sc.nextInt(), sc.next(), sc.next());
		}
		Arrays.sort(allemployees, Comparator.comparing(allemployees::salary));
	}
}

