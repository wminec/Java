package ch12.practice;
import java.io.*;
public class P01 {

	public static void main(String[] args) {
		int count=1;
		String s = null;
		String scoreData="";
		File file = new File("ScoreData.txt");
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file,false));
			do{
				System.out.println(count+ "번째 점수를 입력하세요.");
				s=in.readLine();
				if(isRealNumber(s)){
					if(count!=10){
						scoreData+=s+",";
					}else{
						scoreData+=s;
					}
					count++;
				}else{
					System.out.println("숫자만 입력 가능합니다.");
				}
				
			}while(count<=10);
				out.println(scoreData);
				in.close();
				out.close();
		}catch(IOException e){
			System.out.println("IOException 출력");
		}
		System.out.println("시험점수를 파일로 출력합니다.");
	}
	public static boolean isRealNumber(String str){
		try{
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
		
	}
}
