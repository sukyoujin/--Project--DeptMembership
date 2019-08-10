package model;

import model.domain.Customer;

public class CustomerModel {

	private static Customer[] member = new Customer[5];

	private static int index;

	static {
		member[0] = new Customer("������", 27, 9, 1, "black", 29);
		member[1] = new Customer("����ö", 29, 7, 2, "black", 19);
		member[2] = new Customer("���ھ�", 28, 8, 1, "red", 9);
		index = 3;
	}

	// 1. ����
	public static boolean insert(Customer v) {
		if (index < 5) {
			member[index++] = v;
			return true;
		} else {
			return false;
		}
	}

	// 2. Ż��(����)
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

	// 3. ���(����)
	// -1 Ŀ�� ���
	public static boolean freeCoffee(String name) {
		Customer v = null;
		for (int i = 0; i < member.length; i++) {
			v = member[i];
			if (v != null && v.getName().equals(name)) {
				if (v.getFreeCoffee() != 0) {
					v.setFreeCoffee(v.getFreeCoffee() - 1);
					System.out.println("---ȸ������ ����---");
					System.out.println(v.toString());
					System.out.println("--------------");
				} else {
					System.out.println("���� ���� Ŀ�ǰ� �����ϴ�");
				}
			}
		}
		return false;
	}

	// -1 ���� ���
	public static boolean freeParking(String name) {
		Customer v = null;
		for (int i = 0; i < member.length; i++) {
			v = member[i];
			if (v != null && v.getName().equals(name)) {
				if (v.getFreeParking() != 0) {
					v.setFreeParking(v.getFreeParking() - 1);
					System.out.println("---ȸ������ ����---");
					System.out.println(v.toString());
					System.out.println("--------------");
				} else {
					System.out.println("���� ���� ������ �����ϴ�");
				}
			}
		}
		return false;
	}

	// 5. ��� ��� �˻�
	public static Customer[] getAll() {
		return member;
	}

	// 6. �� ��� �˻�
	public static Customer[] getOne(String name) {
		Customer v = null;
		for (int i = 0; i < member.length; i++) {
			v = member[i];
			if (v != null && v.getName().equals(name)) {
				System.out.println("---ȸ������ ����---");
				System.out.println(v.toString());
				System.out.println("--------------");
			} else {
				System.out.println("������ ���� �ʽ��ϴ�");
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
//			int a = v.getCount(); -> �Ʒ��� a = v.getCount(); �ϸ� �ߺ� ó�� �� ��
//			��������� if�� �ۿ� ������ ������ ���� ���󼭴� �ȿ� �ٽ� �����ؾ� �� ���� �ֵ�
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
