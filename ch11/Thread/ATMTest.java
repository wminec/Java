package ch11.Thread;

public class ATMTest {

	public static void main(String[] args) {
		ATM atm=new ATM();
		Thread hong = new Thread(atm,"홍길동"); //클래스,메서드명? and 스레드의 이름?
		Thread lee = new Thread(atm,"이순신");
		
		hong.start();
		lee.start();
	}

}
