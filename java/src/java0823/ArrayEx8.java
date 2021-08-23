package java0823;

public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"Kim","Lee","Park"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		
		/*
		names[0]=Kim
		names[1]=Lee
		names[2]=Park
		*/
		
		//배열 names의 3번째 요소를 tmp에 저장
		String tmp=names[2];
		System.out.println("tmp="+tmp); //tmp=Park

		//배열 names의 1번째 요소를 "Yu"로 변경
		names[0]="Yu";
		
		//향상된 for문을 이용해 문자열 배열 출력
		for(String str:names) {
			System.out.println(str);
		}
		/*
		Yu //변경된 값으로 출력된다.
		Lee
		Park
		*/
		
	}
	
	

}
