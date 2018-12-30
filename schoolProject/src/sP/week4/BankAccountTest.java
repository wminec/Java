package sP.week4;

class BankAccount{
	private String name;	//이름 변수
	private String accountName;	//계좌명 변수
	private int balance;	//잔액 변수
	private double interestRate;	//이자율 변수
	
	public BankAccount(String n, String ac, int b, double ir){
		name=n;
		accountName=ac;
		balance=b;
		interestRate=ir;
	}//매개변수가 4개인 생성자
	public BankAccount(){
		name=null;
		accountName=null;
		balance=0;
		interestRate=0;
	}//디폴트 생성자
	public String getName(){ return name; }
	public void setName(String n){ name=n; }
	public String getAccountName(){ return accountName; }
	public void setAccountName(String an){ accountName=an; }
	public int getBalance(){ return balance; }
	public void setBalance(int b){ balance=b; }
	public double getInterestRate(){ return interestRate; }
	public void setInterestRate(double ir){ interestRate=ir; }
	//접근자와 설정자 선언
	public String toString(){
		return "이름: "+name+", 계좌명: "+accountName+", 잔액: "+balance+", 이자율: "+interestRate;
	}//클래스 정보 출력
}
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b = new BankAccount("홍길동","102938401",100000,0.5);//객체 생성
		
		System.out.println(b);//객체 정보 출력
	}
}