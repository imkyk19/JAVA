package java0823;

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
		Scanner sc=new Scanner(System.in);
		String regNo=sc.nextLine();
		
		//�Է¹��� ���ڿ� regNo�� 8��° ���ڸ� gender�� ����
		char gender=regNo.charAt(6);
		
		switch(gender) {
			case '1':
			case '3':
				System.out.println("����� �����Դϴ�.");
				break;
			case '2':
			case '4':
				System.out.println("����� �����Դϴ�.");
				break;
				
			//1,2,3,4�� �ƴ� ��� default�� ����
			default:
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
	}

}
