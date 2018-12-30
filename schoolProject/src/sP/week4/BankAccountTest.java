package sP.week4;

class BankAccount{
	private String name;	//�̸� ����
	private String accountName;	//���¸� ����
	private int balance;	//�ܾ� ����
	private double interestRate;	//������ ����
	
	public BankAccount(String n, String ac, int b, double ir){
		name=n;
		accountName=ac;
		balance=b;
		interestRate=ir;
	}//�Ű������� 4���� ������
	public BankAccount(){
		name=null;
		accountName=null;
		balance=0;
		interestRate=0;
	}//����Ʈ ������
	public String getName(){ return name; }
	public void setName(String n){ name=n; }
	public String getAccountName(){ return accountName; }
	public void setAccountName(String an){ accountName=an; }
	public int getBalance(){ return balance; }
	public void setBalance(int b){ balance=b; }
	public double getInterestRate(){ return interestRate; }
	public void setInterestRate(double ir){ interestRate=ir; }
	//�����ڿ� ������ ����
	public String toString(){
		return "�̸�: "+name+", ���¸�: "+accountName+", �ܾ�: "+balance+", ������: "+interestRate;
	}//Ŭ���� ���� ���
}
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b = new BankAccount("ȫ�浿","102938401",100000,0.5);//��ü ����
		
		System.out.println(b);//��ü ���� ���
	}
}