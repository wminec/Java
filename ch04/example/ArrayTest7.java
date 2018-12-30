package ch04.example;

public class ArrayTest7 {

	public static void main(String[] args) {
		int[] num={5,4,3,2,1};
		int temp;
		
		System.out.println("정렬 전 배열값");
		for(int i=0; i<num.length;i++){
			System.out.print(num[i]+"\t");
		}
		
		for(int i=0; i<num.length; i++){
			for(int j=i;j<num.length;j++){
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		System.out.println("\n정렬 후 배열값");
		for(int i=0; i<num.length;i++){
			System.out.print(num[i]+"\t");
		}
	}

}
