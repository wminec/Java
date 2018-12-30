package sP.week4;

class Movie{
	private String movieName;	//영화 제목 변수
	private String producer;	//영화 감독 변수
	private String production;	//영화 제작사 변수
	
	public Movie(String m, String pd1, String pd2){
		movieName=m;
		producer=pd1;
		production=pd2;
	}//매개변수를 3개받는 생성자
	public Movie(){
		movieName=null;
		producer=null;
		production=null;
	}//디폴트 생성자
	
	public String getMovieName(){ return movieName; }
	public void setMovieName(String m){ movieName=m; }
	public String getProducer(){ return producer; }
	public void setProducer(String pd1){ producer=pd1; }
	public String getProduction(){ return production; }
	public void setProduction(String pd2){ production=pd2; }
	//접근자와 설정자
	public String toString(){
		return "영화 제목: "+movieName+", 영화 감독: "+producer+", 영화 제작사: "+production;
	}//클래스 정보 출력
}
public class MovieTest {

	public static void main(String[] args) {
		Movie m = new Movie("영화명1","감독1","제작사2");//객체 생성
		
		System.out.println(m);//정보 출력
	}
}