package ch10.practice;

public class P01 {
	
	public static void calcGesu(String[] _fruit){
		int len=_fruit.length;
		String[] fruit_Name= new String[len];
		int[] gesu= new int[len];
		String name=null;
		
		for(int i=0; i<len;i++){
			name=_fruit[i];
			
			for(int j=0; j<len; j++){
				if(name.equals(fruit_Name[j])){
					gesu[j]++;
					break;
				}else if(fruit_Name[j]==null){
					fruit_Name[j]=name;
					gesu[j]++;
					break;
				}
			}
		}
		System.out.println("과일별 개수");
		System.out.println("=============");
		for(int i=0;i<len;i++){
			if(fruit_Name[i]!=null){
				System.out.println(fruit_Name[i]+ " : "
						+ ""+gesu[i]+"개");
			}
		}
	}

	public static void main(String[] args) {
		String [] fruit={"사과","바나나","귤","수박","사과","사과","귤","수박","수박","바나나",
                "귤","사과","사과","수박","귤","바나나","귤","바나나","사과","귤","귤"};
		calcGesu(fruit);
	}

}
