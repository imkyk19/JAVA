package java0824;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2차원 배열 score의 모든 요소의 합을 구하고 출력하는 예제
		int[][] score= {
							{100, 100, 100}
							,{20, 20, 20}
							,{30, 30, 30}
							,{40, 40, 40}
						};
		
		int sum=0;
		
		//score.length : 배열 참조변수 score가 참조하고있는 배열의 길이(=4)
		for(int i=0; i<score.length; i++) {
			//score[i].length : score[i]이 참조하고있는 배열의 길이(=3)
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
			}
		}
		
		//score의 각 요소(1차원 배열 주소)를 tmp에 저장
		for(int[] tmp : score) {
			//tmp는 1차원 배열을 가리키는 참조변수
			for(int i : tmp) {
				sum +=i;
			}
		}
		
		System.out.println("sum="+sum);

		/*
		score[0][0]=100
		score[0][1]=100
		score[0][2]=100
		score[1][0]=20
		score[1][1]=20
		score[1][2]=20
		score[2][0]=30
		score[2][1]=30
		score[2][2]=30
		score[3][0]=40
		score[3][1]=40
		score[3][2]=40
		sum=570
		*/
	}

}
