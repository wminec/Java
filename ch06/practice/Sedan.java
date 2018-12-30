package ch06.practice;

public class Sedan extends Car{
	public Sedan(String carName,int velocity, int wheelNum ){
		super.carName=carName;
		super.velocity=velocity;
		super.wheelNum=wheelNum;
	}
	
	public Sedan(String carName,int velocity, int wheelNum,String owner){
		super.carName=carName;
		super.velocity=velocity;
		super.wheelNum=wheelNum;
		super.owner=owner;
	}
	public String getCarInfo(){
		System.out.println("overriding 메소드 호출");
		return carName+"의 속도는 "+velocity + " 입니다.";
	}
	public String getOwnerInfo(Sedan s){
		System.out.println("overriding 메소드 호출");
		return "Sedan의 소유주는 "+owner;
	}
}
