package java0823;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���� ���� �Է��ϼ���.");
		
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		
		//switch(���ǽ�)
		//���ǽ��� ����� ���� or ���ڿ�
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("������ ������ �����Դϴ�.");
			break;
			
		//���ǽ��� ����� ��ġ�ϴ� case���� ���� ��� default�� ����
		default:
		case 12:
		case 1:
		case 2:
			System.out.println("������ ������ �ܿ��Դϴ�.");
		}
	}

}
