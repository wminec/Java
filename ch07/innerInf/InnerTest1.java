package ch07.innerInf;

public class InnerTest1 {

	public static void main(String[] args) {
		MyOuter1 myOuter=new MyOuter1("홍길동",20);
		MyOuter1.Inner inner=myOuter.new Inner("세종시 세종구");
		//내부 클래스를 사용하기 위해서는 먼저 외부 클래스의 인스턴스를 생성한 후 내부 클래스의 인스턴스를 생성한다.
		
		System.out.println("고객정보>> "+inner.getUserInfo());
	}

}
