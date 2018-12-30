package ch08.example;

public class StudentTest1 {

	public static void main(String[] args) {
		MyStudent1 s= new MyStudent1("이순신",24);
		
		System.out.println(s); //toString() 오버라이딩 안 하면 자동으로 toString()이 호출된다.
		System.out.println(s.toString());
	}

}
