package term;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.*;

class SusikListData{//TextArea에 들어갈 susik들의 데이터를 넣을 클래스
	private String susikString;//susik의 과정 String
	private int susikResult;//susik의 결과 int
	
	public SusikListData(String s, int r){
		susikString=s;
		susikResult=r;
	}//생성자
	
	public String getSusikString() {
		return susikString;
	}//susik의 과정 String 반환
	public void setSusikString(String susikString) {
		this.susikString = susikString;
	}//susik의 과정 String 설정
	public int getSusikResult() {
		return susikResult;
	}//susik의 결과 int 반환
	public void setSusikResult(int susikResult) {
		this.susikResult = susikResult;
	}//susik의 결과 int 설정

	@Override
	public String toString() {
		return "SusikListData [susikString=" + susikString + ", susikResult=" + susikResult + "]";
	}//susikListData의 내부 변수 확인용 메서드
}

public class Calculator extends JFrame{
	JPanel topPanel,midPanel,bottomPanel,bottomScrollPanel,bottomBtnPanel;//패널들 정의
	JScrollPane bottomScrollPane;//스크롤 패인 정의
	JTextArea bottomTextArea;//텍스트 에어리어 정의
	Label display,date;//레이블 정의
	JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
			btnClear,btnEqual,btnPlus,btnMinus,btnMulti,btnDivide,
			sListExportBtn,sListImportBtn,sListClearBtn;//버튼들 정의
	String susik="";//수식을 넣을 String 정의
	String result="";//수식의 결과 String 정의
	String operator="";//연산자 String 정의
	
	Calendar c = Calendar.getInstance();//오늘 날짜를 넣을 Calendar 객체 정의
	String today="";//오늘 날짜를 넣을 String 정의
	
	ArrayList<SusikListData> storedSusikList;//SusikListData의 값을 넣을 List 정의
	
	public Calculator(){
		today=c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DATE);
		//오늘 날짜를 년-월-일 로 String에 넣는다.
		storedSusikList = new ArrayList();//List객체 생성
		
		topPanel = new JPanel();//위 패널 객체 생성
		topPanel.setLayout(new GridLayout(2,1));//위 패널 레이아웃 설정
		midPanel = new JPanel();//가운데 패널 객체 생성
		midPanel.setLayout(new GridLayout(4,1));//가운데 패널 레이아웃 설정
		bottomPanel = new JPanel(new BorderLayout());//아래 패널 객체 생성
		bottomScrollPanel = new JPanel();//아래의 스크롤 패널 객체 생성
		bottomBtnPanel = new JPanel();//아래의 버튼들을 넣을 패널 객체 생성
		bottomTextArea = new JTextArea(10,35);//아래의 텍스트 에어리어 객체 생성
		bottomScrollPane = new JScrollPane(bottomTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//스크롤 패널에 텍스트 에어리어를 넣고 스크롤바 정책 정의
		sListExportBtn = new JButton("수식 저장");//수식 저장 버튼 객체 생성
		sListImportBtn = new JButton("수식 불러오기");//수식 불러오기 객체 생성
		sListClearBtn = new JButton("수식 비우기");//수식 비우기 객체 생성
		
		sListExportBtn.addActionListener(new StoreActionHandler());
		sListImportBtn.addActionListener(new StoreActionHandler());
		sListClearBtn.addActionListener(new StoreActionHandler());
		//아래 수식 저장, 불러오기, 비우기 버튼들에 리스너 추가
		
		date = new Label();//오늘 날짜를 넣을 레이블 객체 생성 
		date.setText(today);//오늘 날짜를 레이블에 설정
		date.setAlignment(Label.RIGHT);//오늘 날짜 레이블의 글자를 오른쪽으로 정렬
		display = new Label();//결과나 과정을 보여줄 레이블 객체 생성
		display.setAlignment(Label.RIGHT);//레이블의 글자를 오른쪽으로 정렬
				
		btn0=new JButton("0");
		btn1=new JButton("1");
		btn2=new JButton("2");
		btn3=new JButton("3");
		btn4=new JButton("4");
		btn5=new JButton("5");
		btn6=new JButton("6");
		btn7=new JButton("7");
		btn8=new JButton("8");
		btn9=new JButton("9");
		btnClear = new JButton("C");
		btnEqual = new JButton("=");
		btnPlus = new JButton("+");
		btnMinus = new JButton("-");
		btnMulti = new JButton("*");
		btnDivide = new JButton("/");
		//숫자들과 연산자, 클리어 버튼들 객체 생성
		
		//Listener와 연결한다.
		btn0.addActionListener(new CalcActionHandler());
		btn1.addActionListener(new CalcActionHandler());
		btn2.addActionListener(new CalcActionHandler());
		btn3.addActionListener(new CalcActionHandler());
		btn4.addActionListener(new CalcActionHandler());
		btn5.addActionListener(new CalcActionHandler());
		btn6.addActionListener(new CalcActionHandler());
		btn7.addActionListener(new CalcActionHandler());
		btn8.addActionListener(new CalcActionHandler());
		btn9.addActionListener(new CalcActionHandler());
		//숫자 버튼들에 리스너 추가
		
		btnPlus.addActionListener(new CalcActionHandler());
		btnMinus.addActionListener(new CalcActionHandler());
		btnMulti.addActionListener(new CalcActionHandler());
		btnDivide.addActionListener(new CalcActionHandler());
		btnEqual.addActionListener(new CalcActionHandler());
		btnClear.addActionListener(new CalcActionHandler());
		//연산자와 클리어 버튼들에 리스너 추가
		
		topPanel.add(date);
		topPanel.add(display);
		//탑 패널에 오늘 날짜 레이블과 결과나 과정을 나타내는 레이블 추가 
		
		midPanel.add(btn1);
		midPanel.add(btn2);
		midPanel.add(btn3);
		midPanel.add(btnPlus);
		
		midPanel.add(btn4);
		midPanel.add(btn5);
		midPanel.add(btn6);
		midPanel.add(btnMinus);
		
		midPanel.add(btn7);
		midPanel.add(btn8);
		midPanel.add(btn9);
		midPanel.add(btnMulti);
		
		midPanel.add(btn0);
		midPanel.add(btnClear);
		midPanel.add(btnEqual);
		midPanel.add(btnDivide);
		//가운데 패널에 숫자들과 연산자, 클리어 버튼들을 추가
		
		bottomScrollPanel.add(bottomScrollPane);
		//아래쪽 스크롤 패널에 아래쪽 스크롤 패인을 추가
		bottomBtnPanel.add(sListExportBtn);
		bottomBtnPanel.add(sListImportBtn);
		bottomBtnPanel.add(sListClearBtn);
		//아래쪽 버튼 패널에 저장, 불러오기, 클리어 버튼들 추가
		bottomPanel.add(bottomScrollPanel,BorderLayout.NORTH);
		bottomPanel.add(bottomBtnPanel,BorderLayout.CENTER);
		//아래쪽 패널에 아래쪽 스크롤 패널과 아래쪽 버튼 패널을 추가
		
		add(topPanel,BorderLayout.NORTH);
		add(midPanel,BorderLayout.CENTER);
		add(bottomPanel,BorderLayout.SOUTH);
		//프레임에 위, 가운데, 아래 패널을 추가
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x를 눌렀을 경우 종료
		setTitle("계산기");
		pack();//프레임 크기 자동조정
		setVisible(true);//프레임 보이기

	}

