package sP.week4;

class Dog {
	private String name;	//�̸� ����
	private String breed;	//�� ����
	private int age;	//���� ����
	
	public Dog(String n, int a){
		name=n;
		age=a;
		breed=null;
	}//�Ű������� 2���� �����ڷ� �̸��� ���̸� �ְ� ���� �ʱ�ȭ �Ѵ�.
	public Dog(String n, String b, int a){
		name=n;
		breed=b;
		age=a;
	}//�Ű������� 3���� �����ڷ� �̸��� ���̿� ���� �ִ´�.
	Dog(){}//����Ʈ ������
	public void setName(String n){ name=n; }
	public String getName(){ return name; }
	public void setAge(int a){ age=a; }
	public int getAge(){ return age; }
	public void setBreed (String b){ breed=b; }
	public String getBreed(){ return breed; }
	
	public String toString(){
		return "�̸�: "+name+",����: "+age+",��: "+breed;
	}//Ŭ���� ���� ���
}

public class DogTest {

	public static void main(String[] args) {
		Dog d;
		
		d= new Dog("�۸���","��ũ���׸���",1);
		
		System.out.println(d);
	}
}