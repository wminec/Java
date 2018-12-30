package ch06.example;

public class EmpTest {

	public static void main(String[] args) {
		String name;
		int totalPay;
		Employee Hong,Lee;
		
		Lee=new Regular("이순신",2000000,5000000);
		Hong=new Temporary("홍길동",1500000,0,500);
		
		System.out.println("사원 정보 출력");
		name=Lee.name;
		totalPay=Lee.calcTotalPay();
		System.out.println("사원 이름: "+name+", 사원 총 급여: "+totalPay+"원");
		
		name=Hong.name;
		totalPay=Hong.calcTotalPay();//오버라이딩된 메서드 호출
		System.out.println("사원 이름: "+name+", 사원 총 급여: "+totalPay+"원");

	}

}
