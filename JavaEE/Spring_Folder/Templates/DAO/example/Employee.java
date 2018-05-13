package mypack;

import java.io.Serializable;

public class Employee implements Serializable 
{  
    private String name,desig; 
    private double salary;
    
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+desig+"\t"+salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
   
}  
