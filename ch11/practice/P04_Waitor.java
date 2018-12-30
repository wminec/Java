package ch11.practice;

public class P04_Waitor extends Thread{
	String waitor;
	P04_Food food;
	
	public P04_Waitor(String waitor,P04_Food food){
		this.waitor=waitor;
		this.food=food;
	}
	
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			food.receiveOrder(waitor);
		}
	}

}
