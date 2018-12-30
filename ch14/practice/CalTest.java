package ch14.practice;

public class CalTest {

	public static void main(String[] args) {
		int[] time = new int[5];
		int sum=1;
		
		//time[0]: 일
		//time[1]: 시간
		//time[2]: 분
		//time[3]: 초
		//time[4]: 년수
		//for(int i=0; i<400; i++){
		/*do{
			time[1]+=5;
			time[2]+=48;
			time[3]+=46;
			time[4]++;
			if(time[3]/60==1){
				time[3]%=60;
				time[2]++;
			}
			if(time[2]/60==1){
				time[2]%=60;
				time[1]++;
			}
			if(time[1]/24==1){
				time[1]%=24;
				time[0]++;
			}
			for(int t:time){
				System.out.print(t+":");
			}
			System.out.println();
			sum=time[1]+time[2]+time[3];
		}while(sum!=0);*/
		
		//System.out.println(10463/365);
		//System.out.println(10463%365);
		
		/*int temp=1;
		while((243*temp)%365!=0){
			temp++;
		}
		System.out.println(temp);*/
		int a= 30+31+30+30+30+31+30+30+31+30+30+31;
		System.out.println(a);
		
		//43200년 후에 10463일을 더한 후 0시 0분 0초가 된다.
	}

}
