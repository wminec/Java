package ch06.practice;

public class Truck extends Car{
	private  int load;  //����ȭ����
	private String company; //Ʈ��ȸ��
	
	//������
	public Truck(String carName,int load,int velocity){
		System.out.println("Truck ������ ȣ��");
		super.carName=carName;
		super.carName=carName;
		this.load=load;
	}
	
	public Truck(String carName,int load,int velocity,String company){
		System.out.println("Truck ������ ȣ��");
		super.carName=carName;
		super.velocity=velocity;
		this.load=load;
		this.company=company;
	}	
	public int getLoad(){
		return load;
	}
	
	public void setLoad(int l){
		load=l;
	}
	
	public String getCompany(){
		return company;
	}
	
	public void setCompany(String c){
		company=c;
	}
	//ȭ���� ����ϴ� ���
	public void carryLoad(){
		if(load>0)
			System.out.println("ȭ���� ����մϴ�.");
		else
			System.out.println("ȭ���� �Ǿ��ּ���");
	}
	
	//overriding �޼ҵ�
	public String getCarInfo(){
		System.out.println("overriding �޼ҵ� ȣ��");
		return carName+"�� �ӵ��� "+velocity + " �̰� " + " ȭ�� ���緮�� "+load + " �Դϴ�.";
	}
}
