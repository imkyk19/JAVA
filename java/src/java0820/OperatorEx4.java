package java0820;

public class OperatorEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = 10;
		byte b = 30;
		byte c = (byte)(a+b);
		byte d = (byte)(a*b);
		
		System.out.println(c); //40
		System.out.println(d); //44
		//큰 자료형에서 작은 자료형으로 변환하면 데이터의 손실이 발생하므로 값이 바뀜
		//원래의 연산 값인 300은 byte형의 범위를 넘기때문에 데이터 손실이 발생
	}

}
