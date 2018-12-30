package ch16.example;
import javax.swing.*;
import java.awt.*;
public class JMenuTest1 extends JFrame{
	JFrame f;
	JMenuBar menuBar;
	JMenu carMenu, memberMenu, rentMenu, helpMenu;
	JMenuItem carMenu11,carMenu12,carMenu13,carMenu14;
	JMenuItem memMenu21,memMenu22,memMenu23,memMenu24;
	JMenuItem helpMenu41;
	JPanel jPanel;
	JLabel lCarName;
	JTextField tf;
	JButton searchBtn;
	
	public JMenuTest1(){
		f = new JFrame("����ī ���� �ý���");
		menuBar = new JMenuBar();
		carMenu = new JMenu("���� ����");
		memberMenu = new JMenu("ȸ������");
		rentMenu = new JMenu("�������");
		helpMenu = new JMenu("����");
	}
	
	protected void startFrame(){
		f.setJMenuBar(menuBar);
		menuBar.add(carMenu);
		
		carMenu.add(carMenu11=new JMenuItem("�������"));
		carMenu.add(carMenu12=new JMenuItem("������ȸ"));
		carMenu.addSeparator();
		carMenu.add(carMenu13=new JMenuItem("��������"));
		carMenu.add(carMenu14=new JMenuItem("��������"));
		
		menuBar.add(memberMenu);
		memberMenu.add(memMenu21=new JMenuItem("ȸ�����"));
		memberMenu.add(memMenu22=new JMenuItem("ȸ����ȸ"));
		memberMenu.addSeparator();
		memberMenu.add(memMenu23=new JMenuItem("ȸ������"));
		memberMenu.add(memMenu24=new JMenuItem("ȸ������"));
		
		menuBar.add(helpMenu);
		helpMenu.add(helpMenu41=new JMenuItem("����"));
		
		jPanel=new JPanel();
		lCarName=new JLabel("������");
		tf = new JTextField(10);
		searchBtn = new JButton("���� ��ȸ�ϱ�");
		
		jPanel.add(lCarName);
		jPanel.add(tf);
		jPanel.add(searchBtn);
		
		Container con = f.getContentPane();
		con.add(jPanel, "North");
		
		f.setLocation(200,200);
		f.setSize(800, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		JMenuTest1 test = new JMenuTest1();
		test.startFrame();
	}

}
