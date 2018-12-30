package ch06.example;

public class Research1 extends Employee1{
	private String position;
	
	public Research1(String name, String position){
		super.name=name;
		this.position=position;
	}
	
	public String getPosition(){
		return position;
	}
	
	public void setPosition(String Position){
		this.position=position;
	}
}
