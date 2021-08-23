package java0823;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10개의 배열 생성
		int[] iArr1=new int[10];
		int[] iArr2=new int[10];
		//int[] iArr3=new int[]{100, 95, 80, 70, 60};
		
		//값이 지정된 배열 생성
		int[] iArr3={100, 95, 80, 70, 60};
		
		//문자로 이루어진 배열 생성
		char[] chArr= {'a','b','c','d'};
		
		//iArr1의 배열길이만큼 반복
		for(int i=0; i<iArr1.length; i++) {
			//1~10의 숫자를 순서대로 배열에 넣는다.
			iArr1[i]=i+1;
		}
		
		//iArr2의 배열길이만큼 반복
		for(int i=0; i<iArr2.length; i++) {
			//난수 발생
			iArr2[i]=(int)(Math.random()*10)+1;
		}
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		//발생된 난수 출력
		//Arrays.toString : 배열의 모든 요소를 [요소1,요소2,...]와 같은 형식의 문자열로 만들어서 반환
		System.out.println(Arrays.toString(iArr2));
		//iArr3배열 값 출력
		System.out.println(Arrays.toString(iArr3));
		//chArr 배열 값 출력
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
		/*
		 * 
		1,2,3,4,5,6,7,8,9,10,
		[8, 5, 6, 6, 4, 8, 3, 8, 7, 9]
		[100, 95, 80, 70, 60]
		[a, b, c, d]
		[I@41a4555e
		abcd
		*/
	}

}
