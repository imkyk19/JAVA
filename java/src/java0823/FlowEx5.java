package java0823;

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("주민번호를 입력하세요.");
		Scanner sc=new Scanner(System.in);
		String regNo=sc.nextLine();
		
		//입력받은 문자열 regNo의 8번째 문자를 gender에 저장
		char gender=regNo.charAt(6);
		
		switch(gender) {
			case '1':
			case '3':
				System.out.println("당신은 남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("당신은 여자입니다.");
				break;
				
			//1,2,3,4가 아닌 경우 default문 실행
			default:
				System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}

}
