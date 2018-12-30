package ch04.example;

public class MethodEx1 {
	public void print(){
		System.out.println("메서드를 호출합니다.");
		//return ;
		//return 7;
	}

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int result=0;
		
		MethodEx1 m=new MethodEx1();
		m.print();
		m.print();
		m.print();

	}

}
