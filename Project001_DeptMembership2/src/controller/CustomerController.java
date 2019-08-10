package controller;

import model.CustomerModel;
import model.domain.Customer;
import view.ViewEnd;

public class CustomerController {
	public static void request(int reqNumber) {
		if (reqNumber == 1) {

			boolean r = CustomerModel.insert(new Customer("김달락", 20, 10, 2, "black", 9));

			if (r) {
				ViewEnd.printSuccess("가입 성공");
			} else {
				ViewEnd.printFail("가입 실패");
			}

		} else if (reqNumber == 2) {
			CustomerModel.delete("엔코아");

		} else if (reqNumber == 3) {
			CustomerModel.freeCoffee("지인철");

		} else if (reqNumber == 4) {
			CustomerModel.freeParking("석유진");

		} else if (reqNumber == 5) {
			ViewEnd.printAll(CustomerModel.getAll());

		} else if (reqNumber == 6) {
			CustomerModel.getOne("김달락");
			boolean r = CustomerModel.insert(new Customer("김달락", 20, 10, 2, "black", 9));

			if (r) {
				ViewEnd.printSuccess("가입 성공");
			} else {
				ViewEnd.printFail("가입 실패");
			}

		} else if (reqNumber == 7) {
			CustomerModel.upGrade("석유진");
			ViewEnd.printSuccess("등급 상승되었습니다");
			CustomerModel.getOne("석유진");

		} else {
			ViewEnd.printFail("요청하신 정보는 서비스 할 수 없습니다");
		}
	}
}