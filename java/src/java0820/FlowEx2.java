package java0820;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		char grade = ' ';
		char opt = '0';
		
		System.out.println("������ �Է����ּ���");
		
		Scanner sc= new Scanner(System.in);
		String tmp=sc.nextLine();
		score = Integer.parseInt(tmp);
		
		System.out.printf("���� : %d", score);
		
		//90�� �̻��� ��� ���� A
		if(score>=90) {
			grade = 'A';
			//98�� �̻� : +
			if(score>=98) {
				opt='+';
			//94�� �̸� : -
			}else if(score<94) {
				opt='-';
			}
		}else if(score>=80) {
			grade = 'B';
			if(score>=88) {
				opt='+';
			}else if(score<84) {
				opt='-';
			}			
		}else {
			grade='C';
		}
		
		System.out.printf("���� : %c%c", grade, opt);
	}

}
