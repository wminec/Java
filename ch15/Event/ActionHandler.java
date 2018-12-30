package ch15.Event;
import java.awt.event.*;
public class ActionHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("btn1"))
			System.out.println("버튼 1 클릭");
		if(e.getActionCommand().equals("btn2"))
			System.out.println("버튼 2 클릭");
		if(e.getActionCommand().equals("btn3"))
			System.out.println("버튼 3 클릭");
		if(e.getActionCommand().equals("btn4"))
			System.out.println("버튼 4 클릭");
		if(e.getActionCommand().equals("btn5"))
			System.out.println("버튼 5 클릭");
	}
	
}
