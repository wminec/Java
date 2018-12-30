package sP.week4;

class Dog {
	private String name;	//이름 변수
	private String breed;	//종 변수
	private int age;	//나이 변수
	
	public Dog(String n, int a){
		name=n;
		age=a;
		breed=null;
	}//매개변수가 2개인 생성자로 이름과 나이를 넣고 종은 초기화 한다.
	public Dog(String n, String b, int a){
		name=n;
		breed=b;
		age=a;
	}//매개변수가 3개인 생성자로 이름과 나이와 종을 넣는다.
	Dog(){}//디폴트 생성자
	public void setName(String n){ name=n; }
	public String getName(){ return name; }
	public void setAge(int a){ age=a; }
	public int getAge(){ return age; }
	public void setBreed (String b){ breed=b; }
	public String getBreed(){ return breed; }
	
	public String toString(){
		return "이름: "+name+",나이: "+age+",종: "+breed;
	}//클래스 내용 출력
}

public class DogTest {

	public static void main(String[] args) {
		Dog d;
		
		d= new Dog("멍멍이","요크셔테리어",1);
		
		System.out.println(d);
	}
}