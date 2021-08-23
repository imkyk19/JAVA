package java0823;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("현재 월을 입력하세요.");
		
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		
		//switch(조건식)
		//조건식의 결과는 정수 or 문자열
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
			
		//조건식의 결과와 일치하는 case문이 없는 경우 default문 실행
		default:
		case 12:
		case 1:
		case 2:
			System.out.println("현재의 계절은 겨울입니다.");
		}
	}

}
