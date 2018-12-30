package ch04.practice;

public class MP2 {
	public int calc(int n){
		int sum=0;
		for(int i=1; i<=n; i++){
			if(i%2!=0){
				sum+=i;
			}else{
				sum-=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int n=0;
		
		n=50;
		MP2 c = new MP2();
		System.out.println(c.calc(n));

	}

}
