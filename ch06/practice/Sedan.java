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
		System.out.println("overriding �޼ҵ� ȣ��");
		return carName+"�� �ӵ��� "+velocity + " �Դϴ�.";
	}
	public String getOwnerInfo(Sedan s){
		System.out.println("overriding �޼ҵ� ȣ��");
		return "Sedan�� �����ִ� "+owner;
	}
}
