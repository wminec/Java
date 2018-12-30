package sP.week5;

class Food{
	protected int calory;
	protected int price;
	protected int weight;
	//Į�θ�, ����, �߷� ���� ����
	public Food(){
		
	}//����Ʈ ������
	public Food(int c,int p, int w){
		calory=c;
		price=p;
		weight=w;
	}//�Ű������� 3���� ������
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
	//������ ������
	@Override
	public String toString() {
		return "Food [calory=" + calory + ", price=" + price + ", weight=" + weight + "]";
	}//���� ���
}
class Melon extends Food{
	String farmName;
	//��� ���� ���� ����
	public Melon(){
		
	}//����Ʈ ������
	public Melon(String f){
		farmName=f;
	}//�Ű������� 1���� ������ 

	public String getFarmName() {
		return farmName;
	}
	public void setFarmName(String f) {
		farmName = f;
	}//������ ������
	@Override
	public String toString() {
		return "Melon [farmName=" + farmName + ", calory=" + calory + ", price=" + price + ", weight=" + weight + "]";
	}//superŬ������ subŬ������ ���� ���
	
}
public class FoodTest {
	public static void main(String[] args) {
		Food f =new Food(100,2000,201);//food ��ü ����
		Melon m = new Melon("TestFarm");//melon ��ü ����
		System.out.println(f);
		System.out.println(m);//���� ���
	}
}