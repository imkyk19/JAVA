package java0823;

import java.util.Scanner;

public class FlowEx20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ݺ��ؼ� ���ڸ� �Է¹޴ٰ� 0�� �Է��ϸ� �Է��� ��ġ�� �� ���� ����ϴ� ����
		/*
		 * ���� : ó���� flag�� true�� �����ؼ� ��� �ݺ��ϴٰ� 0�Է½� flag���� false�� �����Ͽ� �ݺ�����
		 */
		
		int num;
		int sum=0;
		
		//while���� ���ǽ����� ���� ����
		boolean flag=true;
		
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�Է�)");
		Scanner sc=new Scanner(System.in);
		
		//flag�� true�̶����� ��� �ݺ��ȴ�.
		while(flag) {
			System.out.println(">>");
			String tmp=sc.nextLine();
			num=Integer.parseInt(tmp);
			
			//num�� ���� 0�� �ƴϸ� �����հ�
			if(num!=0) {
				sum+=num;
				
			//num�� ���� 0�̸� flag�� �� false�� ���� -> while�� ����(while���� ������ flag�̹Ƿ� true->false)
			}else {
				flag=false;
			}
		}
		System.out.println("�հ�: "+sum);
	}

}
