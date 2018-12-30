package ch12.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Strike {
	static int com_val[]=new int[3]; //��ǻ�Ͱ� ������ ������ �����ϴ� �迭
	public static void main(String[] args) {
		boolean result=false;
		int try_count=1; //����Ƚ��
		com_val=init();
		for(int i=0; i<3; i++){
			System.out.println("��ǻ�Ͱ� : "+com_val[i]);
		}
		
		System.out.println("====== BaseBall Game~!! ======");
		System.out.println("�� 10 ���� ��ȸ �� "+try_count+"ȸ ����");
		System.out.println("�� ���� �����Ͽ� �Է��ϼ���. \n��) 123");
		System.out.print("���� �Է�: ");
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String s;
			s=in.readLine();
			while(s!=null){
				System.out.println("�Է°� : "+s);
				result=compare(s);
				if(result==true){
					System.out.println("�����Դϴ�.");
					break;
				}else{
					try_count++;
					if(try_count>=10){
						System.out.println("���� �����Դϴ�. \n�ٽ� ����(Y), ����(N)");
						System.exit(1);
					}
					System.out.println("�� 10 ���� ��ȸ �� "+try_count+"ȸ ����");
					System.out.println("�� ���� �����Ͽ� �Է��ϼ���. \n��) 123");
					System.out.print("���� �Է�: ");
					s=in.readLine();
				}
			}
			in.close();
		}catch(IOException e){
			System.out.println("IOException");
		}
	}
	
	//���α׷� ���� �� ��ǻ���� �� ī��Ʈ�� �����ϴ� �޼���
	private static int[] init(){
		int [] val=new int[3];
		int num;
		int count=0;
		Label1:
			while(count<3){
				num=(int)(Math.random()*1000)%9+1; //1~9 ������ �ڿ����� ���Ѵ�.
				for(int i=0; i<3;i++){
					if(num==val[i]) //�ߺ� ������ �ʵ��� �˻�
						continue Label1;
				}
				val[count]=num;
				count++;
				num=0;
			}
		return val;
	}
	
	//��ǻ���� �� ī��Ʈ�� ����ڰ� �Է��� �� ī��Ʈ�� ���ϴ� �޼���
	private static boolean compare(String str){
		int ball=0, strike=0; //�� ī��Ʈ
		boolean result=false;
		int num=0;
		char ch=0;
		for(int i=0; i<3; i++){
			ch=str.charAt(i);
			num=Integer.parseInt(Character.toString(ch));
			for(int j=0; j<3; j++){
				if(num==com_val[j] && i!=j)
					ball++;
			}
		}
		for(int i=0; i<3; i++){
			ch= str.charAt(i);
			num=Integer.parseInt(Character.toString(ch));
			if(num==com_val[i])
				strike++;
		}
		
		//�� ���ڸ� �� ���߾��� ���
		if(strike==3)
			result=true;
		displayCount(ball,strike);
		return result;
	}

	private static void displayCount(int ball,int strike){
		if(ball==0){
			switch(strike){
			case 0:
				System.out.println("0 ball, 0 strike");
				break;
			case 1:
				System.out.println("0 ball, 1 strike");
				break;
			case 2:
				System.out.println("0 ball, 2 strike");
				break;
			case 3:
				System.out.println("0 ball, 3 strike");
				break;
			}
		}else if(ball==1){
			switch(strike){
			case 0:
			System.out.println("1 ball, 0 strike");
				break;
			case 1:
				System.out.println("1 ball, 1 strike");
				break;
			case 2:
				System.out.println("1 ball, 2 strike");
				break;
			}
		}else if(ball==2){
			switch(strike){
			case 0:
				System.out.println("2 ball, 0 strike");
				break;
			case 1:
				System.out.println("2 ball, 1 strike");
				break;
			}
		}else if(ball==3){
			switch(strike){
			case 0:
				System.out.println("3 ball");
				break;
			}
		}
	}
}
