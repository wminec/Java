package ch11.practice;

public class P03_ATMTest {

	public static void main(String[] args) {
		P03_ATM atm=new P03_ATM();
		Thread hong = new Thread(atm,"ȫ�浿"); //Ŭ����,�޼����? and �������� �̸�?
		Thread lee = new Thread(atm,"�̼���");
		
		hong.start();
		lee.start();
	}

}
