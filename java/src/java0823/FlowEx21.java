package java0823;

import java.util.Scanner;

public class FlowEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//do-while�� : {}�� �� ������ ���� ���� �� ���ǽ� �� ��, �ּ��� �ѹ��� ����� �� ����
		//�ݺ������� ������� �Է��� �޾Ƽ� ó���� �� �����ϴ�.
		/*
		 * do{
		 * 	//���ǽ��� �������� ���� �� ����� ����
		 * }while(���ǽ�);
		 */
		
		int input=0, answer=0;
		
		//1~100������ ������ ���� answer�� ����
		answer=(int)(Math.random()*100)+1;
		System.out.println("answer: "+answer);
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1�� 100������ ������ �Է��ϼ���.");
			input=sc.nextInt();
			
			//�Է��� ���� ���亸�� ū ���
			if(input>answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			
			//�Է��� ���� ���亸�� ���� ���
			}else if(input<answer) {
				System.out.println("�� ū���� �ٽ� �õ��غ�����.");
			}
		//do{}������ ������ �Ŀ� �Է��� ���� ������ �ٸ� ��� ��� do{}���� �ݺ�(������ while�� ���� �� �����Դϴ�. ���)
		}while(input!=answer);
		
		System.out.println("�����Դϴ�.");
	}

}
