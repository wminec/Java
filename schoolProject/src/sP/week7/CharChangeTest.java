package sP.week7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CharChange extends JPanel{

	public CharChange(){
		JLabel label = new JLabel("Don't Cry before you are hurt");//���̺� ����
		label.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,50));//���̺� ���� ����
		add(label);//�гο� ���̺� ����
		label.addMouseListener(new MouseListener(){//���� Ŭ������ ���콺 ������ ����
			@Override
			public void mouseClicked(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setText("��ġ�⵵ ���� ��������");//���콺�� ������ �̺�Ʈ �߻�
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
		setSize(700,150);//������ ������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x�� ������ ����
		setTitle("CharChangeTest");//������ ���� ����
		add(new CharChange());//�����ӿ� �г� �߰�
		setVisible(true);//������ ���̱�
	}
	public static void main(String[] args) {
		new CharChangeTest();//������ ��ü ����
	}
}