package ch06.example;

public class Person {
	String gender;
	int age;
	public Person(){
		System.out.println("Person 생성자 호출");
	}
	public String getGender(){return gender;}
	public int getAge(){return age;}
}
