package ch07.example;

public class MyTruck extends MyCar2{
	public static void main(String args[]){
		MyTruck myTruck=new MyTruck();
	}
	
	/*public void speedUp(){
		velocity+=30;
	}*/
	//MyCar2에서 speedUp메서드는 final로 지정 되어있기때문에 오버라이딩 불가.
}
