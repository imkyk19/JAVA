package java0820;

public class OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c='a';
		
		//'a'부터 26개의 문자 출력
		for(int i=0; i<26; i++) { 
			System.out.print(c++); //abcdefghijklmnopqrstuvwxyz
		}
		
		System.out.println();
		
		c='A';
		
		//'A'부터 26개의 문자 출력(대문자)
		for(int i=0; i<26; i++) {
			System.out.print(c++); //ABCDEFGHIJKLMNOPQRSTUVWXYZ
		}
		
		System.out.println();
		
		c='0';
		//0번투터 10개의 숫자 출력
		for(int i=0; i<10; i++) {
			System.out.print(c++); //0123456789
		}

	}

}
