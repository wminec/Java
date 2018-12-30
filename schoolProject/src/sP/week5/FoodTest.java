package sP.week5;

class Food{
	protected int calory;
	protected int price;
	protected int weight;
	//칼로리, 가격, 중량 변수 선언
	public Food(){
		
	}//디폴트 생성자
	public Food(int c,int p, int w){
		calory=c;
		price=p;
		weight=w;
	}//매개변수가 3개인 생성자
	public int getCalory() {
		return calory;
	}
	public void setCalory(int c) {
		calory = c;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		price = p;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int w) {
		weight = w;
	}
	//접근자 설정자
	@Override
	public String toString() {
		return "Food [calory=" + calory + ", price=" + price + ", weight=" + weight + "]";
	}//정보 출력
}
class Melon extends Food{
	String farmName;
	//농원 정보 변수 선언
	public Melon(){
		
	}//디폴트 생성자
	public Melon(String f){
		farmName=f;
	}//매개변수가 1개인 생성자 

	public String getFarmName() {
		return farmName;
	}
	public void setFarmName(String f) {
		farmName = f;
	}//접근자 설정자
	@Override
	public String toString() {
		return "Melon [farmName=" + farmName + ", calory=" + calory + ", price=" + price + ", weight=" + weight + "]";
	}//super클래스와 sub클래스의 정보 출력
	
}
public class FoodTest {
	public static void main(String[] args) {
		Food f =new Food(100,2000,201);//food 객체 생성
		Melon m = new Melon("TestFarm");//melon 객체 생성
		System.out.println(f);
		System.out.println(m);//정보 출력
	}
}