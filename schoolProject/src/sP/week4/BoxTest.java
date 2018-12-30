package sP.week4;

class Box{
	private int height;	//높이 변수
	private int width;	//너비 변수
	private int boxHeight;	//박스의 높이 변수
	private boolean empty;	//박스가 비어있는지 체크하는 변수
	
	public Box(int h, int w, int bh,boolean e){
		height=h;
		width=w;
		boxHeight=bh;
		empty=e;
	}//모든 변수를 받는 생성자
	public Box(){
		height=1;
		width=1;
		boxHeight=1;
		empty=true;
	}//디폴트 생성자
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
			return "박스의 넓이는: "+height*width*boxHeight+"이고, 상자는 비었습니다.";
		else
			return "박스의 넓이는: "+height*width*boxHeight+"이고, 상자는 비지 않았습니다.";
	}
}
public class BoxTest {

	public static void main(String[] args) {
		Box b = new Box(2,3,4,true);
		
		System.out.println(b);
		}
}