package ch04.practice;

public class MP5 {
	public void calc(int n){
		int sum=0;
		for(int i=1; i<=n; i++){
			if(i%5!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int n=0;
		
		MP5 c=new MP5();
		
		n=50;
		c.calc(n);

	}

}
