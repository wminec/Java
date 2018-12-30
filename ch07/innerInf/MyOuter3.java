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
			//return name+" "+age; //static ���� Ŭ���������� �ܺ� Ŭ������ ��� ������ ������ �Ұ����ϴ�.
			return "�ּҴ�: "+address+", ��ȭ��ȣ: "+tel;
		}
	}
}
