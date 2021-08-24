package java0824;

public class PrimitiveParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d=new Data();
		d.x=10;
		System.out.println("main() : x = "+d.x);
		
		//change메서드에서 main메서드로부터 넘겨받은 d.x의 값을 1000으로 변경
		change(d.x);
		System.out.println("After change(d.x)");
		
		//기본형 매개변수는 변수에 저장된 값만 읽을 수 있을 뿐 변경 불가
		System.out.println("main() : x = "+d.x); //10
		
		//change메서드에서 main메서드로부터 넘겨받은 d의 값을 1000으로 변경
		change(d);
		System.out.println("After change(d)");
		
		//참조형 매개변수는 변수에 저장된 값을 읽을 수 있고 변경 가능
		System.out.println("main() : x = "+d.x); //1000

	}
	
	static void change(int x) { //기본형 매개변수
		x=1000;
		System.out.println("change() : x = "+x);
	}
	
	static void change(Data d) { //참조형 매개변수
		d.x=1000;
		System.out.println("change() : x = "+d.x);
	}

}

class Data{
	int x;
}