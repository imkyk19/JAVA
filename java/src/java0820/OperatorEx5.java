package java0820;

public class OperatorEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char c1='a';
		char c2=c1;
		char c3=' ';
		
		int i = c1 +1;
		//c1+1 ��� ��, c1�� char���̹Ƿ� int������ ��ȯ�� �� �������� ����
		System.out.println(i); //98
		
		c3 = (char)(c1+1);
		System.out.println(c3);//b 98�� char���� ����ȯ�� �ҹ��� b
	}

}
