package java0824;

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMath mm=new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add: "+result1); //add: 8
		System.out.println("subtract: "+result2); //subtract: 2
		System.out.println("multiply: "+result3); //multiply: 15
		System.out.println("divide: "+result4); //divide: 1.6666666666666667
	}

}

//MyMath Ŭ���� �ۼ�
class MyMath{
	//�޼���� Ŭ���� �������� ���� ����
	long add(long a, long b) {
		return a+b; // return: ���� �������� �޼��带 �����ϰ� ȣ���� �޼���� �ǵ��ư�
	}
	
	long subtract(long a, long b) {
		return a-b;
	}
	
	long multiply(long a, long b) {
		return a*b;
	}
	
	double divide(double a, double b) {
		return a/b;
	}
}
