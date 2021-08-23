package java0823;

public class FlowEx22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break문
		//자신이 포함된 가장 가까운 반복문 벗어남
		//if문과 함께 사용되어 특정 조건을 만족하면 반복문을 벗어나도록 한다.

		int sum=0;
		int i=0;
		
		//숫자 1부터 더해 나가서 몇까지 더하면 합이 100을 넘는지 알아내는 예제
		
		//무한 반복문
		while(true) {
			//만약 합계가 100을 넘었다면 break로 반복문 종료
			if(sum>100)
				break;
			
			//i값을 1씩 증가
			++i;
			//증가된 i값을 누적
			sum+=i;
		}

		System.out.println("i="+i);
		System.out.println("sum="+sum);
		
		//결과
		//i=14
		//sum=105
	}

}
