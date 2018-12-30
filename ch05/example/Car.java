package ch05.example;

public class Car {
	private String carName;
	private String carColor;
	private int carSize;
	private int velocity;
	
	public Car(String _carName,String _carColor,int _carSize,int _velocity){
		carName=_carName;
		carColor=_carColor;
		carSize=_carSize;
		velocity=_velocity;
	}
	public Car(){
	}
	
	public String getCarName(){
		return carName;
	}
	public void setCaName(String _name){
		carName=_name;
	}
	public String getCarColor(){
		return carColor;
	}
	public void setCarColor(String _carColor){
		carColor=_carColor;
	}
	
	public int getCarSize(){
		return carSize;
	}
	public void setCarSize(int _carSize){
		carSize=_carSize;
	}
	
	public int getVelocity(){
		return velocity;
	}
	public void setVelocity(int _velocity){
		velocity=_velocity;
	}
	
	public void speedUp(){
		velocity=velocity+ 1;
	}
	public void speedDown(){
		velocity=velocity-1;
		if(velocity<0)
			velocity=0;
	}
	
	public void stop(){
		velocity=0;
	}
	
	public void park(){
		System.out.println("주차합니다.");
	}
}
