package java0823;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.");
		Scanner sc=new Scanner(System.in);
		int user=sc.nextInt();
		
		//1,2,3 �� �ϳ��� com�� ����� (Math.random���� ���� ���ϱ�)
		int com=(int)(Math.random()*3)+1;
		
		System.out.println("����� "+user+"�Դϴ�.");
		System.out.println("��ǻ�ʹ� "+com+"�Դϴ�.");
		
		switch(user-com) {
			case 2:
			case -1:
				System.out.println("����� �����ϴ�.");
				break;
			case 1:
			case -2:
				System.out.println("����� �̰���ϴ�.");
				break;
			case 0:
				System.out.println("�����ϴ�.");
				break;
		}
	}

}
