package ch04.example;

public class CallByString {
	public void setAddress(String addr){
		addr="경기도 수원시 장안구";
	}
	
	public static void main(String[] args) {
		String address="서울시 강남구 논현동";
		
		CallByString st=new CallByString();
		System.out.println("메서드 호출 전");
		System.out.println("address= "+address);
		
		st.setAddress(address);
		
		System.out.println("메서드 호출 후");
		System.out.println("address= "+address);

		//이러한 결과가 나오므로 문자열을 전달 하려면 참조형 데이터라도 값에 의한 호출을 해야 한다.
	}

}
