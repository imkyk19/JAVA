package java0820;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=5, j=0;
		
		j= i++;
		System.out.println("j=i++; 실행 후, i="+i+", j="+j);
		//j=i++; 실행 후, i=6, j=5
		
		i=5;
		j=0;
		
		j= ++i;
		System.out.println("j=++i; 실행 후, i="+i+", j="+j);
		//j=++i; 실행 후, i=6, j=6
	}

}
