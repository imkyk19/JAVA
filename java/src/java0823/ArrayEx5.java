package java0823;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//총합, 평균
		
		int sum=0;
		float average =0f;

		//점수 배열 생성
		int[] score= {100,88,100,100,90};
		
		//점수 배열의 길이만큼 반복
		for(int i=0; i<score.length; i++) {
			//i = 0,1,2,3,4
			//점수 누적 합산
			sum+=score[i]; //score[0]+score[1]+score[2]+score[3]+score[4]
			
		}
		//평균은 누적합산을 점수배열 길이로 나눈 것
		average=sum/(float)score.length;
		
		//결과
		System.out.println("총점: "+sum);
		System.out.println("평균: "+average);
		//총점: 478
		//평균: 95.6

	}

}
