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

class SusikListData{//TextArea�� �� susik���� �����͸� ���� Ŭ����
	private String susikString;//susik�� ���� String
	private int susikResult;//susik�� ��� int
	
	public SusikListData(String s, int r){
		susikString=s;
		susikResult=r;
	}//������
	
	public String getSusikString() {
		return susikString;
	}//susik�� ���� String ��ȯ
	public void setSusikString(String susikString) {
		this.susikString = susikString;
	}//susik�� ���� String ����
	public int getSusikResult() {
		return susikResult;
	}//susik�� ��� int ��ȯ
	public void setSusikResult(int susikResult) {
		this.susikResult = susikResult;
	}//susik�� ��� int ����

	@Override
	public String toString() {
		return "SusikListData [susikString=" + susikString + ", susikResult=" + susikResult + "]";
	}//susikListData�� ���� ���� Ȯ�ο� �޼���
}

public class Calculator extends JFrame{
	JPanel topPanel,midPanel,bottomPanel,bottomScrollPanel,bottomBtnPanel;//�гε� ����
	JScrollPane bottomScrollPane;//��ũ�� ���� ����
	JTextArea bottomTextArea;//�ؽ�Ʈ ����� ����
	Label display,date;//���̺� ����
	JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
			btnClear,btnEqual,btnPlus,btnMinus,btnMulti,btnDivide,
			sListExportBtn,sListImportBtn,sListClearBtn;//��ư�� ����
	String susik="";//������ ���� String ����
	String result="";//������ ��� String ����
	String operator="";//������ String ����
	
	Calendar c = Calendar.getInstance();//���� ��¥�� ���� Calendar ��ü ����
	String today="";//���� ��¥�� ���� String ����
	
	ArrayList<SusikListData> storedSusikList;//SusikListData�� ���� ���� List ����
	
	public Calculator(){
		today=c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DATE);
		//���� ��¥�� ��-��-�� �� String�� �ִ´�.
		storedSusikList = new ArrayList();//List��ü ����
		
		topPanel = new JPanel();//�� �г� ��ü ����
		topPanel.setLayout(new GridLayout(2,1));//�� �г� ���̾ƿ� ����
		midPanel = new JPanel();//��� �г� ��ü ����
		midPanel.setLayout(new GridLayout(4,1));//��� �г� ���̾ƿ� ����
		bottomPanel = new JPanel(new BorderLayout());//�Ʒ� �г� ��ü ����
		bottomScrollPanel = new JPanel();//�Ʒ��� ��ũ�� �г� ��ü ����
		bottomBtnPanel = new JPanel();//�Ʒ��� ��ư���� ���� �г� ��ü ����
		bottomTextArea = new JTextArea(10,35);//�Ʒ��� �ؽ�Ʈ ����� ��ü ����
		bottomScrollPane = new JScrollPane(bottomTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//��ũ�� �гο� �ؽ�Ʈ ���� �ְ� ��ũ�ѹ� ��å ����
		sListExportBtn = new JButton("���� ����");//���� ���� ��ư ��ü ����
		sListImportBtn = new JButton("���� �ҷ�����");//���� �ҷ����� ��ü ����
		sListClearBtn = new JButton("���� ����");//���� ���� ��ü ����
		
		sListExportBtn.addActionListener(new StoreActionHandler());
		sListImportBtn.addActionListener(new StoreActionHandler());
		sListClearBtn.addActionListener(new StoreActionHandler());
		//�Ʒ� ���� ����, �ҷ�����, ���� ��ư�鿡 ������ �߰�
		
		date = new Label();//���� ��¥�� ���� ���̺� ��ü ���� 
		date.setText(today);//���� ��¥�� ���̺� ����
		date.setAlignment(Label.RIGHT);//���� ��¥ ���̺��� ���ڸ� ���������� ����
		display = new Label();//����� ������ ������ ���̺� ��ü ����
		display.setAlignment(Label.RIGHT);//���̺��� ���ڸ� ���������� ����
				
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
		//���ڵ�� ������, Ŭ���� ��ư�� ��ü ����
		
		//Listener�� �����Ѵ�.
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
		//���� ��ư�鿡 ������ �߰�
		
		btnPlus.addActionListener(new CalcActionHandler());
		btnMinus.addActionListener(new CalcActionHandler());
		btnMulti.addActionListener(new CalcActionHandler());
		btnDivide.addActionListener(new CalcActionHandler());
		btnEqual.addActionListener(new CalcActionHandler());
		btnClear.addActionListener(new CalcActionHandler());
		//�����ڿ� Ŭ���� ��ư�鿡 ������ �߰�
		
		topPanel.add(date);
		topPanel.add(display);
		//ž �гο� ���� ��¥ ���̺�� ����� ������ ��Ÿ���� ���̺� �߰� 
		
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
		//��� �гο� ���ڵ�� ������, Ŭ���� ��ư���� �߰�
		
		bottomScrollPanel.add(bottomScrollPane);
		//�Ʒ��� ��ũ�� �гο� �Ʒ��� ��ũ�� ������ �߰�
		bottomBtnPanel.add(sListExportBtn);
		bottomBtnPanel.add(sListImportBtn);
		bottomBtnPanel.add(sListClearBtn);
		//�Ʒ��� ��ư �гο� ����, �ҷ�����, Ŭ���� ��ư�� �߰�
		bottomPanel.add(bottomScrollPanel,BorderLayout.NORTH);
		bottomPanel.add(bottomBtnPanel,BorderLayout.CENTER);
		//�Ʒ��� �гο� �Ʒ��� ��ũ�� �гΰ� �Ʒ��� ��ư �г��� �߰�
		
		add(topPanel,BorderLayout.NORTH);
		add(midPanel,BorderLayout.CENTER);
		add(bottomPanel,BorderLayout.SOUTH);
		//�����ӿ� ��, ���, �Ʒ� �г��� �߰�
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x�� ������ ��� ����
		setTitle("����");
		pack();//������ ũ�� �ڵ�����
		setVisible(true);//������ ���̱�

	}

