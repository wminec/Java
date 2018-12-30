package ch15.Test;
import java.awt.*;
import java.awt.event.*;
public class MouseTest {
	private Frame frame;
	private TextField tPos;
	public MouseTest(){
		frame = new Frame("¸¶¿ì½º ÁÂÇ¥ Ç¥½ÃÇÏ±â");
		tPos = new TextField("ÁÂÇ¥ Ç¥½Ã");
	}
	
	public class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			int xPos=e.getX();
			int yPos=e.getY();
			
			String Pos="XÁÂÇ¥: "+xPos+", YÁÂÇ¥: "+yPos;
			System.out.println(Pos);
			tPos.setText(Pos);
		}
	}
	
	public class WindowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent arg0){
			System.out.println("ÇÁ·Î±×·¥À» Á¾·á ÇÕ´Ï´Ù.");
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
