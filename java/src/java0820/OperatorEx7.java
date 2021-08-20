package java0820;

import java.util.Scanner;

public class OperatorEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char ch=' ';
		
		System.out.println("문자 하나를 입력하세요.");
		String input=sc.nextLine();
		
		//입력한 문자의 첫번째 자리를 char형 변수에 저장
		ch = input.charAt(0);
		
		if('0'<=ch && ch<='9') {
			System.out.println("입력하신 문자는 숫자입니다.\n" + ch);
		}
		
		if('a'<=ch && ch<='z') {
			System.out.println("입력하신 문자는 영문자입니다.\n" + ch);
		}
	}

}
