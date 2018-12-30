package sP.week4;

class Box{
	private int height;	//���� ����
	private int width;	//�ʺ� ����
	private int boxHeight;	//�ڽ��� ���� ����
	private boolean empty;	//�ڽ��� ����ִ��� üũ�ϴ� ����
	
	public Box(int h, int w, int bh,boolean e){
		height=h;
		width=w;
		boxHeight=bh;
		empty=e;
	}//��� ������ �޴� ������
	public Box(){
		height=1;
		width=1;
		boxHeight=1;
		empty=true;
	}//����Ʈ ������
	public void setHeight(int h){ height=h; }
	public int getHeight(){ return height; }
	public void setWidth(int w){ width=w; }
	public int getWidth(){ return width; }
	public void setBoxHeight(int bh){ boxHeight=bh; }
	public int getBoxHeight(){ return boxHeight; }
	public void setEmpty(boolean e){ empty=e; }
	public boolean getEmpty(){ return empty; }
	public String toString(){
		if(empty)
			return "�ڽ��� ���̴�: "+height*width*boxHeight+"�̰�, ���ڴ� ������ϴ�.";
		else
			return "�ڽ��� ���̴�: "+height*width*boxHeight+"�̰�, ���ڴ� ���� �ʾҽ��ϴ�.";
	}
}
public class BoxTest {

	public static void main(String[] args) {
		Box b = new Box(2,3,4,true);
		
		System.out.println(b);
		}
}