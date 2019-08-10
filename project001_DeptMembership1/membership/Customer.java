//190703����
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
		Customer[] v = { new Customer("������", 4, 2), new Customer("������", 9, 1) };
		return v;
	}

	static void customerArray2() {
		Customer[] v = customerArray();
		for (int i = 0; i < v.length; i++) {
			System.out.println("�̹� �� " + v[i].getName() + "���� ���� ����");
			System.out.println("���� Ŀ�� : " + v[i].getFreeCoffee());
			System.out.println("���� ���� : " + v[i].getFreeParking());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		customerArray2();
	}
}