	//��꿡 ���õ� ���� ������
	private class CalcActionHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String num=e.getActionCommand();//�������� ���ڸ� ����
			JButton btn = (JButton)e.getSource();//�������� ��ư ��ü ����
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
			}//���� ���� ��ư���� �������� ��� susik String�� �ϳ��� �߰��ϰ� ��� ȭ�鿡 ���
			
			if(btn==btnPlus){//+��ư ������ ���
				susik+="+";
				operator="+";
				display.setText(susik);
			}else if(btn==btnMinus){//-��ư ������ ���
				susik+="-";
				operator="-";
				display.setText(susik);
			}else if(btn==btnMulti){//*��ư ������ ���
				susik+="*";
				operator="*";
				display.setText(susik);
			}else if(btn==btnDivide){// /��ư ������ ���
				susik+="/";
				operator="/";
				display.setText(susik);
			}else if(btn==btnClear){//Ŭ���� ��ư ������ ���
				clearString();//susik�� operator�� result String �ʱ�ȭ �޼���
				display.setText("0");
			}else if(btn==btnEqual){//=��ư ������ ���
				result=calculate(susik,operator);//result�� ��� ��� �ִ´�
				if(result=="zero divide!")//0���� ������ ���
				{
					display.setText(result);//���ȭ�鿡 �ؽ�Ʈ ���
					clearString();//�ʱ�ȭ �޼���
				}else{//0���� ������ �ʾ��� ���
					display.setText(result);//����� ���
					operator="";//operator �ʱ�ȭ
					storedSusikList.add(new SusikListData(susik, Integer.parseInt(result)));
					//������ ����� SusikListDataŬ���� ��ü�� �����ؼ� storedSusikList�� �߰�
					addString(susik, result);//�ؽ�Ʈ ���� susik�߰�
					susik=result;//����� susik�� �ֱ�
//					System.out.println(storedSusikList.get(storedSusikList.size()-1));//List ��� �ֿܼ� ���
//					System.out.println(storedSusikList.size());//List�� ���� �ֿܼ� ���
				}
			}
