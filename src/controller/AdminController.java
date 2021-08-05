package controller;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import db.*;
import model.Salesmanager;
import model.*;
import view.*;

public class AdminController  implements ActionListener
{
     AdminFrame rad;
     
	public AdminController(AdminFrame ade) {
		this.rad = ade;
	}

	@Override
	public void actionPerformed(ActionEvent ad) 
	{
		if(ad.getSource()==rad.getBtClear())
		{
			rad.txtId.setText(null);
			rad.txtName.setText(null);
			rad.txtSal.setText(null);
			rad.txtAllowancee.setText(null);
		}
		if(ad.getSource()==rad.getBtSubmit())
		{
			String id=rad.getTxtId().getText();
			String Name=rad.getTxtName().getText();
			String Sal=rad.getTxtSal().getText();
			String al=rad.getTxtAllowancee().getText();
			
			Admin oad=new Admin();

			boolean i1=false,n1=false,s1=false,a1=false;
			boolean t1=isNumber(id);
			if(id=="" || id.length()==0){
				JOptionPane.showMessageDialog(rad," Id Is Empty !!");

			  }
			  else if(t1){
			
				  int idd=Integer.parseInt(id);
					oad.setId(idd);
					i1=true;

			  }
			  else if(!t1)
			  {
				  JOptionPane.showMessageDialog(rad," Id Must be Number !!");

			  }
			
			
			boolean t2=isChar(Name);
			if(Name.length()<=0 ||Name=="")
			{
				 JOptionPane.showMessageDialog(rad," Name Is Empty !!");
			}
			else if(t2==true)
			{
			
				if(Character.isUpperCase(Name.charAt(0)))
				{
				 oad.setName(Name);
				 n1=true;
				}else
				{
					JOptionPane.showMessageDialog(rad," Name Must Contain 1st Letter Capital");
				}
				 
			}
			else if(t2==false)
			{
				JOptionPane.showMessageDialog(rad," Name Must be String !!");
			}
			
			
			
			boolean sal=isNumber(Sal);
			if(Sal=="" || Sal.length()==0){
				JOptionPane.showMessageDialog(rad," Salary Is Empty !!");

			  }
			  else if(sal==true){
				 
				  
				  double sall=Double.parseDouble(Sal);
				  oad.setSal(sall);
				  s1=true;
				 
			  }
			  else if(sal==false)
			  {
				  JOptionPane.showMessageDialog(rad," Salary Must be Number !!");
				
			  }
			
			
			boolean a=isNumber(al);
			if(al=="" || al.length()==0){
				JOptionPane.showMessageDialog(rad," Allowance Is Empty !!");

			  }
			 else if(a==true){
				  
					double all=Double.parseDouble(al);
					oad.setAllowance(all);
				
					if( i1 && s1 && n1) 
					{
						
					SuperUserDao ed=new SuperUserDao();
					
					try {
						boolean t= ed.insertEmp(oad);  
						 if(!t) {
								JOptionPane.showMessageDialog(rad," Id Already Exist !!");
								rad.dispose();
								new EmployeeList();
							}
							else
							{
								
								JOptionPane.showMessageDialog(rad," Admin Inserted Sucessfully !!");
								rad.dispose();
								new EmployeeList();
							}//***********************
						 
					} catch (ClassNotFoundException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
					else
					{
						
						JOptionPane.showMessageDialog(rad,"  Fill Proper Data !!");
					}
					
			  }
			  else if(a==false)
			  {
				  JOptionPane.showMessageDialog(rad," Allowance Must be Number !!");
				

			  }
			  if((id=="" || id.length()==0) && (Name.length()<=0 ||Name=="") && (Sal=="" || Sal.length()==0) &&
					  (al=="" || al.length()==0)) 
				{
				  
					JOptionPane.showMessageDialog(rad," All Fields Are Empty!!");
					
				}
				
		
	 }
		if(ad.getSource()== rad.getBtBack())
		{
			rad.dispose();
			new EmployeeList();
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
		if(flag>0)
		{
			
			return false;
		}else
		{
			return true;
		}
		
	}
	
	public boolean isChar(String name) {
		int flag=0;
		for(int i=0;i<name.length();i++)
		{
			Boolean char1 = Character.isAlphabetic(name.charAt(i));
	         if(char1) {
	        
	         }
	         else {
	        	 flag++;
	          
	         }
		}
		//System.out.println("Flag of Name "+flag);
		if(flag>0)
		{
			
			return false;
		}else
		{
			return true;
		}
		
	}
}