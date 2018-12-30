package ch15.example;
import java.awt.*;
public class FlowTest {
	private Frame frame;
	private Button button1;
	private Button button2;
	private Button button3;
	
	public FlowTest(){
		frame = new Frame("Flow Layout ����");
		button1 = new Button("Ȯ��");
		button2 = new Button("����");
		button3 = new Button("�ݱ�");
	}
	public void startFrame(){
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		FlowTest flow = new FlowTest();
		flow.startFrame();
	}

}
