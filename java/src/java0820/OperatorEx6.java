package java0820;

public class OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c='a';
		
		//'a'���� 26���� ���� ���
		for(int i=0; i<26; i++) { 
			System.out.print(c++); //abcdefghijklmnopqrstuvwxyz
		}
		
		System.out.println();
		
		c='A';
		
		//'A'���� 26���� ���� ���(�빮��)
		for(int i=0; i<26; i++) {
			System.out.print(c++); //ABCDEFGHIJKLMNOPQRSTUVWXYZ
		}
		
		System.out.println();
		
		c='0';
		//0������ 10���� ���� ���
		for(int i=0; i<10; i++) {
			System.out.print(c++); //0123456789
		}

	}

}
