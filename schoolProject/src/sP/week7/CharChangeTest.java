package sP.week7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CharChange extends JPanel{

	public CharChange(){
		JLabel label = new JLabel("Don't Cry before you are hurt");//레이블 정의
		label.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,50));//레이블 정보 설정
		add(label);//패널에 레이블 설정
		label.addMouseListener(new MouseListener(){//무명 클래스로 마우스 리스너 구현
			@Override
			public void mouseClicked(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setText("다치기도 전에 울지말라");//마우스가 들어오면 이벤트 발생
			}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
		});
	}
}
public class CharChangeTest extends JFrame{
	public CharChangeTest(){
		setSize(700,150);//프레임 사이즈 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x를 누르면 종료
		setTitle("CharChangeTest");//프레임 제목 설정
		add(new CharChange());//프레임에 패널 추가
		setVisible(true);//프레임 보이기
	}
	public static void main(String[] args) {
		new CharChangeTest();//프레임 객체 정의
	}
}