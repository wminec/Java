package sP.week3;
class Employee{
	private String name;	//사원 이름
	private String phone;	//사원 전화번호
	private int salary;		//사원 연봉
	
	public String getName(){ return name;}	//이름 접근자
	public void setName(String n){ name=n; }//이름 설정자
	public String getPhone(){ return phone; }//전화번호 접근자
	public void setPhone(String p){ phone=p; }//전화번호 설정자
	public int getSalary(){ return salary; }//연봉 접근자
	public void setSalary(int s){ salary=s; }//연봉 설정자
	
	public String toString(){
		return "이름: "+name+",전화번호: "+phone+",연봉: "+salary;
	}//Employee클래스 정보 출력 메소드 오버로딩
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();	//객체 생성
		
		emp.setName("가나다");	//이름 설정
		emp.setPhone("010-2232-2319");	//전화번호 설정
		emp.setSalary(3000);	//연봉 설정
		
		System.out.println(emp);	//정보 출력
	}
}
