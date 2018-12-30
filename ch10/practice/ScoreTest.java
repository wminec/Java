package ch10.practice;

import java.util.List;
import java.util.ArrayList;

public class ScoreTest {
	public static void calcScore(List list){
		Student st = null;
		int len=list.size();
		String[] student_name = new String[len];
		int[] student_subject = new int[len];
		int[] student_point = new int[len];
		String name=null;
		int point=0;
		
		for(int i=0; i<len; i++){
			st = (Student)list.get(i);
			name=st.getName();
			point=st.getPoint();
			for(int j=0; j<len; j++){
				if(name.equals(student_name[j])){
					student_subject[j]++;
					student_point[j]+=point;
					break;
				}else if(student_name[j]==null){
					student_name[j]=name;
					student_point[j]+=point;
					student_subject[j]++;
					break;
				}
			}
		}
		for(int i=0;i<len;i++){
			if(student_name[i]!=null){
				System.out.println( "이름:" +student_name[i]+" "+
									"  총점:"+student_point[i]+ 
									"  과목수:"+student_subject[i]+
									"  평균:"+((float)student_point[i]/student_subject[i]));
			}
		}
	}

	public static void main(String[] args) {
		/*
		String []data={"홍길동,3,국어,80", //이름,학년,과목,시험점수
		               "이순신,3,국어,90",
		               "임꺽정,3,국어,78",
		               "홍길동,3,영어,76",
		               "이순신,3,영어,88",
		               "임꺽정,3,영어,56",		
		               "홍길동,3,수학,70",
		               "이순신,3,수학,67",
		               "임꺽정,3,수학,77"
					};
		 */
		List sList= new ArrayList();
		
		sList.add(new Student("홍길동",3,"국어",80));
		sList.add(new Student("이순신",3,"국어",90));
		sList.add(new Student("임꺽정",3,"국어",78));
		sList.add(new Student("홍길동",3,"영어",76));
		sList.add(new Student("임꺽정",3,"영어",56));
		sList.add(new Student("홍길동",3,"수학",70));
		sList.add(new Student("이순신",3,"수학",67));
		sList.add(new Student("임꺽정",3,"수학",77));
		
		calcScore(sList);
	}

}
