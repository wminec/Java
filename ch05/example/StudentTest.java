package ch05.example;

import com.jweb.Student;

public class StudentTest {
	public static void main(String[] args){
		Student s= new Student();
		Student s2=new Student("ȫ�浿");
		
		//s.setName("�̼���");
		String name=s.getName();
		int grade=s.getGrade();
		System.out.println("ù ��° �л��� �̸��� "+name+", �г��� "+grade);
		
		name=s2.getName();
		grade=s2.getGrade();
		System.out.println("�� ��° �л��� �̸��� "+name+", �г��� "+grade);
	}

}
