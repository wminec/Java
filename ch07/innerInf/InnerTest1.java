package ch07.innerInf;

public class InnerTest1 {

	public static void main(String[] args) {
		MyOuter1 myOuter=new MyOuter1("ȫ�浿",20);
		MyOuter1.Inner inner=myOuter.new Inner("������ ������");
		//���� Ŭ������ ����ϱ� ���ؼ��� ���� �ܺ� Ŭ������ �ν��Ͻ��� ������ �� ���� Ŭ������ �ν��Ͻ��� �����Ѵ�.
		
		System.out.println("������>> "+inner.getUserInfo());
	}

}
