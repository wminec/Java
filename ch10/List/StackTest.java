package ch10.List;
import java.util.Stack;
public class StackTest {

	public static void main(String[] args) {
		Stack s=new Stack();
		
		s.push("ȫ�浿");
		s.push("�̼���");
		s.push(new Integer(111));
		s.push(new MyStudent());
		
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}

}
