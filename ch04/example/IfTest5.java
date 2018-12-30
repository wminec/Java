package ch04.example;

public class IfTest5 {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=1;
		
		int result=b*b-4*a*c;
		
		if(result>0){
			System.out.println("방정식은 두 실근을 가집니다.");
		}
		else if(result==0){
			System.out.println("방정식은 중근을 가집니다.");
		}
		else{
			System.out.println("방정식은 두 허근을 가집니다.");
		}

	}

}
