package view;

import controller.CustomerController;

public class ViewStart {
	public static void main(String[] args) {

		// ���� �� ��� �˻�
		CustomerController.request(1);
		System.out.println("--��� ȸ�� �˻�--");
		CustomerController.request(5);
		System.out.println("-------------");
		System.out.println();
		System.out.println();

		// Ż�� �� ��� �˻�
		CustomerController.request(2);
		System.out.println("--��� ȸ�� �˻�--");
		CustomerController.request(5);
		System.out.println("-------------");
		System.out.println();
		System.out.println();

		// Ŀ�� 1ȸ ��� �� �˻���
		CustomerController.request(3);
		System.out.println();
		System.out.println();

		// ���� 1ȸ ��� �� �˻���
		CustomerController.request(4);
		System.out.println();
		System.out.println();

		// �� ��� �˻�
		CustomerController.request(6);
		System.out.println();
		System.out.println();

		// ���� �ϼ��� ���� ���׷��̵�
		CustomerController.request(7);
	}

}
