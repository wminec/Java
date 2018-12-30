package ch07.example;

public class StudentTest {

	public static void main(String[] args) {
		//Student s=new Student(); 추상 클래스는 인스턴스 생성이 불가능하다.
		Student st=new University("홍길동",3,22,"차범근");
		Elementary m=new Elementary("이순신",2,"홍명보");
		//추상클래스는 업캐스팅으로 사용이 가능하다.
		System.out.println("학생 이름: "+st.getName());
		System.out.println(st.getTeacher());
		System.out.println(m.getTeacher());
	}

}
