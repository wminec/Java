package sP.week4;
import java.util.Scanner;
public class HexToBinary {

	public int[] getNumArray(String inputString){//16������ 2������ ��ȯ�� ���ڿ� �迭�� ��ȣ�� ������� �޼ҵ�
		int[] numArray = new int[inputString.length()]; //�ڸ����� �����ϱ����� �迭
		//a=97, f=102
		for(int i=0; i<inputString.length(); i++){
			if(inputString.charAt(i)>=97 && inputString.charAt(i)<=102)//���ڿ��� i��°�� ���ڰ� �ƴ� �������ϰ��
				numArray[i]=(int)inputString.charAt(i)-87;
			else//���������
				numArray[i]=Integer.parseInt(Character.toString(inputString.charAt(i)));
		}//for end
		return numArray;//���� �迭 ��ȯ
	}
	public static void main(String[] args) {
		String[] hexa2bin = {"0000","0001","0010","0011",
							"0100","0101","0110","0111",
							"1000","1001","1010","1011",
							"1100","1101","1110","1111"};
		//16������ 2������ ��ȯ�� ���� ���� ���ڿ� �迭
		String inputString;//�Է� ���� ���ڿ��� �����ϱ����� ���ڿ�
		Scanner input = new Scanner(System.in);//�Է� ��ü ����
		HexToBinary h = new HexToBinary();//�޼ҵ带 �̿��ϱ����� ��ü ����
		int[] numArray; //���� �޼ҵ忡�� ��ȯ���� ���� �迭�� ���� ���� �迭
		
		System.out.print("16���� ���ڿ��� �Է��Ͻÿ�: ");
		inputString=input.nextLine();//���ڿ� �Է�
		numArray=h.getNumArray(inputString);//�����迭 ��ȯ
		System.out.print("\""+inputString+"\"�� ���� ��������");
		for(int i=0; i<inputString.length(); i++)
			System.out.print(" "+hexa2bin[numArray[i]]);
		//�޼ҵ带 �̿��Ͽ� ��ȯ���� �����迭�� �̿��Ͽ� �´� 2�� ���ڿ� ��� 
		System.out.print("�Դϴ�.");
	}
}