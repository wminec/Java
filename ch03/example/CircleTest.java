package ch03.example;

public class CircleTest {

	public static void main(String[] args) {
		int radius;
		float circum,area;
		float PI=3.141592f;
		radius=5;
		circum=2*PI*radius;
		area=PI*radius*radius;
		System.out.println("반지름이 "+radius+"인 원의 둘레:"+circum+", 면적:"+area+"입니다.");
		
		radius=10;
		circum=2*PI*radius;
		area=PI*radius*radius;
		System.out.println("반지름이 "+radius+"인 원의 둘레:"+circum+", 면적:"+area+"입니다.");
		
		short a='a';
		char b=97;
		
		System.out.println(a);
		System.out.println(b);
	}

}
