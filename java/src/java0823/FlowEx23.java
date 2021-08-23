package java0823;

public class FlowEx23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//continue문
		//반복문 내에서만 사용 가능, 반복이 진행되는 도중에 continue를 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
		//반복문 전체를 벗어나지않고 다음 반복을 계속 수행하는 점이 break문과 다르다.
		//전체 반복 중 특정조건을 만족하는 경우를 제외하고자 할 때 유용
		
		//3의 배수 제외 1~10사이 숫자 출력
		
		for(int i=0; i<=10; i++) {
			//i를 3으로 나눈 겂이 0인 경우 continue(문장들을 건너뛰고 반복을 이어감)
			if(i%3==0)
				continue;
			System.out.print(i+",");
		}
	
		//결과
		//1,2,4,5,7,8,10, (3의 배수들은 실행하지 않고 반복 이어갔음)
	}

}
