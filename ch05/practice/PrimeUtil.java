package ch05.practice;

public class PrimeUtil{
	
	public int calcPrime(int num){
		int count=0;
		int sum=0;
		for(int i=1; i<=num;i++)
		{
			while(true){
				for(int j=1; j<=Math.sqrt((double)i);j++){
					if(i%j==0){
						count++;
					}
				}
				if(count==1){
					count=0;
					if(i!=1){
						sum+=i;
					}
					break;
				}else{
					count=0;
					break;
				}
			}
		}
		return sum;
	}
	
	public int calcPrime(int num1, int num2){
		int count=0;
		int sum=0;
		for(int i=num1; i<=num2;i++)
		{
			while(true){
				for(int j=1; j<=Math.sqrt((double)i);j++){
					if(i%j==0){
						count++;
					}
				}
				if(count==1){
					count=0;
					if(i!=1){
						sum+=i;
					}
					break;
				}else{
					count=0;
					break;
				}
			}
		}
		return sum;
	}
}
