package sP.week2;
import java.util.Scanner;
public class SimpleCalc {
	public static void main(String[] args) {
		String operator;
		double num1=0,num2=0,result=0;	//입력받을 변수 선언
		
		Scanner input = new Scanner(System.in);
		System.out.print("연산자를 입력하시오: ");
		operator=input.nextLine();
		System.out.print("연산할 숫자 두개를 입력하시오: ");
		num1=input.nextDouble();
		num2=input.nextDouble();	//입력
		if(operator.charAt(0)=='+'){
			result=num1+num2;
			System.out.printf("결과값: %f", result);	//'+'일 경우
		}else if(operator.charAt(0)=='-'){
			result=num1-num2;
			System.out.printf("결과값: %f", result);	//'-'일 경우
		}else if(operator.charAt(0)=='*'){
			result=num1*num2;
			System.out.printf("결과값: %f", result);	//'*'일 경우
		}else if(operator.charAt(0)=='/'){
			if(num2!=0){
				result=num1/num2;
				System.out.printf("결과값: %f", result);
				//'/'일 경우 분모가 0인지 체크
			}else{
				System.out.println("분모가 0이 되므로 계산이 불가능 합니다.");
			}//분모가 0일 경우 에러 메시지 출력
		}
	}
}
