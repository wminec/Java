package ch09.example;

public class ScoreTest {

	public static void main(String[] args) {
		//int score=89;
		int score=120;
		ScoreUtil t=new ScoreUtil();
		try{
			score=t.calcScore(score);
			System.out.println("�Է��� ���������� "+score+"�Դϴ�.");
		}catch(UserDefinedException e){
			e.printStackTrace();
			System.out.println(e.getUserExceptionInfo());
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("������ �κ�");
	}

}
