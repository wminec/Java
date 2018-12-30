package ch04.practice;

public class MP8 {
	public void order(int[] numArray){
		int temp=0;
		for(int i=0; i<numArray.length; i++){
			for(int j=i; j<numArray.length; j++){
				if(numArray[i]>numArray[j]){
					temp=numArray[i];
					numArray[i]=numArray[j];
					numArray[j]=temp;
				}
			}
		}
		for(int i=0; i<numArray.length; i++){
			System.out.print(numArray[i]+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] NA1={45,67,89,12,56,90,64,79,55};
		int[] NA2={35,97,56,85,65,77,88,90,51};
		int[] NA3={45,67,89,43,56};
		
		MP8 t = new MP8();
		t.order(NA1);
		t.order(NA2);
		t.order(NA3);
	}

}
