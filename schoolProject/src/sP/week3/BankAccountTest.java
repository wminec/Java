package sP.week3;

class BankAccount{
	int accountNumber;	//���� ����
	String owner;		//���� ��ȣ
	int balance;		//������

	
	void deposit(int amount){	//����
		balance+=amount;
	}
	void withdraw(int amount){	//����
		balance-=amount;
	}
	//���� ��ü�� �ܾ׿��� amount��ŭ�� otherAccount ���·� �۱��Ѵ�
	public int transfer(int amount, BankAccount otherAccount){
		balance-=amount;
		otherAccount.deposit(amount);
		return balance;
	}
	
	public String toString(){ //������ ���� ���
		return "���� �ܾ��� "+balance + "�Դϴ�.";
	}
}

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(); //���� ���� ��ü ����
		BankAccount yourAccount = new BankAccount(); // �ٸ� ����� ���� ��ü ����
		
		myAccount.deposit(10000);		//���� ���¿� 10000����
		System.out.println(myAccount);	//���� ���� ���� ���
		//my 10000
		myAccount.withdraw(8000);		//���� ���¿��� 8000����
		System.out.println(myAccount);	//���� ���� ���� ���
		//my 2000

		yourAccount.deposit(10000);		//�ٸ� ����� ���¿� 10000����
		System.out.println(yourAccount);//�ٸ� ����� ���� ���� ���
		//your 10000
		yourAccount.transfer(2000, myAccount);//�ٸ������ ���¿��� ���� ���¿� 2000�۱�
		
		System.out.println(myAccount);
		//my 4000
		System.out.println(yourAccount);//������ ���� ���� ���
		//your 8000
	}
}