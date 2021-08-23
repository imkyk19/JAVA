package java0823;

import java.util.Scanner;

public class FlowEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		
		System.out.println("*을 출력할 라인의 수를 입력하세요.");
		//ex : 10 입력
		/*
		*
		**
		***
		****
		*****
		******
		*******
		********
		*********
		**********
		 */
		
		Scanner sc=new Scanner(System.in);
		String tmp=sc.nextLine();
		num=Integer.parseInt(tmp);
		
		//scanner로 입력받은 수 만큼 행 반복
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
