package view;

import controller.CustomerController;

public class ViewStart {
	public static void main(String[] args) {

		// 가입 후 모두 검색
		CustomerController.request(1);
		System.out.println("--모든 회원 검색--");
		CustomerController.request(5);
		System.out.println("-------------");
		System.out.println();
		System.out.println();

		// 탈퇴 후 모두 검색
		CustomerController.request(2);
		System.out.println("--모든 회원 검색--");
		CustomerController.request(5);
		System.out.println("-------------");
		System.out.println();
		System.out.println();

		// 커피 1회 사용 후 검색시
		CustomerController.request(3);
		System.out.println();
		System.out.println();

		// 주차 1회 사용 후 검색시
		CustomerController.request(4);
		System.out.println();
		System.out.println();

		// 한 사람 검색
		CustomerController.request(6);
		System.out.println();
		System.out.println();

		// 구매 일수에 따른 업그레이드
		CustomerController.request(7);
	}

}
