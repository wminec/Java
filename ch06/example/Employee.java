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
	//정규직 총 급여 구하기
	int calcTotalPay(){
		int totalPay=12*payPerMonth+commsion;
		return totalPay;
	}
}
