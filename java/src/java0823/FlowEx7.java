package java0823;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		char grade = ' ';
		
		System.out.println("당신의 점수를 입력하세요.");
		
		Scanner sc=new Scanner(System.in);
//		String tmp=sc.nextLine();
//		score=Integer.parseInt(tmp);
		
		score=sc.nextInt();
		
		//score를 10으로 나누면 int/int 결과는 int이기 때문에 88/10은 8.8이아니라 8임(80~89=8)
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
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}

}
