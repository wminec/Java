package ch04.example;

public class ArrayTest5 {

	public static void main(String[] args) {
		int[] num={1,2,3,4,5,6,7,8,9};
		int len=num.length;
		int[] temp=new int[len];
		
		System.out.println("교환 전 배열 요소 값");
		for(int i=0; i<len;i++){
			System.out.print(num[i]+"\t");
		}
		
		for(int i=0; i<len; i++){
			temp[i]=num[len-1-i];
		}
		
		for(int i=0; i<len;i++){
			num[i]=temp[i];
		}
		
		System.out.println("\n 교환 후 배열 요소 값");
		for(int i=0; i<len; i++){
			System.out.print(num[i]+"\t");
		}
	}

}
