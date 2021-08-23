package java0823;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//최대값 최소값
		int[] score= {79,88,91,33,100,55,95};
		
		//배열의 첫번째 값으로 최대값,최소값을 초기화 한다.
		int max=score[0];
		int min=score[0];
		
		//배열 score의 길이만큼 반복 0~6
		for(int i=1; i<score.length; i++) {
			//score의 i번지가 배열의 첫번째값보다 크면
			if(score[i]>max) {
				//최대값은 score[i]번지로 변환
				max=score[i];
			//score의 i번지가 배열의 첫번째값보다 작으면
			}else if(score[i]<min) {
				//최소값은 score[i]번지로 변환
				min=score[i];
			}
			
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		//최대값 : 100
		//최소값 : 33

	}

}
