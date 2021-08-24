package java0824;

public class TvClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//길이가 3인 Tv객체 배열
		Tv[] tvArr=new Tv[3];
		
		///Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i]=new Tv();
			tvArr[i].channel=i+10;
		}
		
		//출력
		for(int i=0; i<tvArr.length; i++) {
			//++channel인 channelUp() 메서드 호출로 1씩 증가하게 된다.
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
		
		/*
		tvArr[0].channel=11
		tvArr[1].channel=12
		tvArr[2].channel=13
		*/
	}

}

