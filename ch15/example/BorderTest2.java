package ch15.example;
import java.awt.*;
public class BorderTest2 {
	private Frame frame;
	private Button center,west;
	private TextField tf1;
	public BorderTest2(){
		frame = new Frame("BorderLayout ����");
		west = new Button("��ư 1");
		center = new Button("��ư 4");
		tf1 = new TextField();
		tf1.setText("�Է� â�Դϴ�.");
	}
	public void startFrame(){
		frame.add(tf1, "North");
		frame.add(west, "West");
		frame.add(center, "Center");
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		BorderTest2 border = new BorderTest2();
		border.startFrame();
	}

}
