package ch07.intf;

public class MySportsCar implements MyCar{
	public void speedUp(){
		System.out.println("SportsCar speedUp");
	}
	
	public void speedDown(){
		System.out.println("SportsCar speedDown");
	}
	
	public void stop(){
		System.out.println("SprotsCar stop");
	}
	
	public void turbo(){
		System.out.println("SprotsCar turbo 기능 입니다.");
	}
}
