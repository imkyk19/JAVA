package java0824;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ȯ���� �ִ� �޼��带 ��ȯ���� ���� �޼���� �ٲٴ� ���
		//������ �Ű������� Ȱ���ϸ� ��ȯ���� ��� �޼����� �������� ��� �� �� ����
		
		ReturnTest r=new ReturnTest();
		
		int result = r.add(3, 5);
		System.out.println(result); //8
		
		int[] result2= {0};
		r.add(3, 5, result2);
		System.out.println(result2[0]); //8
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {
		result[0]=a+b;
	}

}
