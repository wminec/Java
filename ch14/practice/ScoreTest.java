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
		System.out.println(name+"ÇÐ»ýÀÇ ÃÑÁ¡: "+sum+", Æò±Õ: "+(double)(sum)/(double)SubNum);
	}
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<Student>();
		
		sList.add(new Student("È«±æµ¿",3,"±¹¾î",80));
		sList.add(new Student("È«±æµ¿",3,"¼öÇÐ",95));
		sList.add(new Student("È«±æµ¿",3,"¿µ¾î",87));
		
		ScoreTest st = new ScoreTest();
		
		st.calcScore(sList);
	}

}
