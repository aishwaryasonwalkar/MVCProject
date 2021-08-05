package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import db.UserDao;
import model.Admin;
import model.Employee;
import model.HR;
import model.Salesmanager;
import view.*;

public class CalSalController implements ActionListener {
	CalSalFrame csf;
	
	public CalSalController(CalSalFrame cs)
	{
		this.csf=cs;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==csf.getBtCalSal())
		{
			
			String idd=csf.getTxtId().getText();
			
			boolean t1=isNumber(idd);
			if(idd=="" || idd.length()==0){
				JOptionPane.showMessageDialog(csf," Id Is Empty !!");

			  }
			  else if(t1){
				
				  int id=Integer.parseInt(idd);
				  UserDao d=new UserDao();
					Employee Empa1=null;
					try {
						Empa1 =d.calSal(id);
						
						if(Empa1 instanceof Salesmanager)
						{
							Salesmanager s1=(Salesmanager)Empa1;
							double totalSal=s1.getSal()+s1.getIncentive();
							
							JOptionPane.showMessageDialog(csf," Id "+ id+" has Total Salary : "+totalSal);
							csf.dispose();
							new  UserFrame();
							
						}
						else if(Empa1 instanceof Admin)
						{
							Admin a1=(Admin)Empa1;
							double totalSal=a1.getSal()+a1.getAllowance();
							

							JOptionPane.showMessageDialog(csf," Id "+ id+" has Total Salary : "+totalSal);
							csf.dispose();
							new  UserFrame();
							
						}
						else if(Empa1 instanceof HR)
						{
							HR h1=(HR)Empa1;
							double totalSal=h1.getSal()+h1.getCommission();
							

							JOptionPane.showMessageDialog(csf," Id "+ id+" has Total Salary : "+totalSal);
							csf.dispose();
							new  UserFrame();
							
						}
						else
						{
							JOptionPane.showMessageDialog(csf,"Invalid Id !!!");
							csf.dispose();
							new  UserFrame();
						}
						
							
						
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

			  }
			  else if(!t1)
			  {
				  JOptionPane.showMessageDialog(csf," Id Must be Number !!");

			  }	
			
			
			
		}
		if(e.getSource()==csf.getBtBack())
		{
			csf.dispose();
			new  UserFrame();
			
		}
		
	}
	public boolean isNumber(String id) {
		int flag=0;
		for(int i=0;i<id.length();i++)
		{
			Boolean char1 = Character.isDigit(id.charAt(i));
	         if(char1) {
	        	
	        
	         }
	         else {
	        	 flag++;
	      
	         }
		}
		System.out.println("Flag of Id "+flag);
		if(flag>0)
		{
			
			return false;
		}else
		{
			return true;
		}
		
	}

}
