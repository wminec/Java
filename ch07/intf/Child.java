package ch07.intf;

public class Child implements ITest1, ITest2{
	public void test(){
		System.out.println("test() �޼����Դϴ�.");
	}
	public void func1(){
		System.out.println("func1 �޼��� ȣ��");
	}
	
	public void func2(){
		System.out.println("func2 �޼��� ȣ��");
	}
}
