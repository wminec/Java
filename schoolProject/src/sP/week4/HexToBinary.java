package sP.week4;
import java.util.Scanner;
public class HexToBinary {

	public int[] getNumArray(String inputString){//16진수를 2진수로 변환한 문자열 배열의 번호를 얻기위한 메소드
		int[] numArray = new int[inputString.length()]; //자릿수를 저장하기위한 배열
		//a=97, f=102
		for(int i=0; i<inputString.length(); i++){
			if(inputString.charAt(i)>=97 && inputString.charAt(i)<=102)//문자열의 i번째가 숫자가 아닌 영문자일경우
				numArray[i]=(int)inputString.charAt(i)-87;
			else//나머지경우
				numArray[i]=Integer.parseInt(Character.toString(inputString.charAt(i)));
		}//for end
		return numArray;//정수 배열 반환
	}
	public static void main(String[] args) {
		String[] hexa2bin = {"0000","0001","0010","0011",
							"0100","0101","0110","0111",
							"1000","1001","1010","1011",
							"1100","1101","1110","1111"};
		//16진수를 2진수로 변환한 수를 넣은 문자열 배열
		String inputString;//입력 받을 문자열을 저정하기위한 문자열
		Scanner input = new Scanner(System.in);//입력 객체 생성
		HexToBinary h = new HexToBinary();//메소드를 이용하기위해 객체 생성
		int[] numArray; //위의 메소드에서 반환받은 정수 배열을 넣을 정수 배열
		
		System.out.print("16진수 문자열을 입력하시오: ");
		inputString=input.nextLine();//문자열 입력
		numArray=h.getNumArray(inputString);//정수배열 반환
		System.out.print("\""+inputString+"\"에 대한 이진수는");
		for(int i=0; i<inputString.length(); i++)
			System.out.print(" "+hexa2bin[numArray[i]]);
		//메소드를 이용하여 반환받은 정수배열을 이용하여 맞는 2진 문자열 출력 
		System.out.print("입니다.");
	}
}