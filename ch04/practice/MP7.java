package ch04.practice;

public class MP7 {
	public int calc(int n){
		int sum=0;
		while(true){
			sum+=n%10;
			n/=10;
			if(n==0){
				break;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int n=0;
		
		MP7 c = new MP7();
		n=5555;
		System.out.println(c.calc(n));
	}

}
