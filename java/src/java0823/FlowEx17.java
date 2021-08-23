package java0823;

public class FlowEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//while문
		//조건식이 true인동안 블럭{}내 문장 반복 & while문 생략 불가

		int i=5;
		//i의 값이 0이 아닌 동안만 true이므로 0일때 while문 벗어나게 된다.
		while(i--!=0) {
			System.out.println(i+" - Hello JAVA");
		}
		
		/*
		4 - Hello JAVA
		3 - Hello JAVA
		2 - Hello JAVA
		1 - Hello JAVA
		0 - Hello JAVA
		*/
	}

}
