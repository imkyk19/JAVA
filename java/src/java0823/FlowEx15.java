package java0823;

public class FlowEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		[1,1][1,2][1,3][1,4][1,5]
		[2,1][2,2][2,3][2,4][2,5]
		[3,1][3,2][3,3][3,4][3,5]
		[4,1][4,2][4,3][4,4][4,5]
		[5,1][5,2][5,3][5,4][5,5]
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
		
		/*
		[1,1]                    
     		[2,2]               
          		[3,3]          
               		[4,4]     
                    	[5,5]
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				
				//i와 j값이 같은 경우에만 출력
				if(i==j) {
					System.out.printf("[%d,%d]",i,j);
				
				//다른 경우에는 공백 표시
				}else {
					System.out.printf("%5c",' ');
				}
			}
			System.out.println();
		}
	}

}
