package sP.week5_2;

public class Test1 {

	public static void main(String[] args) {
		Controllable VideoPlayer = new Controllable(){//����Ŭ���� ����
		public void play(){
			System.out.println("�����մϴ�.");
		}
		public void stop(){
			System.out.println("�����մϴ�.");
		}
	};
	VideoPlayer.play();//����Ŭ���� play�޼��� ����
	VideoPlayer.stop();//����Ŭ���� stop�޼��� ����
	}
}
