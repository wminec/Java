package ch04.example;

public class MultiDictionary {

	public static void main(String[] args) {
		String[][][] dictionary=
				{
						{{"apple","���","���"},
						{"actor","���","�Ϫ��檦"},
						{"address","�ּ�","���媦����"},
						{"age","����","�Ȫ�"},
						{"advice","���","���媦����"}},
						
						{{"book","å","�۪�"},
						{"baby","�Ʊ�","�����ʪ�"},
						{"bad","���ڴ�","��몤"},
						{"ball","��","����"},
						{"banana","�ٳ���","�Ыʫ�"}},
						
						{{"cabbage","�����","����٫�"},
						{"cable","����","���󪻪�"},
						{"car","�ڵ���","�����"},
						{"candle","����","�����誦"},
						{"camera","������","�����"}}
				};
		
		
		System.out.println("������ ��� ����: "+dictionary.length);
		System.out.println("������ ��� ����: "+dictionary[0].length);
		System.out.println("������ ��� ����: "+dictionary[0][0].length);
		
		for(int i=0; i<dictionary.length;i++){
			for(int j=0; j<dictionary[i].length;j++){
				for(int k=0; k<dictionary[0][j].length;k++){
					System.out.println(dictionary[i][j][k]);
				}//end for
				System.out.println();
			}
			System.out.println();
		}//end for
		/*for(int i=0; i<dictionary.length;i++){
			for(int j=0; j<dictionary[i].length;j++){
				for(int k=0; k<dictionary[0][j].length;k++){
					System.out.println(dictionary[i][j][0]);
				}//end for
				System.out.println();
			}
			System.out.println();
		}//end for*/
		String word="camera";
		for(int i=0; i<dictionary.length;i++){
			for(int j=0; j<dictionary[i].length;j++){
				if(word.equals(dictionary[i][j][0])){
					System.out.println("����:"+dictionary[i][j][0]);
					System.out.println("�ѱ���:"+dictionary[i][j][1]);
					System.out.println("�Ϻ���:"+dictionary[i][j][2]);
					break;
				}
			}//end for
			System.out.println();
		}//end for
	}

}
