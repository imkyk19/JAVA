package java0823;

public class FlowEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break��
		//�ڽ��� ���Ե� ���� ����� �ݺ��� ���
		//if���� �Բ� ���Ǿ� Ư�� ������ �����ϸ� �ݺ����� ������� �Ѵ�.

		int sum=0;
		int i=0;
		
		//���� 1���� ���� ������ ����� ���ϸ� ���� 100�� �Ѵ��� �˾Ƴ��� ����
		
		//���� �ݺ���
		while(true) {
			//���� �հ谡 100�� �Ѿ��ٸ� break�� �ݺ��� ����
			if(sum>100)
				break;
			
			//i���� 1�� ����
			++i;
			//������ i���� ����
			sum+=i;
		}

		System.out.println("i="+i);
		System.out.println("sum="+sum);
		
		//���
		//i=14
		//sum=105
	}

}
