package ch11.Thread;

public class JoinTest {

	public static void main(String[] args) {
		System.out.println("main start");
		Runnable r = new MyThread();
		Thread myThread=new Thread(r);
		myThread.start();
		System.out.println("main end");
	}

}
