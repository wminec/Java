package ch04.example;

public class MultiArrayTest1 {

	public static void main(String[] args) {
		int [][] num;
		num=new int[4][4];
		
		for(int i=0; i<num.length;i++){
			for(int j=0; j<num.length;j++){
				if(i==0){
					num[i][j]=2;
				}else if(i==1){
					if(j!=3)
						num[i][j]=2;
					else
						num[i][j]=1;
				}else if(i==2){
					if(j==0 || j==1)
						num[i][j]=2;
					else
						num[i][j]=1;
				}else if(i==3){
					if(j==0)
						num[i][j]=2;
					else
						num[i][j]=1;
				}
			}
		}

		for(int i=0; i<num.length;i++){
			for(int j=0;j<num.length;j++){
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
