package ch14.example;

public class MySingleton {
	private static MySingleton mySingleton = null;
	
	private MySingleton(){
		System.out.println("MySingleton �ν��Ͻ� ����");
	}
	
	public static MySingleton getInstance(){
		if(mySingleton==null){
			mySingleton = new MySingleton();
		}
		return mySingleton;
	}
}
