package java0823;

import java.util.Scanner;

public class FlowEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� �Է��� �ް� �� ������ �� �ڸ��� ���� ���ϴ� ����
		int num=0, sum=0;
		System.out.println("���ڸ� �Է��ϼ���. (��:12345)");
		
		Scanner sc=new Scanner(System.in);
		String tmp=sc.nextLine();
		num=Integer.parseInt(tmp);
		
		//�Է� ���� ���ڰ� 0�� �ƴҵ��� �ݺ�
		while(num!=0) {
			
			//� ���� 10���� ������ �����ϸ� ������ �ڸ��� ���� �� ����
			//�հ�� �Է¹��� ���ڸ� 10���� ���� �������� ���� ��
			sum+=num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			//num�� ���� num/=10�� ���� ���ڸ��� �پ��ٰ� 0�̵Ǹ� while�� ����
			num=num/10;
		}
		
		System.out.println("�� �ڸ����� ��: "+sum);
	}

	/*
	sum=  5 num=12345
	sum=  9 num=1234
	sum= 12 num=123
	sum= 14 num=12
	sum= 15 num=1
	�� �ڸ����� ��: 15

	 */
}
