package ch07.intf;

public class ChildTest {

	public static void main(String[] args) {
		Child c=new Child();
		
		ITest1 i1=new Child(); //인터페이스는 업캐스팅 이용
		i1.func1();
		//i1.func2();
		c.func1();
		c.func2();
	}

}
