package java0823;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shuffle

		//�迭 numArr����
		int[] numArr=new int[10];

		//numArr ��� 
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=i;
			System.out.print(numArr[i]); //0123456789
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			//0~9�� �� ���� ���Ƿ� ����
			int n=(int)(Math.random()*10);
			//����
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}

	}
}