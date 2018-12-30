package sP.week5_2;

public class Test1 {

	public static void main(String[] args) {
		Controllable VideoPlayer = new Controllable(){//무명클래스 정의
		public void play(){
			System.out.println("실행합니다.");
		}
		public void stop(){
			System.out.println("종료합니다.");
		}
	};
	VideoPlayer.play();//무명클래스 play메서드 실행
	VideoPlayer.stop();//무명클래스 stop메서드 실행
	}
}
