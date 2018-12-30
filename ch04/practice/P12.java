package ch04.practice;

public class P12 {

	public static void main(String[] args) {
		int[] num1={1,34,56,23,7,89};
		int[] num2={2,45,6,8,90};
		int array_Len=0;
		int temp=0;
		int[] orderArray;
		
		array_Len=num1.length+num2.length;
		orderArray= new int[array_Len];
		
		for(int i=0; i<array_Len; i++){
			if(i<num1.length){
				orderArray[i]=num1[i];
			}else{
				orderArray[i]=num2[i-num1.length];
			}
		}//for end
		
/*		for(int i=0; i<array_Len;i++){
			System.out.print(orderArray[i]+" ");
		}
		
		for(int i=0;i<array_Len;i++){
			for(int j=i;j<array_Len;j++){
				if(orderArray[i]<orderArray[j]){
					temp=orderArray[i];
					orderArray[i]=orderArray[j];
					orderArray[j]=temp;
				}
			}
		}//내림차순 for end
		for(int i=0; i<array_Len; i++){
			System.out.print(orderArray[i]+" ");
		}
		System.out.println();
		*/
		for(int i=0;i<array_Len;i++){
			for(int j=i;j<array_Len;j++){
				if(orderArray[i]>orderArray[j]){
					temp=orderArray[i];
					orderArray[i]=orderArray[j];
					orderArray[j]=temp;
				}
			}
		}//내림차순 for end
		for(int i=0; i<array_Len; i++){
			System.out.print(orderArray[i]+" ");
		}
	}

}
