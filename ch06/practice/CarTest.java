package ch06.practice;

public class CarTest {
	public static void main(String[] args){
		//1.���� ����
		Sedan myCar;
		Truck truck;
		Bus bus;
		
		//2.��ü ����
		myCar=new Sedan("�ƹ���",60,4,"ȫ�浿");
		truck=new Truck("1�� ����",60,1,"�ڹ� ȭ��");  
		bus =new Bus("1001�� ����",20,800,50,"���� ���"); 
		
		//3.�޼ҵ� ȣ��
		
		System.out.println(myCar.getOwnerInfo(myCar));
		System.out.println(truck.getCarInfo());
		System.out.println(bus.getCarInfo());
	}
}
