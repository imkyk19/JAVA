package java0823;

public class FlowEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int i=0;
		
		//i�� 1�� �������Ѽ� sum�� ��� ���س�����. �� ���� 100�϶����� �ݺ�
		while((sum+=++i)<=100) {
			System.out.println(i+" - "+sum);
		}
		
		//sum+=++i : i�� ���� 1�� �������Ѽ� sum�� ����
		
		/*
		1 - 1
		2 - 3
		3 - 6
		4 - 10
		5 - 15
		6 - 21
		7 - 28
		8 - 36
		9 - 45
		10 - 55
		11 - 66
		12 - 78
		13 - 91
		*/
	}

}
