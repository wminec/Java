package ch16.example;
import java.awt.*;
import javax.swing.*;
public class RegCarDialog extends JDialog{
	JPanel jPanel;
	JLabel lCarName;
	JTextField tf;
	JButton regBtn;
	
	public RegCarDialog(String str){
		this.setTitle(str);
		setLayout(new FlowLayout());
		
		lCarName = new JLabel("차량명");
		tf = new JTextField("차량명을 입력하세요");
		regBtn = new JButton("등록하기");
		
		this.add(lCarName);
		this.add(tf);
		this.add(regBtn);
		
		this.setLocation(200,200);
		setSize(400,400);
		setModal(true);
		setVisible(true);
	}
}
