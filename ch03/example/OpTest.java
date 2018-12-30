package ch03.example;

public class OpTest {
	public static void main(String[] args)
	{
		int x=10;
		int y=11;
		int z=11;
		
		System.out.println("x>y의 비교결과 :"+(x>y));
		System.out.println("x<y의 비교결과 :"+(x<y));
		System.out.println("x<20의 비교결과 :"+(x<20));
		
		System.out.println("x==y의 비교결과 :"+(x==y));
		System.out.println("x==10의 비교결과 :"+(x==10));
		System.out.println("x==z의 비교결과 :"+(x==z));
		
		System.out.println("x!=y의 비교결과 :"+(x!=y));
		System.out.println("x!=13의 비교결과 :"+(x!=13));
		
		System.out.println("x<=y의 비교결과 :"+(x<=y));
		System.out.println("x>=y의 비교결과 :"+(x>=y));
	}
}
