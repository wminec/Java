package ch04.practice;

public class P4 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=100; i++){
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}

		System.out.println(sum);

	}

}
