package ch16.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class JMenuTest2 extends JFrame{
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
	
	public JMenuTest2(){
		f = new JFrame("����ī ���� �ý���");
		menuBar = new JMenuBar();
		
		carMenu = new JMenu("���� ����");
		memberMenu = new JMenu("ȸ������");
		helpMenu = new JMenu("����");
	}
	
	protected void startFrame(){
		f.setJMenuBar(menuBar); //Frame�� �޴��ٸ� �ܴ�
		menuBar.add(carMenu); //�޴��ٿ� "����" �׸��� �ܴ�
		carMenu.add(carMenu11= new JMenuItem("�������"));
		carMenu.add(carMenu12= new JMenuItem("������ȸ"));
		carMenu.addSeparator();
		carMenu.add(carMenu13= new JMenuItem("��������"));
		carMenu.add(carMenu14= new JMenuItem("��������"));
		
		menuBar.add(memberMenu); //�޴��ٿ� "ȸ������" �׸��� �ܴ�
		memberMenu.add(memMenu21= new JMenuItem("ȸ�����"));
		memberMenu.add(memMenu22= new JMenuItem("ȸ����ȸ"));
		memberMenu.add(memMenu23= new JMenuItem("ȸ������"));
		memberMenu.add(memMenu24= new JMenuItem("ȸ������"));
		
		menuBar.add(helpMenu);
		helpMenu.add(helpMenu41 = new JMenuItem("����"));
		
		jPanel=new JPanel();
		lCarName=new JLabel("������");
		tf = new JTextField(10);
		searchBtn = new JButton("���� ��ȸ�ϱ�");
		
		jPanel.add(lCarName);
		jPanel.add(tf);
		jPanel.add(searchBtn);
		
		Container con = f.getContentPane();
		con.add(jPanel, "North");
		
		f.setLocation(200,100);
		f.setSize(800, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		carMenu11.addActionListener(new CarHandler());
		carMenu12.addActionListener(new CarHandler());
		carMenu13.addActionListener(new CarHandler());
		carMenu14.addActionListener(new CarHandler());
		
		memMenu21.addActionListener(new MemberHandler());
		memMenu22.addActionListener(new MemberHandler());
		memMenu23.addActionListener(new MemberHandler());
		memMenu24.addActionListener(new MemberHandler());
		
		helpMenu41.addActionListener(new HelpHandler());
	}
	
	private class CarHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			if(e.getSource()==carMenu11){
				new RegCarDialog("������� â");
			}
		}
	}
	
	private class MemberHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	private class HelpHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			version();
		}
	}
	
	private void version(){
		final JDialog d= new JDialog(this,"��������");
		JLabel jbver = new JLabel("����1.0");
		JLabel jbdate = new JLabel("2015.03.11");
		JLabel jbauthor = new JLabel("���� : idea java");
		
		d.setLayout(new FlowLayout());
		d.add(jbver);
		d.add(jbdate);
		d.add(jbauthor);
		
		d.setLocation(250,230);
		d.setSize(200, 100);
		d.setVisible(true);
		
		d.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				d.dispose();
				d.setVisible(false);
			}
		});
	}

	public static void main(String[] args) {
		JMenuTest2 test = new JMenuTest2();
		test.startFrame();
	}

}
