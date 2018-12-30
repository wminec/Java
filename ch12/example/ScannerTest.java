package ch12.example;
import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		int score=0;
		String str=null;
		System.out.println("exit: Ctrl+Z");
		System.out.println("문자열을 입력하세요");
		try{
			while(true){
				Scanner scanner = new Scanner(System.in);
				//score=scanner.nextInt();
				//System.out.println(score);
				str=scanner.nextLine();
				System.out.println(str);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
