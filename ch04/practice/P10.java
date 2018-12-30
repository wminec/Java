package ch04.practice;

public class P10 {

	public static void main(String[] args) {
		int[] num={34,56,78,99,23,66,78,46,43,55};
		int temp=0;
		
		
		for(int i=0;i<num.length;i++){
			for(int j=i;j<num.length;j++){
				if(num[i]<num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}//내림차순 for end
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<num.length;i++){
			for(int j=i;j<num.length;j++){
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}//오름차순 for end
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+" ");
		}
	}
}
