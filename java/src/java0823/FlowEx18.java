package java0823;

import java.util.Scanner;

public class FlowEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//숫자 입력을 받고 이 숫자의 각 자리의 합을 구하는 예제
		int num=0, sum=0;
		System.out.println("숫자를 입력하세요. (예:12345)");
		
		Scanner sc=new Scanner(System.in);
		String tmp=sc.nextLine();
		num=Integer.parseInt(tmp);
		
		//입력 받은 숫자가 0이 아닐동안 반복
		while(num!=0) {
			
			//어떤 수를 10으로 나머지 연산하면 마지막 자리를 구할 수 있음
			//합계는 입력받은 숫자를 10으로 나눈 나머지를 더한 값
			sum+=num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			//num의 값은 num/=10에 의해 한자리씩 줄어들다가 0이되면 while문 종료
			num=num/10;
		}
		
		System.out.println("각 자리수의 합: "+sum);
	}

	/*
	sum=  5 num=12345
	sum=  9 num=1234
	sum= 12 num=123
	sum= 14 num=12
	sum= 15 num=1
	각 자리수의 합: 15

	 */
}
