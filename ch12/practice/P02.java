package ch12.practice;
import java.io.*;
public class P02 {

	public static void main(String[] args) {
		File file = new File("ScoreData.txt");
		String[] score = null;
		int sum=0;
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s=in.readLine();
			score=s.split(",");
			for(int i=0; i<score.length; i++){
				sum+=Integer.parseInt(score[i]);
			}
			System.out.println("�л����� �������� ��� : "+sum/score.length);
			System.out.println("�л����� �������� ���� : "+sum);
			
			in.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
