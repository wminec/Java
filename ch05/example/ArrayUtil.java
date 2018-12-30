package ch05.example;

public class ArrayUtil {
	public void summarize(int[] NA){
		int sum=0;
		for(int i=0; i<NA.length;i++){
			sum+=NA[i];
		}
		
		System.out.println("Sum :"+sum+", Avg :"+sum/NA.length);
	}
	
	public void order(int[] NA){
		int temp=0;
		
		for(int i=0; i<NA.length; i++){
			for(int j=i; j<NA.length; j++){
				if(NA[i]>NA[j]){
					temp=NA[i];
					NA[i]=NA[j];
					NA[j]=temp;
				}
			}
		}
		
		for(int i=0; i<NA.length; i++){
			System.out.print(NA[i]+" ");
		}
		System.out.println();
	}

}
