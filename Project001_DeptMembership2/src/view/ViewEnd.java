package view;

import model.domain.Customer;

public class ViewEnd {

	public static void printAll(Customer[] all) {
		for (Customer v : all) {
			if (v != null) {
				System.out.println(v.toString());
			}
		}
	}

	public static void printSuccess(String msg) {
		System.out.println(msg);
	}

	public static void printFail(String msg) {
		System.out.println(msg);
	}

}
