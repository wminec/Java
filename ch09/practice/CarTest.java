package ch09.practice;

public class CarTest {

	static void speedUp(Car car,int speed) throws TrafficException{
		int total_speed=car.getVelocity()+speed;
		
		if(total_speed<=50 || total_speed>100)
			throw new TrafficException("�ӵ� �����Դϴ�.");
		else
			car.setVelocity(total_speed);
	}
	public static void main(String[] args) {
		Car myCar=new Car("�ҳ�Ÿ",60);
		Car yourCar=new Car("���ʽý�",60);
		
		try{
			speedUp(myCar,100);
			System.out.println("dd");
		}catch(TrafficException te){
			System.out.println(te.getViolationMessage());
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}
	}

}
