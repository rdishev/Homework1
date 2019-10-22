package task0classes;

public class Person {

	private String name;
	private int age;

	Person() {
		this.name = "No name";
		this.age = -1;
	}

	Person(String name1) {
		this.name = name1;
		this.age = -1;
	}

	Person(String name2, int age2) {
		this.name = name2;
		this.age = age2;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public String introduction (String name, int age) {
		if(name == "No name") {
			return "Hello, I am John Doe.";
		} else if (age <= 0) {
			return "Hello, I am " + name + ".";
		} else {
			return "Hello, I am " + name + ". And I am " + age + " years old.";
		}
	}

		public static void main(String[] args) {
			Person peter = new Person();
			Person john = new Person("Not John Doe");
			Person john2 = new Person("John Doe 2", 22);
			System.out.println(peter.introduction(peter.name, peter.age));
			System.out.println(john.introduction(john.name, john.age));
			System.out.println(john2.introduction(john2.name, john2.age));
		}
}