package ch07.example;

public class StudentTest {

	public static void main(String[] args) {
		//Student s=new Student(); �߻� Ŭ������ �ν��Ͻ� ������ �Ұ����ϴ�.
		Student st=new University("ȫ�浿",3,22,"������");
		Elementary m=new Elementary("�̼���",2,"ȫ��");
		//�߻�Ŭ������ ��ĳ�������� ����� �����ϴ�.
		System.out.println("�л� �̸�: "+st.getName());
		System.out.println(st.getTeacher());
		System.out.println(m.getTeacher());
	}

}