//			System.out.println("���� : "+susik);//������ �߰� ����� �ֿܼ� ���
		}
	}
	
	//susik ����, �ҷ�����, Ŭ���� ��ư ���� �׼� ������
	private class StoreActionHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			File file = new File("susik.txt");//susikList�� �����ϰ� �ҷ��� ���ϰ�ü ����
			if(e.getSource()==sListImportBtn){//�ҷ����� ��ư�� ������ ���
				try{
					BufferedReader in = new BufferedReader(new FileReader(file));
					//���۸��� ��ü�� ���ϸ��� ��ü�� �Ű������� ����
					String readString;//���Ͽ��� �о�� ���� �о�� String����
					String[] dividedString;//=�� �������� ������ ����� ���� String �ֱ�
					readString = in.readLine();//�� ���� �о�´�.
					while(readString!=null){//���� ���� �ƴ� ������
						dividedString=readString.split("=");//=�� �������� �о�� ���� ������
						//System.out.println("read: "+ dividedString[0]+","+dividedString[1]);//�о�� ���� �ֿܼ� ���
						storedSusikList.add(new SusikListData(dividedString[0],Integer.parseInt(dividedString[1])));
						//�о�� ���� storedSusikList�� SusikListDataŬ���� ��ü�� ���� �߰�  
						addString(dividedString[0],dividedString[1]);//�ؽ�Ʈ ���� susik �߰�
						readString = in.readLine();//�� ���� �� �д´�
					}
					clearString();//susik, result, operator�� �ʱ�ȭ 
//					susik="";
//					result="";
					display.setText("susik data restored success");//susik �ҷ����� ���� �޽��� ���
					in.close();//���� ���� �ݱ�
				}catch(IOException ie){
					display.setText("No have File!");//������ ���� ��츦 ����ó���Ѵ�
				}
			}// if end
			else if(e.getSource()==sListExportBtn){//susik ���� ��ư ������ ���
				try{
					int count=0;//List�� Index��Ȱ�� �� ����
					PrintWriter out = new PrintWriter(new FileWriter(file,false));
					//PrintWriter ��ü�� FileWriter�� �ް������� ����(������ ������ �����)
					while(count!=storedSusikList.size()){//List�� ������ ����
						out.println(storedSusikList.get(count).getSusikString()+"="+storedSusikList.get(count).getSusikResult());
						//���Ͽ� ����
						count++;//Index 1����
					}
					display.setText("susik data stored success");//susik ���� ���� �޽��� ���
					out.close();//PrintWriter �ݱ�
				}catch(IOException ie){
					ie.printStackTrace();//���ܰ� �߻��� ��� ����Stack�� �ֿܼ� ����
				}
			}// Export else if end
			else if(e.getSource()==sListClearBtn){//susikŬ���� ��ư ������ ���
				storedSusikList.removeAll(storedSusikList);//List���빰�� ���� ����
				bottomTextArea.setText(null);//�ؽ�Ʈ ����� ���빰�� ���� ����
				clearString();//susik, result, operator String �ʱ�ȭ
				display.setText("susik Clear Success");//�ؽ�Ʈ�� ����� ����
				//System.out.println(storedSusikList.size());//List ������ �ֿܼ� ���
			}// Clear else if end
		}
	}
	
	private void addString(String s, String r){
		bottomTextArea.append(s+"="+r+"\n");
		bottomTextArea.setForeground(Color.BLUE);
	}//�ؽ�Ʈ ���� susik �߰��ϴ� �޼���
	private void clearString(){
		operator="";
		susik="";
		result="";
	}//operator, susik, result String �ʱ�ȭ�ϴ� �޼���
	
	//�Է��� ���ڿ��� �����ڸ� �����ڷ� ������ ���ڷ� �и��ϰ�, ��� ����� �����ϴ� �޼���
	private String calculate(String str, String opr){
		String result=null;//��� �ʱ�ȭ
		String[] num;//���� �ΰ��� ���� String�迭
		int firstNum=0, secondNum=0;//���ڸ� ���� int ���� ����
		num=str.split("\\"+opr);//�����ڴ� Ư�� ���ڷ� �ν��ϹǷ� �ݵ�� ���ڿ� �տ� \\�� �ٿ��ߵȴ�.
		firstNum=Integer.parseInt(num[0]);//ù ��° ���� �ֱ�
		secondNum=Integer.parseInt(num[1]);//�� ��° ���� �ֱ�
		
		if(opr.equals("+")){//+�� ��� ���Ѵ�
			result=Integer.toString(firstNum+secondNum);
		}else if(opr.equals("-")){//-�� ��� ����
			result=Integer.toString(firstNum-secondNum);
		}else if(opr.equals("*")){//*�� ��� ���Ѵ�
			result=Integer.toString(firstNum*secondNum);
		}else if(opr.equals("/")){// /�� ��� �����µ�, 0���� ������ ���� �ؽ�Ʈ ���
			try{
				result=Integer.toString(firstNum/secondNum);
			}catch(ArithmeticException e){
				result="zero divide!";
			}
		}
		return result;//��� String ����
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();//���� Ŭ���� ��ü ����
	}
}