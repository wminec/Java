package ch06.practice;

public class Bus extends Car{
	private int passenger;  //���� �°� ��
	private int fee ;  //���� ���
	private String company;  //���� �Ҽ�ȸ��
	
	
	//������
	public Bus(String carName,int passenger,int fee, int velocity){
		System.out.println("Bus ������ ȣ��");
		super.carName=carName;
		super.velocity=velocity;
		this.passenger=passenger;
		this.fee=fee;
	}

	public Bus(String carName,int velocity,int passenger,int fee, String company){
		System.out.println("Bus ������ ȣ��");
		super.carName=carName;
		super.velocity=velocity;
		this.passenger=passenger;
		this.fee=fee;
		this.company=company;
	}
		
	//getters and setters
	public int getPassenger(){
		return passenger;
	}
	
	public int getFee(){
		return fee;
	}
	
	public void setPassenger(int p){
		passenger=p;
	}
	
	public void setFee(int f){
		fee=f;
	}
	
	public String getCompany(){
		return company;
	}
	
	public void setCompany(String c){
		company=c;
	}
	
	//�°��� �¿�� ���
	public void ridePassenger(){
		if(passenger>0)
			System.out.println("�°��� �¿�ϴ�.");
		
	}
	//overriding �޼ҵ�
	public String getCarInfo(){
		System.out.println("overriding �޼ҵ� ȣ��");
		return carName+"�� �ӵ��� "+velocity + " �̰� " + " ���� �°�����  "+passenger+ " ���̰�, ���� ����� " +fee+ "�� �Դϴ�.";
	}
}
