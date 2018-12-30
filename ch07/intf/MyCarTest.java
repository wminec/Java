package ch07.intf;

public class MyCarTest {

	public static void main(String[] args) {
		//MyCar c1=new MyCar(); //interface는 인스턴스 생성 불가.
		
		MyCar c=new MySportsCar(); //업캐스팅으로 사용 가능.
		MySportsCar s = new MySportsCar();
		MyTruck t= new MyTruck();
		
		//Car.SAFE_SPEED=80;
		System.out.println("Car.SAFE_SPEED= "+MyCar.SAFE_SPEED);
		
		c.speedUp();
		c.speedDown();
		//c.turbo(); //오류 발생
		c.stop();
		
		System.out.println();
		
		s.speedUp();
		s.speedDown();
		s.turbo();
		s.stop();
	}

}
