package ch11.Thread;

public class ATMTest {

	public static void main(String[] args) {
		ATM atm=new ATM();
		Thread hong = new Thread(atm,"ȫ�浿"); //Ŭ����,�޼����? and �������� �̸�?
		Thread lee = new Thread(atm,"�̼���");
		
		hong.start();
		lee.start();
	}

}
