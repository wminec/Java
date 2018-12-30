package ch04.example;

public class CalendarTest {

	public static void main(String[] args) {
		int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int year=0,month=0,daysOfMonth=0,firstDay=0;
		int monthDays=0;
		int totalDays;
		int daysOfWeek=0;
		
		if(args.length!=2){
			//System.out.println("[사용법] java CalenderTest 년 월");
			year=2015;
			month=5;
			//1 금   2 토
		}else{
			year=Integer.parseInt(args[0]);	//들어온 문자열을 숫자로 변환. 여기선 받는 수가 년도와 월 이니까 그것들을 숫자로 변환.
			month=Integer.parseInt(args[1]);
		}
		
		totalDays=(year*365);
		totalDays+=(year-1)/4;
		totalDays-=(year-1)/100;
		totalDays+=(year-1)/400;
		//System.out.println(totalDays);

		for(int i=1; i<month; i++){
			if(i==2){
				if(((year%4==0)&&(year%100!=0))||(year%400==0)){
					monthDays=29;
				}else{
					monthDays=28;
				}
			}else{
				monthDays=days[i-1];
			}
			
			totalDays+=monthDays;
		}//end for
		
		firstDay=totalDays%7;
		//System.out.println(firstDay); 2015년 5월의 firstDay의 값은 5(금요일).
		//0일 1월 2화 3수 4목 5금 6토
		if(month==2){
			if(((year%4==0)&&(year%100!=0))||(year%00==0)){
				daysOfMonth=29;
			}else{
				daysOfMonth=28;
			}
		}else{
			daysOfMonth=days[month-1];
		}
		
		System.out.println("        "+year+"년 "+month+"월");
		System.out.println("  일      월     화      수     목     금     토");
		System.out.println("----------------------------");
		for(int i=0;i<firstDay;i++){
			System.out.print("    ");
			daysOfWeek++;
		}//end for
		
		for(int i=1;i<=daysOfMonth; i++){
			if(i<10){
				System.out.print("  " + i + " ");
		    } else {
		     System.out.print(" " + i + " ");
			}
			daysOfWeek++;
			if(daysOfWeek%7==0){
				System.out.println();
				daysOfWeek=0;
			}
		}//end for
	}

}
