package ch15.example;
import java.awt.*;
public class GridTest {
	private Frame frame;
	private Button b1,b2,b3;
	private TextField tf1,tf2,tf3;
	
	public GridTest(){
		frame = new Frame("GridLayout ����");
		b1 = new Button("��ư 1");
		b2 = new Button("��ư 2");
		b3 = new Button("��ư 3");
		tf1 = new TextField("�Է� â 1�Դϴ�.");
		tf2 = new TextField("�Է� â 2�Դϴ�.");
		tf3 = new TextField("�Է� â 3�Դϴ�.");
	}
	
	public void startFrmae(){
		//frame.setLayout(new GridLayout(3,0));
		frame.setLayout(new GridLayout(2,0));
		frame.add(b1);
		frame.add(tf1);
		frame.add(b3);
		frame.add(tf2);
		frame.add(b2);
		frame.add(tf3);
		
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		GridTest g = new GridTest();
		g.startFrmae();
	}

}
