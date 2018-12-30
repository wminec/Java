package ch04.practice;

public class MP9 {
	public void order(int[] numArray1, int[] numArray2){
		int[] NA;
		int Len=numArray1.length+numArray2.length;
		int temp=0;
		
		NA= new int[Len];
		for(int i=0; i<Len; i++){
			if(i<numArray1.length){
				NA[i]=numArray1[i];
			}else{
				NA[i]=numArray2[i-numArray1.length];
			}
		}
		for(int i=0; i<Len; i++){
			for(int j=i; j<Len; j++){
				if(NA[i]>NA[j]){
					temp=NA[i];
					NA[i]=NA[j];
					NA[j]=temp;
				}
			}
		}
		for(int i=0; i<Len; i++){
			System.out.print(NA[i]+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] NA1={35,97,56,85,65,77,88,90,51};
		int[] NA2={45,67,89,43,56};
		
		MP9 o =new MP9();
		o.order(NA1, NA2);

	}

}
