package java0824;

public class TvClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���̰� 3�� Tv��ü �迭
		Tv[] tvArr=new Tv[3];
		
		///Tv��ü�� �����ؼ� Tv��ü �迭�� �� ��ҿ� ����
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i]=new Tv();
			tvArr[i].channel=i+10;
		}
		
		//���
		for(int i=0; i<tvArr.length; i++) {
			//++channel�� channelUp() �޼��� ȣ��� 1�� �����ϰ� �ȴ�.
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

