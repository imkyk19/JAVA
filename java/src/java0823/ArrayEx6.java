package java0823;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ִ밪 �ּҰ�
		int[] score= {79,88,91,33,100,55,95};
		
		//�迭�� ù��° ������ �ִ밪,�ּҰ��� �ʱ�ȭ �Ѵ�.
		int max=score[0];
		int min=score[0];
		
		//�迭 score�� ���̸�ŭ �ݺ� 0~6
		for(int i=1; i<score.length; i++) {
			//score�� i������ �迭�� ù��°������ ũ��
			if(score[i]>max) {
				//�ִ밪�� score[i]������ ��ȯ
				max=score[i];
			//score�� i������ �迭�� ù��°������ ������
			}else if(score[i]<min) {
				//�ּҰ��� score[i]������ ��ȯ
				min=score[i];
			}
			
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		//�ִ밪 : 100
		//�ּҰ� : 33

	}

}
