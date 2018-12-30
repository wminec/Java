package ch11.practice;

public class P01_Test {

	public static void main(String[] args) {
		P01_first f=new P01_first();
		P01_second s = new P01_second();
		P01_third t = new P01_third();
		
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
