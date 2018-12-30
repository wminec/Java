package ch11.practice;

public class P02_countThread_BAndY extends Thread{
	private String tName;
	private P02_Area_BAndY area;
	
	public P02_countThread_BAndY(String tName, P02_Area_BAndY area){
		this.tName=tName;
		this.area=area;
	}
	
	public void run(){
		area.increase(tName);
		
	}
}