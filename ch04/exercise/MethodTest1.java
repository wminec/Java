package ch04.exercise;

public class MethodTest1 {
	public float calcVolume(int w,int l,int h){
		float vol=0f;
		vol=w*l*h;
		return vol;
	}

	public static void main(String[] args) {
		int width=10;
		int length=15;
		int height=20;
		float volume=0f;
		
		MethodTest1 t=new MethodTest1();
		
		volume=t.calcVolume(width, length, height);
		System.out.println("ù ��° ������ü ���Ǵ� "+volume);
		
		width=12;
		length=5;
		height=51;
		volume=t.calcVolume(width, length, height);
		System.out.println("�� ��° ������ü ���Ǵ� "+volume);
		
		System.out.println("�� ��° ������ü ���Ǵ� "+t.calcVolume(35, 10, 5));
	}

}
