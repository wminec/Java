package ch09.example;

public class ScoreUtil {
	public int calcScore(int score) throws UserDefinedException{
		System.out.println("calcScore �޼��� ����");
		if(score<0 || score>100)
			throw new UserDefinedException("������ ������ �Է��ϼ���.");
		System.out.println("calcScore �޼��� ��");
		return score;
	}
}
