package ch03.example;

public class BoxTest {
	int width;
	int height;
	int depth;
	//Ŭ���� ������ ����� �ν��Ͻ� ����.

	public static void main(String[] args) {
		int h=5;
		int w=5;
		int d=5;
		//main()�޼��� ������ ����� ���� �����̴�.
		//int d; ���� ������ �ʱ�ȭ���� ������ ������ �߻��Ѵ�.
		BoxTest box = new BoxTest();
		
		System.out.println("�ڽ��� ���Ǵ� = "+ box.calcVolume(w,h,d)+ " �Դϴ�.");
		
	}
	
	public int calcVolume(int w, int h, int d){
		width=w;
		height=h;
		depth=d;
		int vol= width*height*depth;
		// vol ������ calcVolume()�̶�� �޼��� ���� ����Ǿ����Ƿ� ���� ������.
		return vol;
	}
}
