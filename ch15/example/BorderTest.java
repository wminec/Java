package ch15.example;
import java.awt.*;
public class BorderTest {
	private Frame frame;
	private Button center,west,east,north,south;
	private TextField tf1;
	public BorderTest(){
		frame = new Frame("BorderLayout 예제");
		south = new Button("버튼 1");
		west = new Button("버튼 2");
		east = new Button("버튼 3");
		center = new Button("버튼 4");
		tf1=new TextField();
		tf1.setText("입력 창입니다.");
	}
	public void startFrame(){
		frame.add(tf1,"North");
		frame.add(south,"South");
		frame.add(west,"West");
		frame.add(east,"East");
		frame.add(center,"Center");
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest border = new BorderTest();
		border.startFrame();
	}

}
