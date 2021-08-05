package controller;

import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import db.*;
import model.Salesmanager;
import model.*;
import view.*;

public class HRController  implements ActionListener
{
     HRFrame rhr;
     
	public HRController(HRFrame hre) {
		this.rhr = hre;
	}

	@Override
	public void actionPerformed(ActionEvent hr) 
	{
		if(hr.getSource()== rhr.getBtClear())
		{
			rhr.txtId.setText(null);
			rhr.txtName.setText(null);
			rhr.txtComission.setText(null);
			rhr.txtSal.setText(null);
		}
		if(hr.getSource()==rhr.getBtSubmit())
		{
			String id=rhr.getTxtId().getText();
			String Name=rhr.getTxtName().getText();
			String Sal=rhr.getTxtSal().getText();
			String com=rhr.getTxtComission().getText();
			
			HR ohr=new HR();
			
			boolean i1=false,n1=false,s1=false;
			boolean t1=isNumber(id);
			if(id=="" || id.length()==0){
				JOptionPane.showMessageDialog(rhr," Id Is Empty !!");

			  }
			  else if(t1){
			
				  int idd=Integer.parseInt(id);
				  ohr.setId(idd);
				  i1=true;
	
			  }
			  else if(!t1)
			  {
				  JOptionPane.showMessageDialog(rhr," Id Must be Number !!");

			  }
			
			
			boolean t2=isChar(Name);
			if(Name.length()<=0 ||Name=="")
			{
				 JOptionPane.showMessageDialog(rhr," Name Is Empty !!");
			}
			else if(t2==true)
			{
				if(Character.isUpperCase(Name.charAt(0)))
				{
					ohr.setName(Name);
				 n1=true;
				}else
				{
					JOptionPane.showMessageDialog(rhr," Name Must Contain First Letter Capital");
				}
			}
			else if(t2==false)
			{
				JOptionPane.showMessageDialog(rhr," Name Must be String !!");
			}
			
			
			boolean sal=isNumber(Sal);
			if(Sal=="" || Sal.length()==0){
				JOptionPane.showMessageDialog(rhr," Salary Is Empty !!");
			  }
			  else if(sal==true){

				  double sall=Double.parseDouble(Sal);
				  ohr.setSal(sall);
				  s1=true;
			  }
			  else if(sal==false)
			  {
				  JOptionPane.showMessageDialog(rhr," Salary Must be Number !!");
			  }
			
			boolean com1=isNumber(com);
			if(com=="" || com.length()==0){
				
				JOptionPane.showMessageDialog(rhr," Commission Is Empty !!");
				
			  }
			 else if(com1==true){
				 
				  double com2=Double.parseDouble(com);
				  ohr.setCommission(com2);
				  
				  if( i1 && s1 && n1)
				  {
					SuperUserDao ed=new SuperUserDao();
					
					try {
						boolean t= ed.insertEmp(ohr);  
						 if(!t) {
								JOptionPane.showMessageDialog(rhr," Id Already Exist !!");
								rhr.dispose();
								new EmployeeList();
							}
							else
							{
								
								JOptionPane.showMessageDialog(rhr," Admin Inserted Sucessfully !!");
								rhr.dispose();
								new EmployeeList();
							}//********************
						 
					} catch (ClassNotFoundException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
					else
					{
					
						JOptionPane.showMessageDialog(rhr," Fill Proper Data !!");
					}
			  }
			  else if(com1==false)
			  {
				  JOptionPane.showMessageDialog(rhr," Comission Must be Number !!");
				 
	
			  }
			   if((id=="" || id.length()==0) && (Name.length()<=0 ||Name=="") && (Sal=="" || Sal.length()==0) &&
					   (com=="" || com.length()==0)) 
				{
				
					JOptionPane.showMessageDialog(rhr," All Fields Are Empty !!");	
				}
	
	 }
		if(hr.getSource()== rhr.getBtBack())
		{
			rhr.dispose();
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

		if(flag>0)
		{
			
			return false;
		}else
		{
			return true;
		}
		
	}
	
}