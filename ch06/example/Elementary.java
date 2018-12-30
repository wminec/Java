package ch06.example;

public class Elementary extends Student {
	private int courses;
	public Elementary(String _name,int _grade){
		System.out.println("Elementary 생성자 호출");
		name=_name;
		grade=_grade;
	}
	public Elementary(String _name, int _grade, String _gender, int _age){
		System.out.println("인자가 개인 Elementary 생성자 호출");
		name=_name;
		grade=_grade;
		gender=_gender;
		age=_age;
	}
	public Elementary(String name,int grade,int courses){
		super();
		System.out.println("University 생성자 호출");
		super.name=name;
		super.grade=grade;//super.grade가 부모의 변수
		//grade=_grade;
		this.courses=courses;
	}
}
