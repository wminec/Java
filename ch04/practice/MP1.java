package ch04.practice;

public class MP1 {
	public int calc(int num){
		int sum=0;
		for(int i=1; i<=num; i++){
			if(i%2!=0)
				sum+=i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int n=0;
		
		MP1 c = new MP1();
		n=50;
		System.out.println(c.calc(n));

	}

}
