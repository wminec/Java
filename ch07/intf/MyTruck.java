package ch07.intf;

public class MyTruck implements MyCar {
	public void speedUp(){
		System.out.println("Truuck speedUp");
	}
	
	public void speedDown(){
		System.out.println("Truck speedDown");
	}
	
	public void stop(){
		System.out.println("Truck stop");
	}
}
