package java0823;

import java.util.Scanner;

public class FlowEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메뉴를 보여주고 선택하게 하는 예제
		//메뉴를 잘못 선택한 경우 continue문으로 다시 메뉴를 보여주고, 
		//종료(0)을 선택한 경우 break문으로 반복을 벗어나 프로그램의 종료가 되도록 함
		
		int menu=0;
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		
		//무한반복문(사용자가 언제 프로그램을 끝낼지 모르기 때문)
		while(true) {
			//메뉴 보여주기
			System.out.println("(1) Pizza");
			System.out.println("(2) Pasta");
			System.out.println("(3) Potato");
			System.out.println("원하는 메뉴 1~3를 선택하세요(종료:0)");
			
			//메뉴 입력
			String tmp=sc.nextLine();
			menu=Integer.parseInt(tmp);
			
			//종료 0번 입력 시 break로 while문 종료
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			
			//메뉴 1~3이외의 숫자 입력 시 continue문으로 while문 반복
			}else if(!(1<=menu && menu<=3)) {
				System.out.println("메뉴 잘못 기입");
				continue;
			}
			
			System.out.println("선택한 메뉴: "+menu);
		}
	}

}
