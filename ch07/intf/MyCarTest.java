package ch07.intf;

public class MyCarTest {

	public static void main(String[] args) {
		//MyCar c1=new MyCar(); //interface�� �ν��Ͻ� ���� �Ұ�.
		
		MyCar c=new MySportsCar(); //��ĳ�������� ��� ����.
		MySportsCar s = new MySportsCar();
		MyTruck t= new MyTruck();
		
		//Car.SAFE_SPEED=80;
		System.out.println("Car.SAFE_SPEED= "+MyCar.SAFE_SPEED);
		
		c.speedUp();
		c.speedDown();
		//c.turbo(); //���� �߻�
		c.stop();
		
		System.out.println();
		
		s.speedUp();
		s.speedDown();
		s.turbo();
		s.stop();
	}

}
