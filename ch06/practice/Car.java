package ch06.practice;

public class Car {
	int velocity;
	int wheelNum;
	String carName;
	String owner;  //차소유주
	
	public Car(){
		System.out.println("Car 객체 생성자 호출");
	}
	
	//차의 기능을 하는 메서드
	public void speedUp(int speed){
		velocity=velocity+speed;
	}
	
	public void speedDown(int speed){
		velocity=velocity-speed;
	}
	
	public void stop(){
		velocity=0;
	}
	public String getCarInfo(){
		return carName+"의 속도는 "+velocity;
	}
	public String getOwnerInfo(Car c){
		return "차 소유주는 "+owner;
	}
}
