package ch15.practice;
import java.awt.*;
import java.awt.event.*;
public class P01 extends Frame implements ActionListener{
	TextField tName = new TextField();
	TextField tGrade = new TextField();
	TextField tSubject = new TextField();
	TextField tPoint = new TextField();
	List scoreList = new List();
	TextField tSum=new TextField();
	TextField tAvg=new TextField();
	Button btnInsertList = new Button("목록추가");
	Button btnCalcScore = new Button("점수계산");

	public P01(){
		super("성적 관리 화면");
		
		scoreList.setBackground(Color.green);
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(0,2));
		p1.add(new Label("이름"));
		p1.add(tName);
		p1.add(new Label("학년"));
		p1.add(tGrade);
		p1.add(new Label("과목"));
		p1.add(tSubject);
		p1.add(new Label("점수"));
		p1.add(tPoint);
		
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(1,0));
		p2.add(new Label("총점"));
		p2.add(tSum);
		p2.add(new Label("평균"));
		p2.add(tAvg);
		
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(1,0));
		p3.add(btnInsertList);
		p3.add(btnCalcScore);
		
		setLayout(new GridLayout(0,1));
		add(p1);
		add(scoreList);
		add(p2);
		add(p3);
		
		setVisible(true);
		setBounds(0,0,800,600);
		scoreList.addActionListener(this);
		btnInsertList.addActionListener(this);
		btnCalcScore.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		String str=e.getActionCommand();
		String sRes=null;
		String sName=null;
		String sGrade=null;
		String sSubject=null;
		String sPoint=null;
		if(str.equals("목록추가")){
			//새로운 클래스를 만들든지, 아니면 String에 저장해서 그냥 scoreList에 집어 넣든지 해서 출력
			sName=tName.getText().trim();
			sGrade=tGrade.getText().trim();
			sSubject=tSubject.getText().trim();
			sPoint=tPoint.getText().trim();
			sRes=sName + " "+ sGrade+" "+sSubject+" "+sPoint;
			tName.setText(null);
			tGrade.setText(null);
			tSubject.setText(null);
			tPoint.setText(null);
			scoreList.add(sRes);
			
			System.out.println("목록추가");
		}else if(str.equals("점수계산")){
			calcScore(scoreList);
			System.out.println("점수계산");
		}
	}
	public void calcScore(List sList){
		int len=sList.getRows();
		int sum=0;
		int count=0;
		int avg=0;
		String sRes="";
		String sAvg="";
		String[] point = new String[len];
		System.out.println(len);
		point=sList.getItems();
		for(String temp: point){
			String[] s = new String[4];
			s=temp.split(" ");
			sum+=Integer.parseInt(s[3]);
			count++;
		}
		avg=sum/count;
		sRes+=sum;
		sAvg+=avg;
		tSum.setText(sRes);
		tAvg.setText(sAvg);
	}
	public static void main(String[] args) {
		P01 c = new P01();
	}

}
