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
		
		lCarName = new JLabel("������");
		tf = new JTextField("�������� �Է��ϼ���");
		regBtn = new JButton("����ϱ�");
		
		this.add(lCarName);
		this.add(tf);
		this.add(regBtn);
		
		this.setLocation(200,200);
		setSize(400,400);
		setModal(true);
		setVisible(true);
	}
}
