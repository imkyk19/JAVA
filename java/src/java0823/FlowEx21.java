package java0823;

import java.util.Scanner;

public class FlowEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//do-while문 : {}블럭 내 문장을 먼저 실행 후 조건식 평가 즉, 최소한 한번은 수행될 것 보장
		//반복적으로 사용자의 입력을 받아서 처리할 때 유용하다.
		/*
		 * do{
		 * 	//조건식의 연산결과가 참일 때 수행될 문장
		 * }while(조건식);
		 */
		
		int input=0, answer=0;
		
		//1~100사이의 임의의 수를 answer에 저장
		answer=(int)(Math.random()*100)+1;
		System.out.println("answer: "+answer);
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요.");
			input=sc.nextInt();
			
			//입력한 수가 정답보다 큰 경우
			if(input>answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			
			//입력한 수가 정답보다 작은 경우
			}else if(input<answer) {
				System.out.println("더 큰수로 다시 시도해보세요.");
			}
		//do{}문장을 수행한 후에 입력한 수와 정답이 다를 경우 계속 do{}문장 반복(맞으면 while문 종료 후 정답입니다. 출력)
		}while(input!=answer);
		
		System.out.println("정답입니다.");
	}

}
