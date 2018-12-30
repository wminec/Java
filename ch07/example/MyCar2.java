package ch07.example;

public class MyCar2 {
	protected int velocity;
	public MyCar2(){
		System.out.println("MyCar 생성자 호출");
	}
	
	public final void speedUp(){
		velocity++;
	}
}
