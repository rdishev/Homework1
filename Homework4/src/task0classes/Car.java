package task0classes;

public class Car {
	private String brand;
	private String model;
	private int year;
	private int horsepower;

	public Car(String brand, String model, int year, int horsepower) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.horsepower = horsepower;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String newBrand) {
		brand = newBrand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String newmodel) {
		model = newmodel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int newyear) {
		year = newyear;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int newhorsepower) {
		horsepower = newhorsepower;
	}

	public String InsurnceCategory(int year) {
		if (2019 - year < 8) {
			return "Category 1";
		} else if (2019 - year < 15) {
			return "Category 2";
		} else if (2019 - year < 25) {
			return "Category 3";
		} else {
			return "Category 4";
		}
	}

	public double TaxPayable(String category, int horsepower) {
		double payable = 0;
		if (category == "Category 1") {
			payable = 150;
		} else if (category == "Category 2") {
			payable = 200;
		} else if (category == "Category 3") {
			payable = 300;
		} else if (category == "Category 4") {
			payable = 500;
		}

		if (horsepower < 80) {
			return payable * 1.2;
		} else if (horsepower > 140) {
			return payable * 1.45;
		} else {

			return payable;
		}
	}

	public static void main(String[] args) {
		Car car1 = new Car("Mercedes-Benz", "S220", 2009, 160);
		Car car2 = new Car("Opel", "Astra", 1996, 85);
		Car car3 = new Car("Bugatti", "Veyron", 2015, 612);
		Car car4 = new Car("Lada", "5", 1989, 75);
		System.out.println(car1.brand + " " + car1.model + " "
				+ car1.TaxPayable(car1.InsurnceCategory(car1.year), car1.horsepower));
		System.out.println(car2.brand + " " + car2.model + " "
				+ car2.TaxPayable(car2.InsurnceCategory(car2.year), car2.horsepower));
		System.out.println(car3.brand + " " + car3.model + " "
				+ car3.TaxPayable(car3.InsurnceCategory(car3.year), car3.horsepower));
		System.out.println(car4.brand + " " + car4.model + " "
				+ car4.TaxPayable(car4.InsurnceCategory(car4.year), car4.horsepower));
	}
}
