package java0824;

public class PrimitiveParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d=new Data();
		d.x=10;
		System.out.println("main() : x = "+d.x);
		
		//change�޼��忡�� main�޼���κ��� �Ѱܹ��� d.x�� ���� 1000���� ����
		change(d.x);
		System.out.println("After change(d.x)");
		
		//�⺻�� �Ű������� ������ ����� ���� ���� �� ���� �� ���� �Ұ�
		System.out.println("main() : x = "+d.x); //10
		
		//change�޼��忡�� main�޼���κ��� �Ѱܹ��� d�� ���� 1000���� ����
		change(d);
		System.out.println("After change(d)");
		
		//������ �Ű������� ������ ����� ���� ���� �� �ְ� ���� ����
		System.out.println("main() : x = "+d.x); //1000

	}
	
	static void change(int x) { //�⺻�� �Ű�����
		x=1000;
		System.out.println("change() : x = "+x);
	}
	
	static void change(Data d) { //������ �Ű�����
		d.x=1000;
		System.out.println("change() : x = "+d.x);
	}

}

class Data{
	int x;
}