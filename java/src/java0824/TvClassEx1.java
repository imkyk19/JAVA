package java0824;

class Tv{
	//tv�� �Ӽ�(�������)
	String color; //String �⺻�� null
	boolean power; //boolean �⺻�� false
	int channel; //int �⺻�� 0
	
	//tv�� ���(�޼���)
	void power() {power=!power;} //tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;} //tv�� ä���� ���̴� �޼���
	void channelDown( ) {--channel;} //tv�� ä���� ���ߴ� �޼���
}

public class TvClassEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tv ��ü ����
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� ä�� ���� "+t1.channel+"�Դϴ�."); //0
		System.out.println("t2�� ä�� ���� "+t2.channel+"�Դϴ�."); //0
		
		//ä�� ����
		t1.channel=7;
		
		//���
		System.out.println("t1�� ä�� ���� "+t1.channel+"�Դϴ�."); //7
		System.out.println("t2�� ä�� ���� "+t2.channel+"�Դϴ�."); //0	
	}

}
