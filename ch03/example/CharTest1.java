package ch03.example;

public class CharTest1 {

	public static void main(String[] args) {
		char ch='a';	//문자 하나를 쓸 때는 ''를 이용.
		int num=97;
		
		System.out.println("ch의 값:" +ch+", 아스키코드:"+(int)ch);
		System.out.println("num의 값:"+num+", 문자:"+(char)num);
		
		System.out.println("ch+1의 값 :"+(ch+1)+", 문자."+(char)(ch+1));
		System.out.println("num+1의 값:"+(num+1)+", 문자."+(char)(num+1));
	}
}
