package ch08.example;
import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String date="2014/05/02";
		StringTokenizer st=new StringTokenizer(date,"/");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		String date2="��� �ٳ��� ���� ����";
		StringTokenizer st2=new StringTokenizer(date2);
		
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
	}

}
