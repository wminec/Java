package ch03.example;

public class DataTypeTest {

	public static void main(String[] args) {
		byte b=100;	//-128~127
		short s=120;	//-32768~32767
		int num=250000;	//-2147483648~2147483647
		
		System.out.println("b�� ���� "+b);
		System.out.println("s�� ���� "+s);
		System.out.println("num�� ���� "+num);
		
		b=(byte)(100+100);
		//s=400000;	������ �����ϸ� ���� �߻�
		s=(short)(32767+2);
		//num=2147483648;	���� ǥ�� ������ �Ѿ�� ���� �����ϸ� ���� �߻�.
		num=2147483647+1;
		
		System.out.println();
		System.out.println("b�� ���� "+b);
		System.out.println("s�� ���� "+s);
		System.out.println("num�� ���� "+num);
	}

}
