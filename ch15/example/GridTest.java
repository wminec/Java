package ch15.example;
import java.awt.*;
public class GridTest {
	private Frame frame;
	private Button b1,b2,b3;
	private TextField tf1,tf2,tf3;
	
	public GridTest(){
		frame = new Frame("GridLayout 예제");
		b1 = new Button("버튼 1");
		b2 = new Button("버튼 2");
		b3 = new Button("버튼 3");
		tf1 = new TextField("입력 창 1입니다.");
		tf2 = new TextField("입력 창 2입니다.");
		tf3 = new TextField("입력 창 3입니다.");
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
