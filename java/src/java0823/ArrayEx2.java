package java0823;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10���� �迭 ����
		int[] iArr1=new int[10];
		int[] iArr2=new int[10];
		//int[] iArr3=new int[]{100, 95, 80, 70, 60};
		
		//���� ������ �迭 ����
		int[] iArr3={100, 95, 80, 70, 60};
		
		//���ڷ� �̷���� �迭 ����
		char[] chArr= {'a','b','c','d'};
		
		//iArr1�� �迭���̸�ŭ �ݺ�
		for(int i=0; i<iArr1.length; i++) {
			//1~10�� ���ڸ� ������� �迭�� �ִ´�.
			iArr1[i]=i+1;
		}
		
		//iArr2�� �迭���̸�ŭ �ݺ�
		for(int i=0; i<iArr2.length; i++) {
			//���� �߻�
			iArr2[i]=(int)(Math.random()*10)+1;
		}
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		//�߻��� ���� ���
		//Arrays.toString : �迭�� ��� ��Ҹ� [���1,���2,...]�� ���� ������ ���ڿ��� ���� ��ȯ
		System.out.println(Arrays.toString(iArr2));
		//iArr3�迭 �� ���
		System.out.println(Arrays.toString(iArr3));
		//chArr �迭 �� ���
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		/*
		 * 
		1,2,3,4,5,6,7,8,9,10,
		[8, 5, 6, 6, 4, 8, 3, 8, 7, 9]
		[100, 95, 80, 70, 60]
		[a, b, c, d]
		[I@41a4555e
		abcd
		*/
	}

}
