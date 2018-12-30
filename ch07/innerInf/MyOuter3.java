package ch07.innerInf;

public class MyOuter3 {
	private String name;
	private int age;
	
	public MyOuter3(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName(){ return name; }
	public int getage(){ return age; }
	
	static class Inner{
		private String address;
		static String tel="010-1111-2222";
		
		public Inner(String address){
			this.address=address;
		}
		public String getUserInfo(){
			//return name+" "+age; //static 내부 클래스에서는 외부 클래스의 멤버 변수에 접근이 불가능하다.
			return "주소는: "+address+", 전화번호: "+tel;
		}
	}
}
