package ch15.Test;
import java.awt.*;
import java.awt.event.*;
public class MouseTest {
	private Frame frame;
	private TextField tPos;
	public MouseTest(){
		frame = new Frame("���콺 ��ǥ ǥ���ϱ�");
		tPos = new TextField("��ǥ ǥ��");
	}
	
	public class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			int xPos=e.getX();
			int yPos=e.getY();
			
			String Pos="X��ǥ: "+xPos+", Y��ǥ: "+yPos;
			System.out.println(Pos);
			tPos.setText(Pos);
		}
	}
	
	public class WindowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent arg0){
			System.out.println("���α׷��� ���� �մϴ�.");
			System.exit(0);
		}
	}
	
	public void startFrame(){
		frame.addMouseListener(new MouseHandler());
		frame.addWindowListener(new WindowHandler());
		frame.add(tPos, "North");
		frame.setSize(400, 500);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		MouseTest border = new MouseTest();
		border.startFrame();
	}

}
