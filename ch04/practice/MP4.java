package ch04.practice;

public class MP4 {
	public void calc(int[] nA){
		int sum=0;
		for(int i=0; i<nA.length; i++){
			sum+=nA[i];
		}
		System.out.println("Sum :"+sum+", Avg :"+sum/nA.length);
	}

	public static void main(String[] args) {
		int[] nA={45,67,89,12,56,90,64,79,55};
		
		MP4 c=new MP4();
		
		c.calc(nA);
		

	}

}
