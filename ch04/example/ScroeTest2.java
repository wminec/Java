package ch04.example;

public class ScroeTest2 {

	public static void main(String[] args) {
		int score=79;
		int category=0;
		char credit;
		
		if((score>=0) && (score<=100)){
			category=score/10;
			System.out.println("category="+category);
			switch(category){
			case 10:
				credit='A';
				break;
			case 9:
				credit='A';
				break;
			case 8:
				credit='B';
				break;
			case 7:
				credit='C';
				break;
			case 6:
				credit='D';
				break;
			default:
				credit='F';
			}
			System.out.println("시험 점수 = "+score+"점, 학점 = "+credit);
		}else{
			System.out.println("시험 점수가 잘못 입력되었습니다.");
		}
	}

}
