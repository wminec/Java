package ch03.practice;

public class Practice3 {

	public static void main(String[] args) {
		int total=167730;
		
		System.out.println("5만원:"+total/50000);
		total%=50000;
		System.out.println("1만원:"+total/10000);
		total%=10000;
		System.out.println("5천원:"+total/5000);
		total%=5000;
		System.out.println("1천원:"+total/1000);
		total%=1000;
		System.out.println("5백원:"+total/500);
		total%=500;
		System.out.println("1백원:"+total/100);
		total%=100;
		System.out.println("1십원:"+total/10);
	}

}
