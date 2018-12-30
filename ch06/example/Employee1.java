package ch06.example;

public class Employee1 {
	protected String name;
	protected String job;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getJob(){
		return job;
	}
	public void setJob(String job){
		this.job=job;
	}
	
	public void getEmpInfo(Employee1 e){
		if(e instanceof Account1){
			System.out.println("직급: "+e.getJob());
		}else if(e instanceof Research1){
			Research1 res=(Research1)e;
			System.out.println("직책: "+res.getPosition());
		}
	}
}
