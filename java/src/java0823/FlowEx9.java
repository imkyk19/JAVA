package java0823;

public class FlowEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for(int i=1; i<=10; i++) {
			sum +=i;
			System.out.printf("1���� %2d ������ ��: %2d%n", i, sum);
			/*
			1����  1 ������ ��:  1
			1����  2 ������ ��:  3
			1����  3 ������ ��:  6
			1����  4 ������ ��: 10
			1����  5 ������ ��: 15
			1����  6 ������ ��: 21
			1����  7 ������ ��: 28
			1����  8 ������ ��: 36
			1����  9 ������ ��: 45
			1���� 10 ������ ��: 55
			*/
		}
		
	}

}
