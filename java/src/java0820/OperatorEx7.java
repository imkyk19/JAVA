package java0820;

import java.util.Scanner;

public class OperatorEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char ch=' ';
		
		System.out.println("���� �ϳ��� �Է��ϼ���.");
		String input=sc.nextLine();
		
		//�Է��� ������ ù��° �ڸ��� char�� ������ ����
		ch = input.charAt(0);
		
		if('0'<=ch && ch<='9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.\n" + ch);
		}
		
		if('a'<=ch && ch<='z') {
			System.out.println("�Է��Ͻ� ���ڴ� �������Դϴ�.\n" + ch);
		}
	}

}
