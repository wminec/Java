package ch04.example;

public class MethodEx2 {
	public void print(int a){
		System.out.println("°á°ú°ª= "+a);
	}

	public static void main(String[] args) {
		int a=11;
		int b=22;
		int result=0;
		
		MethodEx2 m=new MethodEx2();
		result=a+b;
		
		m.print(10);
		m.print(b);
		m.print(result);

	}

}
