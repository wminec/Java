package ch09.practice;

public class Car {
	private String carName;
	private int velocity;
	
	public Car(String carName,int velocity){
		this.carName=carName;
		this.velocity=velocity;
	}
	
	public String getCarName(){
		return carName;
	}
	
	public void setCarName(String carName){
		this.carName=carName;
	}
	
	public int getVelocity(){
		return velocity;
	}
	
	public void setVelocity(int velocity){
		this.velocity=velocity;
	}
}
