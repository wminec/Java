package ch11.Thread;

public class MyThread implements Runnable{
	public void run(){
		System.out.println("run");
		first();
	}
	
	public void first(){
		System.out.println("first");
		second();
	}
	public void second(){
		System.out.println("second");
	}
}
