package ch03.example;

public class BoxTest {
	int width;
	int height;
	int depth;
	//클래스 내에서 선언된 인스턴스 변수.

	public static void main(String[] args) {
		int h=5;
		int w=5;
		int d=5;
		//main()메서드 내에서 선언된 지역 변수이다.
		//int d; 지역 변수는 초기화하지 않으면 오류가 발생한다.
		BoxTest box = new BoxTest();
		
		System.out.println("박스의 부피는 = "+ box.calcVolume(w,h,d)+ " 입니다.");
		
	}
	
	public int calcVolume(int w, int h, int d){
		width=w;
		height=h;
		depth=d;
		int vol= width*height*depth;
		// vol 변수는 calcVolume()이라는 메서드 내에 선언되었으므로 지역 변수다.
		return vol;
	}
}
