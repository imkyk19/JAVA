package java0823;

public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {"Kim","Lee","Park"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		
		/*
		names[0]=Kim
		names[1]=Lee
		names[2]=Park
		*/
		
		//�迭 names�� 3��° ��Ҹ� tmp�� ����
		String tmp=names[2];
		System.out.println("tmp="+tmp); //tmp=Park

		//�迭 names�� 1��° ��Ҹ� "Yu"�� ����
		names[0]="Yu";
		
		//���� for���� �̿��� ���ڿ� �迭 ���
		for(String str:names) {
			System.out.println(str);
		}
		/*
		Yu //����� ������ ��µȴ�.
		Lee
		Park
		*/
		
	}
	
	

}
