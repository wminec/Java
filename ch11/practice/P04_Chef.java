package ch11.practice;

public class P04_Chef extends Thread{
	String chef;
	P04_Food food;
	
	public P04_Chef(String chef, P04_Food food){
		this.chef=chef;
		this.food=food;
	}
	
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			food.makeFood(chef);
		}
	}
}
