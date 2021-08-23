package java0823;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] abc= {'A','B','C','D'};
		char[] num= {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc); //ABCD
		System.out.println(num); //0123456789
		
		//배열 abc와 num을 붙여 하나의 배열로 생성
		char[] result=new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result); //ABCD0123456789
		
		//배열 abc을 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//number의 인덱스6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3); //ABCD456789
		System.out.println(num); //ABCD45ABC9
	}

}
