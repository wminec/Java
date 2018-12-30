package ch15.example;
import java.awt.*;
public class BorderTest {
	private Frame frame;
	private Button center,west,east,north,south;
	private TextField tf1;
	public BorderTest(){
		frame = new Frame("BorderLayout ����");
		south = new Button("��ư 1");
		west = new Button("��ư 2");
		east = new Button("��ư 3");
		center = new Button("��ư 4");
		tf1=new TextField();
		tf1.setText("�Է� â�Դϴ�.");
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
