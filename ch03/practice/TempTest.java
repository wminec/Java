package ch03.practice;

public class TempTest {

	public static void main(String[] args) {
		int num=100;
		char ch='a';
		boolean bool=false;
		
		bool=(num>ch)||((char)(num-ch)>0);
		System.out.println(bool);
		
		bool=(num>ch)&&((char)(num-ch)>0);
		System.out.println(bool);
		
		bool=(num>ch)^((char)(num-ch)>0);
		System.out.println(bool);
		//"^"는 XOR
		//ch03.example의 LogicalTest를 참조.
	}

}
