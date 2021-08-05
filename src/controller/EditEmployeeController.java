package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import db.*;
import model.Admin;
import model.Employee;
import model.HR;
import model.Salesmanager;
import view.AdminFrameEdit;
import view.EditEmployee;
import view.HRFrameEdit;
import view.RemoveFrame;
import view.SMFrame;
import view.SMFrameEdit;
import view.SuperUserFrame;

public class EditEmployeeController implements ActionListener {
	
	EditEmployee edm;
	 public EditEmployeeController(EditEmployee ed) {
		 this.edm=ed;
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		
			Employee em=null; //**************
			
		if(e.getSource()==edm.getBtSearch())
		{
			String idd=edm.getTxtId().getText();
			
			SuperUserDao edd=new SuperUserDao();
			boolean t1=isNumber(idd);
			if(idd=="" || idd.length()==0){
				JOptionPane.showMessageDialog(edm," Id Is Empty !!");

			  }
			  else if(t1){
				
				  int id=Integer.parseInt(idd);
				  try {
						em = edd.editEmp(id);  //****************
						
						} catch (ClassNotFoundException e1) {e1.printStackTrace();
					} catch (IOException e2) {
							
							e2.printStackTrace();
						}
					
			  }
			  else if(!t1)
			  {
				  JOptionPane.showMessageDialog(edm," Id Must be Number !!");

			  }	

				if( em instanceof Salesmanager)
				{
					edm.dispose();
					Salesmanager sm=(Salesmanager)em;
					new SMFrameEdit(sm); //**************
				}
				else if( em instanceof Admin)
				{
					edm.dispose();
					Admin ad=(Admin)em;
					new AdminFrameEdit(ad);
				}
				else if( em instanceof HR)
				{
					edm.dispose();
					HR hr=(HR)em;
				    new HRFrameEdit(hr);
				}
				else if(em==null)
				{
					JOptionPane.showMessageDialog(edm,"Id Not Exist !! \n Please provide valid Id");
					edm.dispose();
					new SuperUserFrame();
				}
			
		}
		if (e.getSource()==edm.getBtBack())
		{
			edm.dispose();
			new SuperUserFrame();
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
