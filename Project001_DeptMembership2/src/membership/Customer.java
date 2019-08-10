//190703과제
package membership;

public class Customer {

	private String name;
	private int freeCoffee;
	private int freeParking;

	public Customer() {}

	public Customer(String name, int freeCoffee, int freeParking) {
		this.name = name;
		this.freeCoffee = freeCoffee;
		this.freeParking = freeParking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	static Customer[] customerArray() {
		Customer[] v = { new Customer("석유진", 4, 2), new Customer("석유정", 9, 1) };
		return v;
	}

	static void customerArray2() {
		Customer[] v = customerArray();
		for (int i = 0; i < v.length; i++) {
			System.out.println("이번 달 " + v[i].getName() + "님의 남은 혜택");
			System.out.println("무료 커피 : " + v[i].getFreeCoffee());
			System.out.println("무료 주차 : " + v[i].getFreeParking());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		customerArray2();
	}
}
