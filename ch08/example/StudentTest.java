package ch08.example;

public class StudentTest {

	public static void main(String[] args) {
		MyStudent s=new MyStudent("�̼���",2);
		MyStudent s2=new MyStudent("�̼���",2);
		
		if(s==s2){
			System.out.println("�� �л��� �̸��� �г��� �����ϴ�.");
		}else{
			System.out.println("�� �л��� �̸��� �г��� �ٸ��ϴ�.");
		}
		
		if(s.equals(s2)){
			System.out.println("�� �л��� �̸��� �г��� �����ϴ�.");
		}else{
			System.out.println("�� �л��� �̸��� �г��� �ٸ��ϴ�.");
		}
	}

}
