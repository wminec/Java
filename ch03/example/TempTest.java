package ch03.example;

public class TempTest {

	public static void main(String[] args) {
		int BASE=32;
		float celsius=0f,fahrenheit=0f;
		
		fahrenheit=100;
		
		celsius=(fahrenheit-BASE)*5.0f/9.0f;
		System.out.println("ȭ�� "+fahrenheit+"���� ���� ������ " +celsius+"���Դϴ�.");
		
		fahrenheit=celsius*9.0f/5.0f+BASE;
		System.out.println("ȭ�� "+celsius+"���� ���� ������ " +fahrenheit+"���Դϴ�.");
	}

}
