package sP.week2;
import java.util.*;
public class CharSwitch {

	public static void main(String[] args) {
		String inputChar;	//입력받을 변수 선언

		
		System.out.print("영문자 하나를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		inputChar=scan.nextLine(); //입력
		switch(inputChar){
		case "a":	case "e":	case "i":	case "o":	case "u":
			System.out.println("입력한 문자는 모음입니다.");
			break;			//a,e,i,o,u:모음
		default :
				System.out.println("입력한 문자는 자음입니다.");
				break;		//나머지는 자음 이므로 default일 경우 자음
		}
	}
}