package ch03.example;

public class LogicalTest {

	public static void main(String[] args) {
		int a=0;
		int b=10;
		int c=0;
		
		System.out.println((a!=0)&&((c=b)>20));
		System.out.println("c= "+c);
		System.out.println((a!=0)&((c=b)>20));
		System.out.println("c= "+c+"\n");
		//&&�� ���� ������ ���� false�̹Ƿ� ���� ������ ���� ������, &�� ���� ������ false���� ���� ���� ����.
		
		c=0;
		System.out.println((a==0)||((c=b)>20));
		System.out.println("c= "+c);
		System.out.println((a==0)|((c=b)>20));
		System.out.println("c= "+c+"\n");
		//||�� ���� ������ ���� true�̹Ƿ� ���� ������ ������ �ʿ���� true�̹Ƿ� �������� ���� x, |�� ���� ������ ���� true�� ���� ���� ����.
		
		int var1=1;
		int result=0;
		
		result=(var1!=1)?0:1;	//"?"���� ���� true�̸� "?"���� ���� �ǵ��� �ְ�, false�̸� ":" ������ ���� �ǵ��� �ش�.
		System.out.println("result= "+result+"\n");
		
		String address="�λ�� ���ϱ�";
		if(address instanceof String)
			System.out.println("���� address�� String Ÿ���Դϴ�.");
		//instanceof�� �ַ� ������ ������ Ÿ���� ���ϱ� ���� ���ȴ�. �ڼ����� 6�忡�� ����.
	}

}
