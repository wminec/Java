package ch04.example;

public class ScoreTest1 {

	public static void main(String[] args) {
		int score=89;
		//int score=189;
		int category=0;
		char credit;
		
		if((score>=0) && (score<=100)){//유효성 검사.
			category=score/10;
			System.out.println("category="+category);
			
			if(category==10 || category==9)
				credit='A';
			else if(category==8)
				credit='B';
			else if(category==7)
				credit='C';
			else if(category==6)
				credit='D';
			else
				credit='F';
			
			System.out.println("시험 점수 = " + score +"점, 학점 = "+credit);
		}else{
			System.out.println("시험 점수가 잘못 입력되었습니다.");
		}

	}

}
