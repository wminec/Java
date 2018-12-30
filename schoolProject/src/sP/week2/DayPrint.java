package sP.week2;
import java.util.Scanner;
public class DayPrint {

	public static void main(String[] args) {
		int year=0,month=0,day=0,total_days=0;	//입력받을 변수 선언
		
		Scanner input = new Scanner(System.in);
		System.out.print("연도를 입력하시오: ");
		year=input.nextInt();
		System.out.print("월을 입력하시오: ");
		month=input.nextInt();
		System.out.print("일을 입력하시오: ");
		day=input.nextInt();//입력
		
		total_days=(year-1900)*365;
		total_days+=(year-1900)/4;//윤년의 횟수 값을 더한다.
		if(((year%4==0)&&(year%100!=0)||(year%400==0))&& ((month==2)||(month==1)))
				total_days-=1;	//윤년 계산.
		if(month!=1){
			for(int i=1; i<month; i++){
				switch(i){
				case 1:	case 3: case 5:	case 7:
				case 8:	case 10:	case 12:
					total_days+=31;
					break;
				case 4:	case 6:	case 9:	case 11:
					total_days+=30;
					break;
				case 2:
					if((year%4==0)&&(year%100!=0)||(year %400==0))				//윤년
						total_days+=29;
					else
						total_days+=28;
					break;
				}//switch end
			}//for end
		}//if end
		total_days+=day;	
		//1월이 아닌 경우에는 입력받은 월의 앞까지의 일수를 더하고 입력받은 일수를 마저 더한다.
		//1월인 경우에는 위의 if문으로 들어가지 않고 일수를 더한다.
		switch(total_days%7){//1이면 일요일
		case 1:
			System.out.printf("%d년 %d월 %d일은 일요일입니다.",year,month,day);
			break;
		case 2:
			System.out.printf("%d년 %d월 %d일은 월요일입니다.",year,month,day);
			break;
		case 3:
			System.out.printf("%d년 %d월 %d일은 화요일입니다.",year,month,day);
			break;
		case 4:
			System.out.printf("%d년 %d월 %d일은 수요일입니다.",year,month,day);
			break;
		case 5:
			System.out.printf("%d년 %d월 %d일은 목요일입니다.",year,month,day);
			break;
		case 6:
			System.out.printf("%d년 %d월 %d일은 금요일입니다.",year,month,day);
			break;
		case 0:
			System.out.printf("%d년 %d월 %d일은 토요일입니다.",year,month,day);
			break;
		}
	}
}
