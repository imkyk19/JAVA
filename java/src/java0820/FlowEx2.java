package java0820;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		char grade = ' ';
		char opt = '0';
		
		System.out.println("점수를 입력해주세요");
		
		Scanner sc= new Scanner(System.in);
		String tmp=sc.nextLine();
		score = Integer.parseInt(tmp);
		
		System.out.printf("점수 : %d", score);
		
		//90점 이상인 경우 학점 A
		if(score>=90) {
			grade = 'A';
			//98점 이상 : +
			if(score>=98) {
				opt='+';
			//94점 미만 : -
			}else if(score<94) {
				opt='-';
			}
		}else if(score>=80) {
			grade = 'B';
			if(score>=88) {
				opt='+';
			}else if(score<84) {
				opt='-';
			}			
		}else {
			grade='C';
		}
		
		System.out.printf("학점 : %c%c", grade, opt);
	}

}
