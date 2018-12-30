package ch15.Test;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator2 {
	JFrame frame;
	JPanel buttonPanel;
	Label display;
	JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
			btnClear,btnEqual,btnPlus,btnMinus,btnMulti,btnDivide;
	String susik="";
	String result="";
	String operator="";
	
	public Calculator2(){
		frame = new JFrame("계산기");
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,1));
		display = new Label();
		display.setAlignment(Label.RIGHT);
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
		
		//Listener와 연결한다.
		btn0.addActionListener(new ActionHandler());
		btn1.addActionListener(new ActionHandler());
		btn2.addActionListener(new ActionHandler());
		btn3.addActionListener(new ActionHandler());
		btn4.addActionListener(new ActionHandler());
		btn5.addActionListener(new ActionHandler());
		btn6.addActionListener(new ActionHandler());
		btn7.addActionListener(new ActionHandler());
		btn8.addActionListener(new ActionHandler());
		btn9.addActionListener(new ActionHandler());
		
		btnPlus.addActionListener(new ActionHandler());
		btnMinus.addActionListener(new ActionHandler());
		btnMulti.addActionListener(new ActionHandler());
		btnDivide.addActionListener(new ActionHandler());
		btnEqual.addActionListener(new ActionHandler());
		btnClear.addActionListener(new ActionHandler());
		
		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		buttonPanel.add(btn3);
		buttonPanel.add(btnPlus);
		
		buttonPanel.add(btn4);
		buttonPanel.add(btn5);
		buttonPanel.add(btn6);
		buttonPanel.add(btnMinus);
		
		buttonPanel.add(btn7);
		buttonPanel.add(btn8);
		buttonPanel.add(btn9);
		buttonPanel.add(btnMulti);
		
		buttonPanel.add(btn0);
		buttonPanel.add(btnClear);
		buttonPanel.add(btnEqual);
		buttonPanel.add(btnDivide);
	}

	private class ActionHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String num=e.getActionCommand();
			JButton btn = (JButton)e.getSource();
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
			}
			if(btn==btnPlus){
				susik+="+";
				operator="+";
				display.setText(susik);
			}else if(btn==btnMinus){
				susik+="-";
				operator="-";
				display.setText(susik);
			}else if(btn==btnMulti){
				susik+="*";
				operator="*";
				display.setText(susik);
			}else if(btn==btnDivide){
				susik+="/";
				operator="/";
				display.setText(susik);
			}else if(btn==btnClear){
				operator="";
				susik="";
				display.setText("0");
			}else if(btn==btnEqual){
				result=calculate(susik,operator);
				display.setText(result);
				susik+="";
				operator="";
				susik=result;
			}
			System.out.println("수식 : "+susik);
		}
	}
	//입력한 문자열을 연산자를 구분자로 각각의 숫자로 분리하는 메서드
	private static String calculate(String str, String opr){
		String result=null;
		String[] num;
		int firstNum=0, secondNum=0;
		//num=str.split(opr);
		num=str.split("\\"+opr);//연산자는 특수 문자로 인식하므로 반드시 문자열 앞에 \\을 붙여야된다.
		firstNum=Integer.parseInt(num[0]);
		secondNum=Integer.parseInt(num[1]);
		
		if(opr.equals("+")){
			result=Integer.toString(firstNum+secondNum);
		}else if(opr.equals("-")){
			result=Integer.toString(firstNum-secondNum);
		}else if(opr.equals("*")){
			result=Integer.toString(firstNum*secondNum);
		}else if(opr.equals("/")){
			result=Integer.toString(firstNum/secondNum);
		}
		return result;
	}
	public void makeFrame(){
		frame.add(display,BorderLayout.NORTH);
		frame.add(buttonPanel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		Calculator2 c = new Calculator2();
		c.makeFrame();
	}

}
