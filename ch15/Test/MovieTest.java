package ch15.Test;
import java.awt.*;
import java.awt.event.*;
public class MovieTest extends Frame implements ActionListener{
	TextField tMovieTitle = new TextField(30);
	Button btnTitleInsert = new Button("영화 제목 추가");
	Button btnTitleDelete = new Button("모두 삭제");
	List movieList = new List();
	Button btnexit = new Button("종료");
	
	public MovieTest(){
		super("영화 정보 관리 화면");
		
		movieList.setBackground(Color.green);
		Panel p = new Panel();
		p.add(new Label("영화 제목 입력"));
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
		if(str.equals("종료")){
			System.exit(0);
		}
		if(str.equals("영화 제목 추가")){
			System.out.println("영화 제목 추가하기");
			mTitle=tMovieTitle.getText().trim();
			movieList.add(mTitle);
			System.out.println(mTitle);
		}else if(str.equals("모두 삭제")){
			System.out.println("모두 삭제");
			movieList.removeAll();
		}else{
			movieList.remove(str);
		}
	}
	
	public static void main(String[] args) {
		new MovieTest();
	}

}
