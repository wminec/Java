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
				System.out.println( "�̸�:" +student_name[i]+" "+
									"  ����:"+student_point[i]+ 
									"  �����:"+student_subject[i]+
									"  ���:"+((float)student_point[i]/student_subject[i]));
			}
		}
	}

	public static void main(String[] args) {
		/*
		String []data={"ȫ�浿,3,����,80", //�̸�,�г�,����,��������
		               "�̼���,3,����,90",
		               "�Ӳ���,3,����,78",
		               "ȫ�浿,3,����,76",
		               "�̼���,3,����,88",
		               "�Ӳ���,3,����,56",		
		               "ȫ�浿,3,����,70",
		               "�̼���,3,����,67",
		               "�Ӳ���,3,����,77"
					};
		 */
		List sList= new ArrayList();
		
		sList.add(new Student("ȫ�浿",3,"����",80));
		sList.add(new Student("�̼���",3,"����",90));
		sList.add(new Student("�Ӳ���",3,"����",78));
		sList.add(new Student("ȫ�浿",3,"����",76));
		sList.add(new Student("�Ӳ���",3,"����",56));
		sList.add(new Student("ȫ�浿",3,"����",70));
		sList.add(new Student("�̼���",3,"����",67));
		sList.add(new Student("�Ӳ���",3,"����",77));
		
		calcScore(sList);
	}

}
