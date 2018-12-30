package ch12.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//���Ͽ��� ���� ������ �о ������ ����� ���ϴ� ����
public class ScoreRead {
	public static void main(String[] args){
		int totalScore =0;  //������ �հ踦 �����ϴ� ����
		int count=0;        //���� �� ��� ���� �����ϴ� ����
		float average=0.0f;
		
		File file = new File("ScoreData.txt"); 
		
		try {

			BufferedReader in = new BufferedReader(new FileReader(file)); 

			String s;
			s = in.readLine();
			if(  s != null) {
				System.out.println("���� ���� : " + s);
				
				//','�� �����ڷ� ������ ������ �и��Ѵ�.
				StringTokenizer st= new StringTokenizer(s,",");
				
				while(st.hasMoreTokens()){					
					totalScore +=Integer.parseInt(st.nextToken());  //�����ڷ� ������ ������ ������ ��ȯ �� ������ �����Ѵ�.
					count++;
				}
				
				//������ ����Ѵ�.
				 System.out.println("���� : " +totalScore);
				 System.out.println("���� �� ��� : " +count+" ��");
				//����� ����Ѵ�.
				
				average= (float)totalScore /count;
				
				System.out.println("���� ��� :" +  average);
				
			}
			
			
			in.close();
			
		} catch(FileNotFoundException e1) {
			System.out.println("File not found");
		} catch(Exception e) {
			e.printStackTrace();
		}	
				
		
	}
}
