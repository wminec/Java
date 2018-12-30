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
		//SAPE_SPEED=value; 오류발생
		System.out.println("고속도로 규정속도는 "+SAFE_SPEED);
	}
	public static void main(String args[]){
		MyCar myCar;
		MyCar yourCar;
		yourCar=new MyCar(MyCar.SAFE_SPEED,"소나타");
		
		//MyCar.SAFE_SPEED=80; 오류 발생
		myCar=new MyCar(MyCar.SAFE_SPEED,"아반테");
		
		System.out.println("당신 차의 규정 속도는 "+yourCar.velocity+" 입니다.");
		System.out.println("내 차의 규정 속도는 "+myCar.velocity+" 입니다.");
	}
}
