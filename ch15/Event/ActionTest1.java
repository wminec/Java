package ch15.Event;
import java.awt.*;
import java.awt.event.*;
public class ActionTest1 {
	private Frame frame;
	private Button btn1,btn2,btn3,btn4,btn5;
	
	public ActionTest1(){
		frame = new Frame("�̺�Ʈ �ڵ鷯 ����");
		btn1 = new Button("btn1");
		btn2 = new Button("btn2");
		btn3 = new Button("btn3");
		btn4 = new Button("btn4");
		btn5 = new Button("btn5");
	}
	public void startFrame(){
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("B1 Ŭ��");
			}
		});
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("B2 Ŭ��");
			}
		});
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("B3 Ŭ��");
			}
		});
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("B4 Ŭ��");
			}
		});
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("B5 Ŭ��");
			}
		});
		
		frame.add(btn1, "North");
		frame.add(btn2, "South");
		frame.add(btn3, "West");
		frame.add(btn4, "East");
		frame.add(btn5, "Center");
		
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		ActionTest1 border = new ActionTest1();
		border.startFrame();
	}

}
