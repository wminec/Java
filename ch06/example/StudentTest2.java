package ch06.example;

public class StudentTest2 {

	public static void main(String[] args) {
		Student s= new University("ȫ�浿",3,20);
		
		//system.out.println(s.getCourses());
		University u = (University)s;
		System.out.println("������>> "+u.getCourses()+"��");

	}

}
