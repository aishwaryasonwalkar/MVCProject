package model;

import java.io.Serializable;

public class Admin extends Employee implements Serializable
{
	double allowance;
	
	
	 public Admin() {
		
	}

	public Admin(int id, String name, double sal, double al) 
	 {
		super(id, name, sal);
		this.allowance=al;
	}

	 public void setAllowance(double all)
	 {
		 this.allowance=all;
	 }
	 public double getAllowance()
	 {
		 return this.allowance;
	 }

	@Override
	public String toString() {
		return  super.toString()+"allowance=" + allowance + "";
	}
	 
	 
}