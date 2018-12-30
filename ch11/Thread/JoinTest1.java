package ch11.Thread;

public class JoinTest1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" start");
		Runnable r = new MyThread();
		Thread myThread=new Thread(r);
		
		myThread.start();
		try{
			myThread.join();
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end");
	}

}
