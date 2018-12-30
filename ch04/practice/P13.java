package ch04.practice;

public class P13 {

	public static void main(String[] args) {
		int num=0;
		int count=0;
		int PN=0;
		int add=0;
		int[] PNA;
		PNA=new int[10];
		
		//Math.sqrt(double) : double ∑Á∆Æ
		num=100;
		double range=Math.sqrt((double)num);
		//System.out.println(range);
		for(int i=2; i<(int)range; i++){
			for(int j=1; j<=Math.sqrt((double)i); j++){
				if(i%j==0){
					count++;
					//System.out.println("Aa"+i+", "+j);
				}
			}
			//System.out.println("Cc"+i+", "+count);
			if(count==1){
				PN=i;
				//System.out.println("B");
				while(true){
					//System.out.println("Dd"+i+", "+num);
					if(num%PN==0){
						num/=PN;
						if(add==0){
							PNA[add]=PN;
							add++;
						}
						else if(PNA[add-1]!=PN){
							PNA[add]=PN;
							add++;
						}	
					}else{
						count=0;
						break;
					}//PNA input if end
				}//while end
			}// count if end
			count=0;
			if(i==(int)range-1 && num!=1){
				PNA[add]=num;
				add++;
			}
		}//for end
		for(int i=0; i<PNA.length; i++){
			if(PNA[i]!=0){
				System.out.print(PNA[i]+" ");
			}
		}
	}

}
