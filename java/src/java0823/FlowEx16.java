package java0823;

public class FlowEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//���� for�� ����
		/*
			for(Ÿ�� ������ : �迭 or �÷���){
				//�ݺ��� ����
			}
		*/
		
		//�迭 ����
		int[] arr= {10, 20, 30, 40, 50};
		
		//���� �迭 ��� for��
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//���� for�� : �迭�̳� �÷��ǿ� ����� ��ҵ��� �о���� �뵵�θ� ����� �� �ִ�.
		for(int tmp : arr) {
			System.out.println(tmp);
		}
	}

}
