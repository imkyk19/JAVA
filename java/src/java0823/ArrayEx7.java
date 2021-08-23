package java0823;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shuffle

		//배열 numArr생성
		int[] numArr=new int[10];

		//numArr 출력 
		for(int i=0; i<numArr.length; i++) {
			numArr[i]=i;
			System.out.print(numArr[i]); //0123456789
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			//0~9중 한 값을 임의로 생성
			int n=(int)(Math.random()*10);
			//섞기
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]);
		}

	}
}