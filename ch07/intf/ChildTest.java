package ch07.intf;

public class ChildTest {

	public static void main(String[] args) {
		Child c=new Child();
		
		ITest1 i1=new Child(); //�������̽��� ��ĳ���� �̿�
		i1.func1();
		//i1.func2();
		c.func1();
		c.func2();
	}

}
