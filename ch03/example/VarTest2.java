package ch03.example;

public class VarTest2 {

	public static void main(String[] args) {
		//String도 클래스(class)이다... 그래서 첫글자를 대문자로.
		String name="홍길동";
		String address="서울시 서초구 서초동";
		boolean isBoolean=true;
		
		address="경기도 수원시 팔달구";
		
		System.out.println(name + "의 실제 주소는"+ address + " 입니다.");
		System.out.println();
		
		System.out.println("isBoolean의 값은 " +isBoolean+"입니다.");
		System.out.println();
		
		isBoolean=false;
		
		System.out.println("isBoolean의 값은 " + isBoolean +" 입니다.");
	}

}
