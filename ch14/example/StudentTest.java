package ch14.example;

public class StudentTest {

	public static void main(String[] args) {
		Student s1;
		Address addr;
		
		addr=new Address("������",1116-1);
		s1=new Student("ȫ�浿",3,addr);
		
		String name=s1.getName();
		int grade=s1.getGrade();
		
		String city=s1.getAddress().getCity();
		int bungi=s1.getAddress().getBungi();
		
		System.out.println("�л� ����");
		System.out.println("------------------");
		System.out.println("�̸�: "+name+", �г�: "+grade+", �ּ�: "+city+" "+bungi+"����");
	}

}
