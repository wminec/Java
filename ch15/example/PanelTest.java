package ch15.example;
import java.awt.*;
public class PanelTest {

	private Frame f;
	private Panel p;
	private Button ok, cancel;
	private TextField tf1;
	
	public PanelTest(){
		f = new Frame("Panel 예제");
		ok = new Button("전송");
		cancel = new Button("삭제");
		tf1 = new TextField("입력 창입니다.");
		p = new Panel();
	}
	public void startFrame(){
		f.add(tf1,BorderLayout.NORTH);
		//f.add(bc,"Center");
		p.setBackground(Color.green);
		p.add(ok);
		p.add(cancel);
		f.add(p, BorderLayout.CENTER);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		PanelTest g = new PanelTest();
		g.startFrame();
	}

}
