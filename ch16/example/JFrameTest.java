package ch16.example;
import java.awt.Container;
import javax.swing.*;
public class JFrameTest extends JFrame {
	public JFrameTest(){
		super("JFrame �׽�Ʈ");
		
		JButton btn1=new JButton("�߰�");
		JTextField tf1 = new JTextField("JFrame �׽�Ʈ");
		JButton btn2 = new JButton("����");
		
		Container con = getContentPane();
		con.add(tf1, "North");
		con.add(btn1,"Center");
		con.add(btn2, "South");
		
		setSize(200,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JFrameTest();
	}

}
