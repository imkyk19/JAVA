package java0823;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭�� ���̰� 5�� �迭 ����
		int[] arr=new int[5];
		
		//�迭 arr�� 1~5����
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
		System.out.println("[���� ��]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		
		System.out.println("-----------------");
		System.out.println("[���� ��]");
		
		//���� �迭�� ���̺��� 2�� �� �迭 ����
		int[] tmp=new int[arr.length*2];
		
		//�迭 arr�� ����� ������ �迭 tmp�� ����
		for(int i=0; i<arr.length; i++) {
			tmp[i]=arr[i];	
		}
		
		//tmp�� ����� ���� arr�� ����
		arr=tmp;
		
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		
		/*
		[���� ��]
		arr.length:5
		arr[0]: 1
		arr[1]: 2
		arr[2]: 3
		arr[3]: 4
		arr[4]: 5
		-----------------
		[���� ��]
		arr.length:10
		arr[0]: 1
		arr[1]: 2
		arr[2]: 3
		arr[3]: 4
		arr[4]: 5
		arr[5]: 0
		arr[6]: 0
		arr[7]: 0
		arr[8]: 0
		arr[9]: 0 
		*/
	}

}
