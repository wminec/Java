package ch11.Thread;

public class Horse1 implements Runnable{
	private int horse_num;
	
	public Horse1(int horse_num){
		this.horse_num=horse_num;
	}
	
	public void run(){
		long sleepTime=(long)(Math.random()*500);
		System.out.println(horse_num+"번 말이 "+sleepTime+"만큼 sleep..");
		try{
			Thread.sleep(sleepTime);
		}catch(Exception e){
			e.printStackTrace();
		}
		for(int i=1; i<=10; i++){
			System.out.println(horse_num+"번 말이 "+100*i+"미터 도착");
		}
		System.out.println(horse_num+"번 말이 "+"결승선 도착");
	}
}
