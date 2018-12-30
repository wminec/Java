package ch11.practice;

public class P01_second implements Runnable{
	public void run(){
		try{
			Thread.sleep(800);
		}catch(Exception e){
			e.printStackTrace();
		}
		for(int i=0; i<5; i++){
			System.out.println("second");
		}
	}
}
