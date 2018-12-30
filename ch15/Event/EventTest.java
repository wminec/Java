package ch15.Event;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class EventTest implements ActionListener{
	private Frame frame;
	private Button btn1,btn2,btn3,btn4,btn5;
	
	public EventTest(){
		frame = new Frame("�̺�Ʈ �ڵ鷯����");
		btn1 = new Button("btn1");
		btn2 = new Button("btn2");
		btn3 = new Button("btn3");
		btn4 = new Button("btn4");
		btn5 = new Button("btn5");
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("btn1"))
			System.out.println("��ư1 Ŭ��");
		if(e.getActionCommand().equals("btn2"))
			System.out.println("��ư2 Ŭ��");
		if(e.getActionCommand().equals("btn3"))
			System.out.println("��ư3 Ŭ��");
		if(e.getActionCommand().equals("btn4"))
			System.out.println("��ư4 Ŭ��");
		if(e.getSource()==btn5)
			System.out.println("��ư5 Ŭ��");
	}
	
	public void startFrame(){
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		
		frame.add(btn1, "North");
		frame.add(btn2, "South");
		frame.add(btn3, "West");
		frame.add(btn4, "East");
		frame.add(btn5, "Center");
		
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		EventTest border = new EventTest();
		border.startFrame();
	}

}
