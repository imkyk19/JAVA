package java0824;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result=factorial(4);
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result=0;
		
		if(n==1) {
			result=1;
		}else{
			//�ٽ� �޼����� �ڽ��� ȣ���Ѵ�.
			result=n*factorial(n-1);
		}
		
		return result;
	}

}
