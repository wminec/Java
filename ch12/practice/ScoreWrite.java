package ch12.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//������ ���� ������ �Է� �޾Ƽ� ���Ͽ� �����ϴ� ����
public class ScoreWrite {
	public static void main(String[] args){
		int count=1; //�� �� �Է��ߴ����� ī��Ʈ�ϴ� ����
		String scoreData="";
		String s = null;
		
		File file = new File("ScoreData.txt");			
		try {
			BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file,false));	// true�� �߰��ϱ�	
			 						
			do{
				 System.out.println(count + " ��° ������ �Է��ϼ���" );
				s = in.readLine();
				
				if(isRealNumber(s)){  //�Է��� �����Ͱ� ���������� üũ�Ѵ�.
					if(count !=10){
						scoreData+=s+",";  //10��° �Է��� ������ �ƴϸ� ���� �ڿ� ','�� �߰��Ѵ�.
					}else{
						scoreData+=s;
					}
					count++;					
				}else{
					System.out.println("���ڸ� �Է� �����մϴ�.");
				}
				
			}while ( count <= 10) ;
			
			out.println(scoreData);  //�Է� ���� ���������� ','�� �и��� �� ���Ϸ� ����Ѵ�.
			in.close();
			out.close();
			
		} catch (IOException e) {
			System.out.println("IOException");
		}		
		
		System.out.println("���������� ���Ϸ� ����մϴ�.");
	} 		
	
	//�Է� ���� �����Ͱ� ���������� üũ�ϴ� �޼ҵ�
	public static boolean isRealNumber(String str){
		try{
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
		
	}
}


