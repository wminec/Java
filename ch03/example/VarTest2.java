package ch03.example;

public class VarTest2 {

	public static void main(String[] args) {
		//String�� Ŭ����(class)�̴�... �׷��� ù���ڸ� �빮�ڷ�.
		String name="ȫ�浿";
		String address="����� ���ʱ� ���ʵ�";
		boolean isBoolean=true;
		
		address="��⵵ ������ �ȴޱ�";
		
		System.out.println(name + "�� ���� �ּҴ�"+ address + " �Դϴ�.");
		System.out.println();
		
		System.out.println("isBoolean�� ���� " +isBoolean+"�Դϴ�.");
		System.out.println();
		
		isBoolean=false;
		
		System.out.println("isBoolean�� ���� " + isBoolean +" �Դϴ�.");
	}

}
