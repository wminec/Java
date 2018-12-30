package ch15.Test;
import java.awt.*;
import java.awt.event.*;
public class MovieTest extends Frame implements ActionListener{
	TextField tMovieTitle = new TextField(30);
	Button btnTitleInsert = new Button("��ȭ ���� �߰�");
	Button btnTitleDelete = new Button("��� ����");
	List movieList = new List();
	Button btnexit = new Button("����");
	
	public MovieTest(){
		super("��ȭ ���� ���� ȭ��");
		
		movieList.setBackground(Color.green);
		Panel p = new Panel();
		p.add(new Label("��ȭ ���� �Է�"));
		p.add(tMovieTitle);
		p.add(btnTitleInsert);
		p.add(btnTitleDelete);
		
		add(BorderLayout.NORTH,p);
		add(BorderLayout.CENTER,movieList);
		add(BorderLayout.SOUTH,btnexit);
		
		setBounds(0,0,800,600);
		setVisible(true);
		movieList.addActionListener(this);
		btnTitleInsert.addActionListener(this);
		btnTitleDelete.addActionListener(this);
		btnexit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		String mTitle=null;
		if(str.equals("����")){
			System.exit(0);
		}
		if(str.equals("��ȭ ���� �߰�")){
			System.out.println("��ȭ ���� �߰��ϱ�");
			mTitle=tMovieTitle.getText().trim();
			movieList.add(mTitle);
			System.out.println(mTitle);
		}else if(str.equals("��� ����")){
			System.out.println("��� ����");
			movieList.removeAll();
		}else{
			movieList.remove(str);
		}
	}
	
	public static void main(String[] args) {
		new MovieTest();
	}

}
