package java0820;

import java.util.Scanner;

public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		char grade = ' ';
		
		System.out.println("점수를 입력하세요.");
		Scanner sc= new Scanner(System.in);
		
		//입력받은 내용을 tmp에 저장
		String tmp = sc.nextLine();
		
		//String 타입을 int타입으로 형변환
		score = Integer.parseInt(tmp);
		
		//score가 90점보다 같거나 크면 A학점
		if(score>=90) {
			grade='A';
		}else if(score>=80){
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else{
			grade='D';
		}
		
		System.out.println("당신의 학점은 "+grade+"입니다. ");
		
	}

}
