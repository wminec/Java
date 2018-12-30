package ch13.example;
import java.io.Serializable;
public class Employee implements Serializable{
	String name;
	String addr;
	String jumin;
	String phone;
	
	public Employee(String name, String addr, String jumin, String phone){
		this.name=name;
		this.addr =addr;
		this.jumin=jumin;
		this.phone=phone;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAddr(String addr){
		this.addr=addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setJumin(String jumin){
		this.jumin=jumin;
	}
	public String getJumin(){
		return jumin;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
}
