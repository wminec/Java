package ch03.practice;

public class Practice4 {

	public static void main(String[] args) {
		long sum=0, num=0;
		
		num=12345;
		while(num!=0){
			sum+=num%10;
			num/=10;
		}
		System.out.println(sum);
	}

}
