package ch16.example;
import javax.swing.*;
public class JTabTest extends JFrame {
	ImageIcon icon1,tabicon;
	JButton btn1,btn2;
	JTabbedPane jp;
	JLabel jlab;
	JPanel jpan;
	JTextField tf1;
	JTextArea tArea;
	public JTabTest(){
		super("�� �׽�Ʈ");
		
		icon1=new ImageIcon("dead.png");
		jlab=new JLabel(icon1);
		tabicon=new ImageIcon("cman.png");
		
		jpan=new JPanel();
		tf1=new JTextField("�׽�Ʈ�Դϴ�");
		btn1=new JButton("����");
		jpan.add(tf1);
		jpan.add(btn1);
		tArea=new JTextArea(7,20);
		tArea.setText("������ �Է��ϼ���");
		jp=new JTabbedPane();
		
		jp.addTab("��1", jlab);
		jp.addTab("��2", new JPanel().add(tArea));
		jp.addTab("��3", tabicon,jpan,"�� ��° �Դϴ�.");
		
		add(jp);
		
		setBounds(0,0,400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTabTest();
	}

}
