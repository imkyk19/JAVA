package java0823;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		char grade = ' ';
		
		System.out.println("����� ������ �Է��ϼ���.");
		
		Scanner sc=new Scanner(System.in);
//		String tmp=sc.nextLine();
//		score=Integer.parseInt(tmp);
		
		score=sc.nextInt();
		
		//score�� 10���� ������ int/int ����� int�̱� ������ 88/10�� 8.8�̾ƴ϶� 8��(80~89=8)
		switch(score/10) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		default:
			grade='F';
		}
		
		System.out.println("����� ������ "+grade+"�Դϴ�.");
	}

}
