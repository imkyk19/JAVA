package java0820;

public class OperatorEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char c1='a';
		char c2=c1;
		char c3=' ';
		
		int i = c1 +1;
		//c1+1 계산 시, c1이 char형이므로 int형으로 변환한 후 덧셈연산 수행
		System.out.println(i); //98
		
		c3 = (char)(c1+1);
		System.out.println(c3);//b 98을 char으로 형변환시 소문자 b
	}

}
