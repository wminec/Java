package ch06.example;

public class Employee {
	String name;
	int payPerMonth;
	int commsion;
	
	public Employee(String name, int payPerMonth, int commison){
		this.name=name;
		this.payPerMonth=payPerMonth;
		this.commsion=commison;
	}
	//������ �� �޿� ���ϱ�
	int calcTotalPay(){
		int totalPay=12*payPerMonth+commsion;
		return totalPay;
	}
}
