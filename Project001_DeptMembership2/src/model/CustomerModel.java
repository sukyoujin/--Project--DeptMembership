package model;

import model.domain.Customer;

public class CustomerModel {

	private static Customer[] member = new Customer[5];

	private static int index;

	static {
		member[0] = new Customer("석유진", 27, 9, 1, "black", 29);
		member[1] = new Customer("지인철", 29, 7, 2, "black", 19);
		member[2] = new Customer("엔코아", 28, 8, 1, "red", 9);
		index = 3;
	}

	// 1. 가입
	public static boolean insert(Customer v) {
		if (index < 5) {
			member[index++] = v;
			return true;
		} else {
			return false;
		}
	}

	// 2. 탈퇴(삭제)
	public static boolean delete(String name) {
		Customer v = null;

		for (int i = 0; i < member.length; i++) {
			v = member[i];
			if (v != null && v.getName().equals(name)) {
				member[i] = null;
				return true;
			}
		}
		return false;
	}

	// 3. 사용(수정)
	// -1 커피 사용
	public static boolean freeCoffee(String name) {
		Customer v = null;
		for (int i = 0; i < member.length; i++) {
			v = member[i];
			if (v != null && v.getName().equals(name)) {
				if (v.getFreeCoffee() != 0) {
					v.setFreeCoffee(v.getFreeCoffee() - 1);
					System.out.println("---회원님의 정보---");
					System.out.println(v.toString());
					System.out.println("--------------");
				} else {
					System.out.println("남은 무료 커피가 없습니다");
				}
			}
		}
		return false;
	}

	// -1 주차 사용
	public static boolean freeParking(String name) {
		Customer v = null;
		for (int i = 0; i < member.length; i++) {
			v = member[i];
			if (v != null && v.getName().equals(name)) {
				if (v.getFreeParking() != 0) {
					v.setFreeParking(v.getFreeParking() - 1);
					System.out.println("---회원님의 정보---");
					System.out.println(v.toString());
					System.out.println("--------------");
				} else {
					System.out.println("남은 무료 주차가 없습니다");
				}
			}
		}
		return false;
	}

	// 5. 모든 사람 검색
	public static Customer[] getAll() {
		return member;
	}

	// 6. 한 사람 검색
	public static Customer[] getOne(String name) {
		Customer v = null;
		for (int i = 0; i < member.length; i++) {
			v = member[i];
			if (v != null && v.getName().equals(name)) {
				System.out.println("---회원님의 정보---");
				System.out.println(v.toString());
				System.out.println("--------------");
			} else {
				System.out.println("정보가 맞지 않습니다");
			}
		}
		return member;
	}

//	public static boolean getOne(String name) {
//		Customer v = null;
//		for (int i = 0; i < member.length; i++) {
//		v = member[i];
//		if(v != null && v.getName().equals(name)) {	
//			return true;
//		}break;
//	}	return false;
//	}	

	// 7. upgrade
	public static boolean upGrade(String name) {
		Customer v = null;
		for (int i = 0; i < member.length; i++) {
			v = member[i];

//			int a = v.getCount();
//			int a = v.getCount(); -> 아래에 a = v.getCount(); 하면 중복 처리 안 됨
//			통상적으로 if문 밖에 선언을 하지만 때에 따라서는 안에 다시 선언해야 할 때도 있디
			if (v != null && v.getName().equals(name)) {
				v.setCount(v.getCount() + 1);
				int a = v.getCount();

				if (a >= 30) {
					v.setGrade("Silver");
				} else if (a >= 20) {
					v.setGrade("Black");
				} else if (a >= 10) {
					v.setGrade("Red");
				}
				return true;
			}
		}
		return false;
	}

//	for (int i = 0; i < member.length; i++) {
//	v = member[i];
//	int a = v.getCount();
//	if(v != null && v.getName().equals(name)) {
//		v.setCount(v.getCount() + 1);
//		if( a >= 30) {
//			v.setGrade("Silver");
//		}else if(a >= 20) {
//			v.setGrade("Black");
//		}else if(a >= 10) {
//			v.setGrade("Red");
//		}return true; 
//	}
//}return false;
//}	

//	for (int i = 0; i < member.length; i++) {
//		v = member[i];
//
//		if (v != null && v.getName().equals(name)) {
//			int a = v.getCount();
//
//			System.out.println(v.getCount() + 1);
//			v.setCount(v.getCount() + 1);
//
//			if (a >= 30) {
//				v.setGrade("Silver");
//			} else if (a >= 20) {
//				v.setGrade("Black");
//			} else if (a >= 10) {
//				v.setGrade("Red");
//			}
//		}
//		return true;
//	}
//	return false;
}
