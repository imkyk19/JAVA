package java0823;

import java.util.Scanner;

public class FlowEx8 {

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
				//switch�� ��ø
				switch(gender) {
				case '1':
					System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
					break;
				case '3':
					System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
					break;
				}
				//break�� ����
				break;
			case '2':
			case '4':
				switch(gender) {
				case '2':
					System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
					break;
				case '4':
					System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
					break;
				}
				
				break;
				
			//1,2,3,4�� �ƴ� ��� default�� ����
			default:
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
	}

}
