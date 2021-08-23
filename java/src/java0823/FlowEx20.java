package java0823;

import java.util.Scanner;

public class FlowEx20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복해서 숫자를 입력받다가 0을 입력하면 입력을 마치고 총 합을 출력하는 예제
		/*
		 * 설명 : 처음에 flag에 true를 저장해서 계속 반복하다가 0입력시 flag값도 false로 변경하여 반복종료
		 */
		
		int num;
		int sum=0;
		
		//while문의 조건식으로 사용될 변수
		boolean flag=true;
		
		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0입력)");
		Scanner sc=new Scanner(System.in);
		
		//flag는 true이때문에 계속 반복된다.
		while(flag) {
			System.out.println(">>");
			String tmp=sc.nextLine();
			num=Integer.parseInt(tmp);
			
			//num의 값이 0이 아니면 누적합계
			if(num!=0) {
				sum+=num;
				
			//num의 값이 0이면 flag의 값 false로 변경 -> while문 종료(while문의 조건이 flag이므로 true->false)
			}else {
				flag=false;
			}
		}
		System.out.println("합계: "+sum);
	}

}
