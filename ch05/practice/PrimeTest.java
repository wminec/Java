package ch05.practice;

public class PrimeTest {

	public static void main(String[] args) {
		int result=0;
		PrimeUtil p=new PrimeUtil();
		
		result=p.calcPrime(5);
		System.out.println(result);
		result=p.calcPrime(2, 7);
		System.out.println(result);
	}

}
