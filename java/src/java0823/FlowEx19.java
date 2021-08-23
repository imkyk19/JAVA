package java0823;

public class FlowEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int i=0;
		
		//i를 1씩 증가시켜서 sum에 계속 더해나간다. 그 값이 100일때까지 반복
		while((sum+=++i)<=100) {
			System.out.println(i+" - "+sum);
		}
		
		//sum+=++i : i의 값을 1씩 증가시켜서 sum에 누적
		
		/*
		1 - 1
		2 - 3
		3 - 6
		4 - 10
		5 - 15
		6 - 21
		7 - 28
		8 - 36
		9 - 45
		10 - 55
		11 - 66
		12 - 78
		13 - 91
		*/
	}

}
