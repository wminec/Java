package ch06.practice;

public class Car {
	int velocity;
	int wheelNum;
	String carName;
	String owner;  //��������
	
	public Car(){
		System.out.println("Car ��ü ������ ȣ��");
	}
	
	//���� ����� �ϴ� �޼���
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
		return carName+"�� �ӵ��� "+velocity;
	}
	public String getOwnerInfo(Car c){
		return "�� �����ִ� "+owner;
	}
}
