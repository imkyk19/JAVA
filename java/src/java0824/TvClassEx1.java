package java0824;

class Tv{
	//tv의 속성(멤버변수)
	String color; //String 기본값 null
	boolean power; //boolean 기본값 false
	int channel; //int 기본값 0
	
	//tv의 기능(메서드)
	void power() {power=!power;} //tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {++channel;} //tv의 채널을 높이는 메서드
	void channelDown( ) {--channel;} //tv의 채널을 낮추는 메서드
}

public class TvClassEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tv 객체 생성
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 채널 값은 "+t1.channel+"입니다."); //0
		System.out.println("t2의 채널 값은 "+t2.channel+"입니다."); //0
		
		//채널 변경
		t1.channel=7;
		
		//결과
		System.out.println("t1의 채널 값은 "+t1.channel+"입니다."); //7
		System.out.println("t2의 채널 값은 "+t2.channel+"입니다."); //0	
	}

}
