package java0823;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����, ���
		
		int sum=0;
		float average =0f;

		//���� �迭 ����
		int[] score= {100,88,100,100,90};
		
		//���� �迭�� ���̸�ŭ �ݺ�
		for(int i=0; i<score.length; i++) {
			//i = 0,1,2,3,4
			//���� ���� �ջ�
			sum+=score[i]; //score[0]+score[1]+score[2]+score[3]+score[4]
			
		}
		//����� �����ջ��� �����迭 ���̷� ���� ��
		average=sum/(float)score.length;
		
		//���
		System.out.println("����: "+sum);
		System.out.println("���: "+average);
		//����: 478
		//���: 95.6

	}

}
