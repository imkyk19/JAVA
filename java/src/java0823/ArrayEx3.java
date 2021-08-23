package java0823;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열의 길이가 5인 배열 생성
		int[] arr=new int[5];
		
		//배열 arr에 1~5저장
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
		System.out.println("[변경 전]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		
		System.out.println("-----------------");
		System.out.println("[변경 후]");
		
		//기존 배열의 길이보다 2배 긴 배열 생성
		int[] tmp=new int[arr.length*2];
		
		//배열 arr에 저장된 값들을 배열 tmp에 복사
		for(int i=0; i<arr.length; i++) {
			tmp[i]=arr[i];	
		}
		
		//tmp에 저장된 값을 arr에 저장
		arr=tmp;
		
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		
		/*
		[변경 전]
		arr.length:5
		arr[0]: 1
		arr[1]: 2
		arr[2]: 3
		arr[3]: 4
		arr[4]: 5
		-----------------
		[변경 후]
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
