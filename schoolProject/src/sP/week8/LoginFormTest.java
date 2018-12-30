package sP.week8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	JTextField emailTextField;//�ؽ�Ʈ�ʵ� ����
	JPasswordField passwordTextField;//�н������ʵ� ����
	JButton loginButton, cancelButton;//��ư ����
	String email,password;//������ ��Ʈ�� ����
	
	public MyFrame() {
		super("My Frame");//������ Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����
		
		JPanel panel = new JPanel();//�г� ��ü ����
		panel.setLayout(new GridLayout(3,2));//�г� ��ġ������ ����
		
		emailTextField = new JTextField(25);//�̸��� �ؽ�Ʈ�ʵ� ��ü ����
		emailTextField.addActionListener(this);//������ �߰�
		panel.add(new JLabel("�̸���"));//�гο� ���̺� �߰�
		panel.add(emailTextField);//�гο� �ؽ�Ʈ�ʵ� �߰�
		
		passwordTextField = new JPasswordField(25);//�н����� �н������ʵ� ��ü ����
		passwordTextField.addActionListener(this);//������ �߰�
		panel.add(new JLabel("��й�ȣ"));//�гο� ���̺� �߰�
		panel.add(passwordTextField);//�гο� �н������ʵ� �߰�
		
		loginButton = new JButton("�α���");//�α��� ��ư ��ü ����
		cancelButton = new JButton("���");//��� ��ư ��ü ����
		loginButton.addActionListener(this);//������ �߰�
		cancelButton.addActionListener(this);//������ �߰�
		panel.add(loginButton);
		panel.add(cancelButton);//�гο� ��ư �߰�
		
		add(panel, BorderLayout.NORTH);//�г� �����ӿ� �߰�
		
		pack();//������ ������ ����
		setVisible(true);//������ ���̱�
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==emailTextField)
			passwordTextField.requestFocus();//�̸��� �ʵ忡�� ���͸� ĥ �� �н����� �ʵ� ��Ŀ�� 
		else if(e.getSource()==passwordTextField)
			loginButton.requestFocus();//�н����� �ʵ忡�� ���͸� ĥ �� �α��� ��ư���� ��Ŀ��
		else if(e.getSource()==loginButton){//�α��� ��ư�� ������
			email=emailTextField.getText();//�̸��� ����
			password=passwordTextField.getText();//�н����� ����
			String text = "emailTextField ="+ email + " passwordTextField = "+password;
			
			System.out.println(text);//���� �ý��ۿ� ���
		}else if(e.getSource()==cancelButton)
			System.exit(0);//��ҹ�ư ������ ����
	}
}
public class LoginFormTest {

	public static void main(String[] args) {
		new MyFrame();
	}
}