package ch15.Event;
import java.awt.event.*;
public class ActionHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("btn1"))
			System.out.println("��ư 1 Ŭ��");
		if(e.getActionCommand().equals("btn2"))
			System.out.println("��ư 2 Ŭ��");
		if(e.getActionCommand().equals("btn3"))
			System.out.println("��ư 3 Ŭ��");
		if(e.getActionCommand().equals("btn4"))
			System.out.println("��ư 4 Ŭ��");
		if(e.getActionCommand().equals("btn5"))
			System.out.println("��ư 5 Ŭ��");
	}
	
}
