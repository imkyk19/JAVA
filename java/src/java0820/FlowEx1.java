package java0820;

import java.util.Scanner;

public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		char grade = ' ';
		
		System.out.println("������ �Է��ϼ���.");
		Scanner sc= new Scanner(System.in);
		
		//�Է¹��� ������ tmp�� ����
		String tmp = sc.nextLine();
		
		//String Ÿ���� intŸ������ ����ȯ
		score = Integer.parseInt(tmp);
		
		//score�� 90������ ���ų� ũ�� A����
		if(score>=90) {
			grade='A';
		}else if(score>=80){
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else{
			grade='D';
		}
		
		System.out.println("����� ������ "+grade+"�Դϴ�. ");
		
	}

}
