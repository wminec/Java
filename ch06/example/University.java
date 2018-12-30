package ch06.example;

public class University extends Student {
	private int courses; //학점
	
	public University(String name,int grade,int courses){
		super();
		System.out.println("University 생성자 호출");
		super.name=name;
		super.grade=grade;//super.grade가 부모의 변수
		//grade=_grade;
		this.courses=courses;
	}
	
	public University(){
		this("이순신",2,20);
	}
	
	public int getCourses(){
		return courses;
	}
	
	public String getStudInfo(){
		System.out.println("University 클래스의 getStudInfo 메서드 출력");
		return "이름은>> "+name+", 학년은>> "+grade+", 신청 학점은>> "+courses;
	}
}
