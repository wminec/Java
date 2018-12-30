package ch06.example;

public class EmpTest1 {

	public static void main(String[] args) {
		Employee1 e=new Account1("홍길동","과장");
		Employee1 e1=new Research1("이순신","선임연구원");
		
		e.getEmpInfo(e);
		e1.getEmpInfo(e1);

	}

}
