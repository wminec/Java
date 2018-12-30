package ch11.practice;

public class P02_countThread_LAndS extends Thread{
	private String tName;
	private P02_Area_LAndS area;
	
	public P02_countThread_LAndS(String tName, P02_Area_LAndS area){
		this.tName=tName;
		this.area=area;
	}
	
	public void run(){
		area.increase(tName);
		
	}
}