	//계산에 관련된 엑션 리스너
	private class CalcActionHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String num=e.getActionCommand();//눌려지는 숫자를 저장
			JButton btn = (JButton)e.getSource();//눌려지는 버튼 객체 저장
			if(btn==btn0){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn1){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn2){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn3){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn4){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn5){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn6){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn7){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn8){
				susik+=num;
				display.setText(susik);
			}else if(btn==btn9){
				susik+=num;
				display.setText(susik);
			}//각각 숫자 버튼들이 눌러졌을 경우 susik String에 하나씩 추가하고 결과 화면에 출력
			
			if(btn==btnPlus){//+버튼 눌렀을 경우
				susik+="+";
				operator="+";
				display.setText(susik);
			}else if(btn==btnMinus){//-버튼 눌렀을 경우
				susik+="-";
				operator="-";
				display.setText(susik);
			}else if(btn==btnMulti){//*버튼 눌렀을 경우
				susik+="*";
				operator="*";
				display.setText(susik);
			}else if(btn==btnDivide){// /버튼 눌렀을 경우
				susik+="/";
				operator="/";
				display.setText(susik);
			}else if(btn==btnClear){//클리어 버튼 눌렀을 경우
				clearString();//susik과 operator와 result String 초기화 메서드
				display.setText("0");
			}else if(btn==btnEqual){//=버튼 눌렀을 경우
				result=calculate(susik,operator);//result에 계산 결과 넣는다
				if(result=="zero divide!")//0으로 나눴을 경우
				{
					display.setText(result);//결과화면에 텍스트 출력
					clearString();//초기화 메서드
				}else{//0으로 나누지 않았을 경우
					display.setText(result);//결과를 출력
					operator="";//operator 초기화
					storedSusikList.add(new SusikListData(susik, Integer.parseInt(result)));
					//과정가 결과를 SusikListData클래스 객체를 생성해서 storedSusikList에 추가
					addString(susik, result);//텍스트 에어리어에 susik추가
					susik=result;//결과를 susik에 넣기
//					System.out.println(storedSusikList.get(storedSusikList.size()-1));//List 결과 콘솔에 출력
//					System.out.println(storedSusikList.size());//List의 갯수 콘솔에 출력
				}
			}
//			System.out.println("수식 : "+susik);//수식의 중간 결과를 콘솔에 출력
		}
	}
	
	//susik 저장, 불러오기, 클리어 버튼 관련 액션 리스너
	private class StoreActionHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			File file = new File("susik.txt");//susikList를 저장하고 불러올 파일객체 생성
			if(e.getSource()==sListImportBtn){//불러오기 버튼을 눌렀을 경우
				try{
					BufferedReader in = new BufferedReader(new FileReader(file));
					//버퍼리더 객체를 파일리더 객체를 매개변수로 생성
					String readString;//파일에서 읽어올 줄을 읽어올 String정의
					String[] dividedString;//=을 기준으로 과정과 결과를 넣을 String 넣기
					readString = in.readLine();//한 줄을 읽어온다.
					while(readString!=null){//줄의 끝이 아닐 경우까지
						dividedString=readString.split("=");//=을 기준으로 읽어온 줄을 나눈다
						//System.out.println("read: "+ dividedString[0]+","+dividedString[1]);//읽어온 줄을 콘솔에 출력
						storedSusikList.add(new SusikListData(dividedString[0],Integer.parseInt(dividedString[1])));
						//읽어온 줄을 storedSusikList에 SusikListData클래스 객체를 만들어서 추가  
						addString(dividedString[0],dividedString[1]);//텍스트 에어리어에 susik 추가
						readString = in.readLine();//한 줄을 더 읽는다
					}
					clearString();//susik, result, operator를 초기화 
//					susik="";
//					result="";
					display.setText("susik data restored success");//susik 불러오기 성공 메시지 출력
					in.close();//버퍼 리더 닫기
				}catch(IOException ie){
					display.setText("No have File!");//파일이 없을 경우를 예외처리한다
				}
			}// if end
			else if(e.getSource()==sListExportBtn){//susik 저장 버튼 눌렀을 경우
				try{
					int count=0;//List의 Index역활을 할 변수
					PrintWriter out = new PrintWriter(new FileWriter(file,false));
					//PrintWriter 객체를 FileWriter를 메개변수로 생성(파일이 있으면 덮어쓴다)
					while(count!=storedSusikList.size()){//List의 끝까지 돈다
						out.println(storedSusikList.get(count).getSusikString()+"="+storedSusikList.get(count).getSusikResult());
						//파일에 쓴다
						count++;//Index 1증가
					}
					display.setText("susik data stored success");//susik 저장 성공 메시지 출력
					out.close();//PrintWriter 닫기
				}catch(IOException ie){
					ie.printStackTrace();//예외가 발생할 경우 에러Stack을 콘솔에 띄운다
				}
			}// Export else if end
			else if(e.getSource()==sListClearBtn){//susik클리어 버튼 눌렀을 경우
				storedSusikList.removeAll(storedSusikList);//List내용물을 전부 비운다
				bottomTextArea.setText(null);//텍스트 에어리어 내용물을 전부 비운다
				clearString();//susik, result, operator String 초기화
				display.setText("susik Clear Success");//텍스트를 결과에 띄운다
				//System.out.println(storedSusikList.size());//List 갯수를 콘솔에 출력
			}// Clear else if end
		}
	}
	
	private void addString(String s, String r){
		bottomTextArea.append(s+"="+r+"\n");
		bottomTextArea.setForeground(Color.BLUE);
	}//텍스트 에어리어에 susik 추가하는 메서드
	private void clearString(){
		operator="";
		susik="";
		result="";
	}//operator, susik, result String 초기화하는 메서드
	
	//입력한 문자열을 연산자를 구분자로 각각의 숫자로 분리하고, 계산 결과를 리턴하는 메서드
	private String calculate(String str, String opr){
		String result=null;//결과 초기화
		String[] num;//숫자 두개를 받을 String배열
		int firstNum=0, secondNum=0;//숫자를 넣을 int 변수 정의
		num=str.split("\\"+opr);//연산자는 특수 문자로 인식하므로 반드시 문자열 앞에 \\을 붙여야된다.
		firstNum=Integer.parseInt(num[0]);//첫 번째 숫자 넣기
		secondNum=Integer.parseInt(num[1]);//두 번째 숫자 넣기
		
		if(opr.equals("+")){//+일 경우 더한다
			result=Integer.toString(firstNum+secondNum);
		}else if(opr.equals("-")){//-일 경우 뺀다
			result=Integer.toString(firstNum-secondNum);
		}else if(opr.equals("*")){//*일 경우 곱한다
			result=Integer.toString(firstNum*secondNum);
		}else if(opr.equals("/")){// /일 경우 나누는데, 0으로 나누면 에러 텍스트 출력
			try{
				result=Integer.toString(firstNum/secondNum);
			}catch(ArithmeticException e){
				result="zero divide!";
			}
		}
		return result;//결과 String 리턴
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();//계산기 클래스 객체 생성
	}
}