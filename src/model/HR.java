package model;

import java.io.Serializable;

public class HR extends Employee implements Serializable
{
	
	double commission;
	
	
	public HR() {
		
	}
	public HR(int id, String name, double sal, double com) {
		super(id, name, sal);
		this.commission=com;
	}

	public double getCommission() {
		return this.commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
		
	}

	@Override
	public String toString() {
		return super.toString()+ " commission=" + commission+"";
	}

	
}
	