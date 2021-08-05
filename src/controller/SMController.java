package controller;

import model.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import db.*;
import view.*;


public class SMController implements ActionListener{
	
	SMFrame rsm;
	
	public SMController(SMFrame obj){
		this.rsm=obj;
	}
	@Override
	public void actionPerformed(ActionEvent sm) {
		
		if(sm.getSource()==rsm.getBtClear())
		{
			rsm.txtId.setText(null);
			rsm.txtName.setText(null);
			rsm.txtSal.setText(null);
			rsm.txtIncentive.setText(null);
			rsm.txtTarget.setText(null);
		}
		if(sm.getSource()==rsm.getBtSubmit()){
			
			String id=rsm.getTxtId().getText();
			String Name=rsm.getTxtName().getText();
			String Sal=rsm.getTxtSal().getText();
			String inc=rsm.getTxtIncentive().getText();
			String tar=rsm.getTxtTarget().getText();
			
			Salesmanager osm=new Salesmanager();

			
			boolean i1=false,n1=false,s1=false,in1=false;
			boolean t1=isNumber(id);
			if(id=="" || id.length()==0){
				JOptionPane.showMessageDialog(rsm," Id Is Empty !!");
			  }
			  else if(t1){
			
				  int idd=Integer.parseInt(id);
				  osm.setId(idd);
				  i1=true;
			  }
			  else if(!t1)
			  {
				  JOptionPane.showMessageDialog(rsm," Id Must be Number !!");

			  }
			
			
			boolean t2=isChar(Name);
			if(Name.length()<=0 ||Name=="")
			{
				 JOptionPane.showMessageDialog(rsm," Name Is Empty !!");
			}
			else if(t2==true)
			{
				if(Character.isUpperCase(Name.charAt(0)))
				{
					osm.setName(Name);
				 n1=true;
				}else
				{
					JOptionPane.showMessageDialog(rsm," Name Must Contain First Letter Capital");
				}
				 
			}
			else if(t2==false)
			{
				JOptionPane.showMessageDialog(rsm," Name Must be String !!");
			}
			
			boolean sal=isNumber(Sal);
			if(Sal=="" || Sal.length()==0){
				JOptionPane.showMessageDialog(rsm," Salary Is Empty !!");
			  }
			  else if(sal==true){
				
				  double sall=Double.parseDouble(Sal);
				  osm.setSal(sall);
				  s1=true;
			  }
			  else if(sal==false)
			  {
				  JOptionPane.showMessageDialog(rsm," Salary Must be Number !!");
			  }
			
			
			boolean in=isNumber(inc);
			if(inc=="" || inc.length()==0){
				JOptionPane.showMessageDialog(rsm," Incentive  Is Empty !!");
			  }
			  else if(in==true){
				
				  double sall=Double.parseDouble(inc);
				  osm.setIncentive(sall);
				  in1=true;
			  }
			  else if(in==false)
			  {
				  JOptionPane.showMessageDialog(rsm," Incentive Must be Number !!");
		
			  }
			
			
			boolean ta=isNumber(tar);
			
			if(tar=="" || tar.length()==0){
				JOptionPane.showMessageDialog(rsm," Target Is Empty !!");			
			  }
			else if(ta==true){
			
				  int tarr=Integer.parseInt(tar);
				  osm.setTarget(tarr);
				  
				  if( i1 && s1 && n1 && in1) 
					{
					  try {
						  SuperUserDao ed=new SuperUserDao();
						  boolean t=ed.insertEmp(osm);
						  if(!t) {
							  JOptionPane.showMessageDialog(rsm," Id Already Exist !!\n Please provide valid Id");
							  rsm.dispose();
							  new SMFrame();
						  }
						 else
						  {
							  
							JOptionPane.showMessageDialog(rsm," SalesManager Inserted Sucessfully !!");
							rsm.dispose();
							new EmployeeList();
						  }
					
						
					} catch (IOException e) {e.printStackTrace();} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				  else
				  {
					  JOptionPane.showMessageDialog(rsm," Fill Proper Data !!");
					
				  }

			  }
			  else if(ta==false)
			  {
				  JOptionPane.showMessageDialog(rsm," Target Must be Number !!");
			  }
			
			  if((id=="" || id.length()==0) && (Name.length()<=0 || Name=="") && (Sal=="" || Sal.length()==0) &&
					  (tar=="" || tar.length()==0) && (inc=="" || inc.length()==0)) 
				{
				  JOptionPane.showMessageDialog(rsm," All Fileds Are Empty !!");
				 
				}
				
		}
			if(sm.getSource()== rsm.getBtBack())
			{
				rsm.dispose();
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


