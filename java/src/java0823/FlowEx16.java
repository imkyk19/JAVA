package java0823;

public class FlowEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//향상된 for문 문법
		/*
			for(타입 변수명 : 배열 or 컬렉션){
				//반복할 문장
			}
		*/
		
		//배열 선언
		int[] arr= {10, 20, 30, 40, 50};
		
		//기존 배열 출력 for문
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//향상된 for문 : 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다.
		for(int tmp : arr) {
			System.out.println(tmp);
		}
	}

}
