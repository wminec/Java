package ch03.example;

public class CurrencTest {

	public static void main(String[] args) {
		int won=354000;
		int rate=960;
		float dollar;
		
		dollar=won/rate; //������ �����Ѵ�.(�Ҽ��δ� ����)
		System.out.println(won+"�� �� ���� �޷��� :"+dollar+" �޷�");
		
		dollar=(float)won/(float)rate;
		System.out.println(won+"�� �� ���� �޷��� :"+dollar+" �޷�");
		dollar=(float)won/rate;
		System.out.println(won+"�� �� ���� �޷��� :"+dollar+" �޷�");
		// float/int�� int�� �ڵ����� float�� ����(float/float)�� �ȴ�. 
		
		//won=dollar*rate;
		won=(int)dollar*rate;
		System.out.println(dollar+"�޷��� ���� ���� :"+won+"��");
		//���⼭ dollar�� ���� 368.75 floatŸ���� �����̴�.
		//���� �޷��� ���� ������ �ٲ� �� ����� ����� ���� ��� �� ������ ��ȯ �� �� �̴�.
		won=(int)(dollar*rate);
		System.out.println(dollar+"�޷��� ���� ���� :"+won+"��");
	}
}
