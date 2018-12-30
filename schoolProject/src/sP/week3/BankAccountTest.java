package sP.week3;

class BankAccount{
	int accountNumber;	//은행 계좌
	String owner;		//계좌 번호
	int balance;		//예금주

	
	void deposit(int amount){	//저금
		balance+=amount;
	}
	void withdraw(int amount){	//인출
		balance-=amount;
	}
	//현재 객체의 잔액에서 amount만큼을 otherAccount 계좌로 송금한다
	public int transfer(int amount, BankAccount otherAccount){
		balance-=amount;
		otherAccount.deposit(amount);
		return balance;
	}
	
	public String toString(){ //계좌의 정보 출력
		return "현재 잔액은 "+balance + "입니다.";
	}
}

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(); //나의 계좌 객체 생성
		BankAccount yourAccount = new BankAccount(); // 다른 사람의 계좌 객체 생성
		
		myAccount.deposit(10000);		//나의 계좌에 10000저금
		System.out.println(myAccount);	//나의 계좌 정보 출력
		//my 10000
		myAccount.withdraw(8000);		//나의 계좌에서 8000인출
		System.out.println(myAccount);	//나의 계좌 정보 출력
		//my 2000

		yourAccount.deposit(10000);		//다른 사람의 계좌에 10000저금
		System.out.println(yourAccount);//다른 사람의 계좌 정보 출력
		//your 10000
		yourAccount.transfer(2000, myAccount);//다른사람의 계좌에서 나의 계좌에 2000송금
		
		System.out.println(myAccount);
		//my 4000
		System.out.println(yourAccount);//각각의 계좌 정보 출력
		//your 8000
	}
}