package ch15.Test;
import java.awt.*;
import java.awt.event.*;
public class MouseTest {
	private Frame frame;
	private TextField tPos;
	public MouseTest(){
		frame = new Frame("마우스 좌표 표시하기");
		tPos = new TextField("좌표 표시");
	}
	
	public class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			int xPos=e.getX();
			int yPos=e.getY();
			
			String Pos="X좌표: "+xPos+", Y좌표: "+yPos;
			System.out.println(Pos);
			tPos.setText(Pos);
		}
	}
	
	public class WindowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent arg0){
			System.out.println("프로그램을 종료 합니다.");
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
