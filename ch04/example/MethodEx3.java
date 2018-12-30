package ch04.example;

public class MethodEx3 {
	//매개변수가 2개인 메서드를 선언한다.
	public void print(int a,int b){
		int c=a+b;
		System.out.println("결과값="+c);
	}
	
	//매개변수로 문자열을 받는 메서드를 선언한다.
	public void print1(String str){
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		//2. 변수 선언
		int num1=11;
		int num2=22;
		int result=0;
		
		//3. 사용할 메서드가 있는 클래스의 인스턴스 생성
		MethodEx3 method=new MethodEx3();
		
		//4. 메서드 호출
		method.print(10, 30);
		//method.print(10,30.5f);
		method.print(num1, num2);
		
		method.print1("안녕하세요");

	}

}
