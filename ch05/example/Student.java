package ch05.example;

public class Student {
	private String name;
	private int grade;
	private String address;

	public Student(String _name,int _grade,String _address){
		System.out.println("인자가 3개인 생성자 호출");
		name=_name;
		grade=_grade;
		address=_address;
	}//생성자
	public Student(String _name,int _grade){
		System.out.println("인자가 2개인 생성자 호출");
		name=_name;
		grade=_grade;
	}//생성자
	public Student(String _name){
		System.out.println("인자가 1개인 생성자 호출");
		name=_name;
	}//생성자
	
	public Student(){
		System.out.println("디폴트 생성자 호출");
	}//default 생성자. 다른 생성자를 만들면 컴파일러가 자동으로 디폴트 생성자를 만들어 주지 않으므로 반드시 만들어줘야한다.
	
	public String getName(){
		return name;
	}
	public int getGrade(){
		return grade;
	}
	
	public void setName(String _name){
		name= _name;
	}
	public void setGrade(int _grade){
		grade=_grade;
	}
	public String getAddress(){
		return address;
	}
}
