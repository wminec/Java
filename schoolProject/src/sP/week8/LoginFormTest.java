package sP.week8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	JTextField emailTextField;//텍스트필드 정의
	JPasswordField passwordTextField;//패스워드필드 정의
	JButton loginButton, cancelButton;//버튼 정의
	String email,password;//저장할 스트링 정의
	
	public MyFrame() {
		super("My Frame");//프레임 타이틀 정의
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료
		
		JPanel panel = new JPanel();//패널 객체 정의
		panel.setLayout(new GridLayout(3,2));//패널 배치관리자 설정
		
		emailTextField = new JTextField(25);//이메일 텍스트필드 객체 정의
		emailTextField.addActionListener(this);//리스너 추가
		panel.add(new JLabel("이메일"));//패널에 레이블 추가
		panel.add(emailTextField);//패널에 텍스트필드 추가
		
		passwordTextField = new JPasswordField(25);//패스워드 패스워드필드 객체 정의
		passwordTextField.addActionListener(this);//리스너 추가
		panel.add(new JLabel("비밀번호"));//패널에 레이블 추가
		panel.add(passwordTextField);//패널에 패스워드필드 추가
		
		loginButton = new JButton("로그인");//로그인 버튼 객체 정의
		cancelButton = new JButton("취소");//취소 버튼 객체 정의
		loginButton.addActionListener(this);//리스너 추가
		cancelButton.addActionListener(this);//리스너 추가
		panel.add(loginButton);
		panel.add(cancelButton);//패널에 버튼 추가
		
		add(panel, BorderLayout.NORTH);//패널 프레임에 추가
		
		pack();//프레임 사이즈 설정
		setVisible(true);//프레임 보이기
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==emailTextField)
			passwordTextField.requestFocus();//이메일 필드에서 엔터를 칠 시 패스워드 필드 포커스 
		else if(e.getSource()==passwordTextField)
			loginButton.requestFocus();//패스워드 필드에서 엔터를 칠 시 로그인 버튼으로 포커스
		else if(e.getSource()==loginButton){//로그인 버튼을 누를시
			email=emailTextField.getText();//이메일 저장
			password=passwordTextField.getText();//패스워드 저장
			String text = "emailTextField ="+ email + " passwordTextField = "+password;
			
			System.out.println(text);//정보 시스템에 출력
		}else if(e.getSource()==cancelButton)
			System.exit(0);//취소버튼 누를시 종료
	}
}
public class LoginFormTest {

	public static void main(String[] args) {
		new MyFrame();
	}
}