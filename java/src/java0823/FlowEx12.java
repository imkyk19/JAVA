package java0823;

import java.util.Scanner;

public class FlowEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		
		System.out.println("*�� ����� ������ ���� �Է��ϼ���.");
		//ex : 10 �Է�
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
		
		//scanner�� �Է¹��� �� ��ŭ �� �ݺ�
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
