package ch14.example;

public class VarArgsTest {

	public static void main(String[] args) {
		Varargs var = new Varargs();
		
		var.method1("������","������","�̼���");
		var.method2("������", 1,2,3,4);
	}
}

class Varargs{
	public void method1(String ... name){
		for(String temp:name){
			System.out.println(temp);
		}
	}
	
	public void method2(String name, int ... num){
		System.out.println(name);
		
		for(int i:num){
			System.out.println(i);
		}
	}
}
