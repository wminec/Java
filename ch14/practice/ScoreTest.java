package ch14.practice;
import java.util.*;
public class ScoreTest {

	public void calcScore(ArrayList<Student> sList){
		String name=null;
		int sum=0;
		int SubNum=0;
		
		for(Student s : sList){
			name=s.getName();
			sum+=s.getScore();
			SubNum++;
		}
		System.out.println(name+"�л��� ����: "+sum+", ���: "+(double)(sum)/(double)SubNum);
	}
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		
		sList.add(new Student("ȫ�浿",3,"����",80));
		sList.add(new Student("ȫ�浿",3,"����",95));
		sList.add(new Student("ȫ�浿",3,"����",87));
		
		ScoreTest st = new ScoreTest();
		
		st.calcScore(sList);
	}

}
