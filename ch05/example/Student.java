package ch05.example;

public class Student {
	private String name;
	private int grade;
	private String address;

	public Student(String _name,int _grade,String _address){
		System.out.println("���ڰ� 3���� ������ ȣ��");
		name=_name;
		grade=_grade;
		address=_address;
	}//������
	public Student(String _name,int _grade){
		System.out.println("���ڰ� 2���� ������ ȣ��");
		name=_name;
		grade=_grade;
	}//������
	public Student(String _name){
		System.out.println("���ڰ� 1���� ������ ȣ��");
		name=_name;
	}//������
	
	public Student(){
		System.out.println("����Ʈ ������ ȣ��");
	}//default ������. �ٸ� �����ڸ� ����� �����Ϸ��� �ڵ����� ����Ʈ �����ڸ� ����� ���� �����Ƿ� �ݵ�� ���������Ѵ�.
	
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
