package sP.week2;
import java.util.Scanner;
public class DayPrint {

	public static void main(String[] args) {
		int year=0,month=0,day=0,total_days=0;	//�Է¹��� ���� ����
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		year=input.nextInt();
		System.out.print("���� �Է��Ͻÿ�: ");
		month=input.nextInt();
		System.out.print("���� �Է��Ͻÿ�: ");
		day=input.nextInt();//�Է�
		
		total_days=(year-1900)*365;
		total_days+=(year-1900)/4;//������ Ƚ�� ���� ���Ѵ�.
		if(((year%4==0)&&(year%100!=0)||(year%400==0))&& ((month==2)||(month==1)))
				total_days-=1;	//���� ���.
		if(month!=1){
			for(int i=1; i<month; i++){
				switch(i){
				case 1:	case 3: case 5:	case 7:
				case 8:	case 10:	case 12:
					total_days+=31;
					break;
				case 4:	case 6:	case 9:	case 11:
					total_days+=30;
					break;
				case 2:
					if((year%4==0)&&(year%100!=0)||(year %400==0))				//����
						total_days+=29;
					else
						total_days+=28;
					break;
				}//switch end
			}//for end
		}//if end
		total_days+=day;	
		//1���� �ƴ� ��쿡�� �Է¹��� ���� �ձ����� �ϼ��� ���ϰ� �Է¹��� �ϼ��� ���� ���Ѵ�.
		//1���� ��쿡�� ���� if������ ���� �ʰ� �ϼ��� ���Ѵ�.
		switch(total_days%7){//1�̸� �Ͽ���
		case 1:
			System.out.printf("%d�� %d�� %d���� �Ͽ����Դϴ�.",year,month,day);
			break;
		case 2:
			System.out.printf("%d�� %d�� %d���� �������Դϴ�.",year,month,day);
			break;
		case 3:
			System.out.printf("%d�� %d�� %d���� ȭ�����Դϴ�.",year,month,day);
			break;
		case 4:
			System.out.printf("%d�� %d�� %d���� �������Դϴ�.",year,month,day);
			break;
		case 5:
			System.out.printf("%d�� %d�� %d���� ������Դϴ�.",year,month,day);
			break;
		case 6:
			System.out.printf("%d�� %d�� %d���� �ݿ����Դϴ�.",year,month,day);
			break;
		case 0:
			System.out.printf("%d�� %d�� %d���� ������Դϴ�.",year,month,day);
			break;
		}
	}
}
