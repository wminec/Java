package ch07.example;

public class MyCar {
	private static final int SAFE_SPEED=60;
	int velocity;
	String carName;
	
	public MyCar(int velocity, String carName){
		this.velocity=velocity;
		this.carName=carName;
	}
	public void speedUp(int value){
		//SAPE_SPEED=value; �����߻�
		System.out.println("��ӵ��� �����ӵ��� "+SAFE_SPEED);
	}
	public static void main(String args[]){
		MyCar myCar;
		MyCar yourCar;
		yourCar=new MyCar(MyCar.SAFE_SPEED,"�ҳ�Ÿ");
		
		//MyCar.SAFE_SPEED=80; ���� �߻�
		myCar=new MyCar(MyCar.SAFE_SPEED,"�ƹ���");
		
		System.out.println("��� ���� ���� �ӵ��� "+yourCar.velocity+" �Դϴ�.");
		System.out.println("�� ���� ���� �ӵ��� "+myCar.velocity+" �Դϴ�.");
	}
}
