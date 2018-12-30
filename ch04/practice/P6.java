package ch04.practice;

public class P6 {

	public static void main(String[] args) {
		int[] ar={45,67,89,12,56,90,64,79,55};
		int sum=0;
		
		for(int i=0; i<ar.length; i++){
			sum+=ar[i];
		}
		System.out.println("sum: "+sum);
		System.out.println("agerage: "+(float)sum/ar.length);
	}

}
