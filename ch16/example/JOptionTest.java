package ch16.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JOptionTest extends JFrame implements ActionListener {
	JButton btn1,btn2,btn3,btn4;
	String[] str={"ī�����","������ü"};
	
	public JOptionTest(){
		super("�˾�â �׽�Ʈ");
		setLayout(new FlowLayout());
		btn1=new JButton("�޽��� ���̾�α�");
		btn2=new JButton("���� ���̾�α�");
		btn3=new JButton("�Է� ���̾�α�");
		btn4=new JButton("�ɼ� ���̾�α�");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		
		pack();
		setLocation(300,300);
		setVisible(true);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn1){
			JOptionPane.showMessageDialog(this, "�޽��� ���̾�α� �ڽ�","�޽���",JOptionPane.INFORMATION_MESSAGE);
		}else if(e.getSource()==btn2){
			JOptionPane.showMessageDialog(this, "Ȯ�� ���̾�α� �ڽ�","Ȯ��",JOptionPane.YES_NO_CANCEL_OPTION);
		}else if(e.getSource()==btn3){
			String answer=JOptionPane.showInputDialog(this,"�Է� ���̾�α� �ڽ�","�Է�",JOptionPane.YES_NO_OPTION);
			System.out.println("�Է��� ����: "+answer);
		}else if(e.getSource()==btn4){
			JOptionPane.showOptionDialog(this, "�ɼ� ���̾�α� �ڽ�", 
					"�ɼ�", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
					null, 
					str, 
					str[0]);
		}
	}
	public static void main(String[] args) {
		new JOptionTest();
	}

}
