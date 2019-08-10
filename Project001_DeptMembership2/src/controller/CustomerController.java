package controller;

import model.CustomerModel;
import model.domain.Customer;
import view.ViewEnd;

public class CustomerController {
	public static void request(int reqNumber) {
		if (reqNumber == 1) {

			boolean r = CustomerModel.insert(new Customer("��޶�", 20, 10, 2, "black", 9));

			if (r) {
				ViewEnd.printSuccess("���� ����");
			} else {
				ViewEnd.printFail("���� ����");
			}

		} else if (reqNumber == 2) {
			CustomerModel.delete("���ھ�");

		} else if (reqNumber == 3) {
			CustomerModel.freeCoffee("����ö");

		} else if (reqNumber == 4) {
			CustomerModel.freeParking("������");

		} else if (reqNumber == 5) {
			ViewEnd.printAll(CustomerModel.getAll());

		} else if (reqNumber == 6) {
			CustomerModel.getOne("��޶�");
			boolean r = CustomerModel.insert(new Customer("��޶�", 20, 10, 2, "black", 9));

			if (r) {
				ViewEnd.printSuccess("���� ����");
			} else {
				ViewEnd.printFail("���� ����");
			}

		} else if (reqNumber == 7) {
			CustomerModel.upGrade("������");
			ViewEnd.printSuccess("��� ��µǾ����ϴ�");
			CustomerModel.getOne("������");

		} else {
			ViewEnd.printFail("��û�Ͻ� ������ ���� �� �� �����ϴ�");
		}
	}
}