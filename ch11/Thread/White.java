package ch11.Thread;

public class White extends Thread{
	public void run(){
		while(true){
			System.out.println("백기 올려!!");
		}
	}
}
