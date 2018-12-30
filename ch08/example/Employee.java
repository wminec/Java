package ch08.example;

public class Employee {
	private String name;
	private String dept;
	private String job;
	private int salary;
	
	public Employee(String name,String dept,String job,int salary){
		this.name=name;
		this.dept=dept;
		this.job=job;
		this.salary=salary;
	}
	
	public boolean equals(Object o){
		boolean result=false;
		
		if(o instanceof Employee){
			Employee emp=(Employee)o;
			if(job.equals(emp.job) && (salary==emp.salary)){
				result=true;
			}
		}
		return result;
	}
}
