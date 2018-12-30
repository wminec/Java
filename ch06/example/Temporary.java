package ch06.example;

public class Temporary extends Employee {
	private int workedHour;
	
	public Temporary(String name, int payPerMonth, int commsion, int workedHour){
		super(name,payPerMonth,commsion);
		this.workedHour=workedHour;
	}
	
	protected int calcTotalPay(){
		//���� �޼��带 ȣ���Ͽ� �� �޿��� ���Ѵ�.
		//int totalPay=12*payPerMonth+commsion+workedHour*2000;
		int temp=super.calcTotalPay();
		//�ӽ����� �ٽ� �� ���� �ð��� �� �޿��� ���� �� ���Ѵ�.
		int tempTotalPay=temp+workedHour*2000;
		return tempTotalPay;
	}
}
