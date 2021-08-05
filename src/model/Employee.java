package model;

import java.io.Serializable;
import java.util.Comparator;

public class Employee  implements Serializable{
	
	
	int id;
	String name;
	double Sal;
	
	public Employee()
	{
	
	}
	
	public Employee(int id, String name, double sal)
	{  
	  this.id = id; this.name = name; Sal = sal; 
	}
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	
	@Override
	public String toString() {
		return "\n id=" + id + ", name=" + name + ", Sal=" + Sal + ",";
	}

}






