package java0824;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {3,2,1,6,5,4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum="+sumArr(arr));

	}
	
	//��� ��� ���
	static void printArr(int[] arr) {
		System.out.print("[");
		
		for(int i : arr) {
			System.out.print(i+",");
		}
			System.out.println("]");
	}
	
	//��� ����� �� ��ȯ
	static int sumArr(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	//�迭�� ������������ ����
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length-1; i++) 
			for(int j=i+1; j<arr.length; j++) 
				if(arr[j]<arr[i]) {
					int tmp=arr[j];
					arr[j]=arr[i];
					arr[i]=tmp;
				}		
	}

}
