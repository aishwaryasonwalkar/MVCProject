package model;

import java.io.Serializable;

public class Salesmanager extends Employee implements Serializable
{
	double incentive;
	int target;


	public Salesmanager() {
		
	}
	public Salesmanager(int id,String n,double s,double incentive, int target) {
		
		
		super(id,n,s);
		this.incentive = incentive;
		this.target = target;

	}

	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return super.toString()+"incentive=" + incentive + ", target=" + target + "";
	}
	
	
}

