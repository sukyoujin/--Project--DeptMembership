package model.domain;

public class Customer {

	private String name, grade;
	private int age, count, freeParking, freeCoffee;

	public Customer() {}

	public Customer(String name, int age, int freeCoffee, int freeParking, String grade, int count) {
		this.name = name;
		this.age = age;
		this.freeCoffee = freeCoffee;
		this.freeParking = freeParking;
		this.grade = grade;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getFreeCoffee() {
		return freeCoffee;
	}

	public void setFreeCoffee(int freeCoffee) {
		this.freeCoffee = freeCoffee;
	}

	public int getFreeParking() {
		return freeParking;
	}

	public void setFreeParking(int freeParking) {
		this.freeParking = freeParking;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String toString() {
		return name + " (" + age + ")\n" + "등급: " + grade + "\n" + "구매일 수: " + count + "일\n" + "남은 무료 커피: " + freeCoffee
				+ "회\n" + "남은 무료 주차: " + freeParking + "회";
	}

}
