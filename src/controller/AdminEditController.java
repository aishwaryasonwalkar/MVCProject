package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import db.*;
import model.Admin;
import model.Salesmanager;
import view.AdminFrameEdit;
import view.EmployeeList;
import view.SMFrameEdit;
import view.SuperUserFrame;

public class AdminEditController implements ActionListener{
	 
	AdminFrameEdit rad;
	
	public AdminEditController(AdminFrameEdit ee)
	{
		this.rad=ee;
	}

	@Override
	public void actionPerformed(ActionEvent ad) { 
		 
			if(ad.getSource()==rad.getBtSubmit()){
			
			String id=rad.getTxtId().getText();
			String Name=rad.getTxtName().getText();
			String Sal=rad.getTxtSal().getText();
			String all=rad.getTxtAllowance().getText();
			
			Admin oad=new Admin();
		
			
			int idd=Integer.parseInt(id);
			oad.setId(idd);
			
			oad.setName(Name);
			
			double sall=Double.parseDouble(Sal);
			oad.setSal(sall);
			
			double alll=Double.parseDouble(all);
			oad.setAllowance(alll);
			
			
			SuperUserDao ed=new SuperUserDao();
		
			
			boolean t = false;
			try {
			
				t = ed.insertSMEdit(oad); //*************
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(t) {
			
			
			JOptionPane.showMessageDialog(rad,"Updated Successfully !!");
			rad.dispose();
			new SuperUserFrame();
		
			}
			
			
		}
			if(ad.getSource()== rad.getBtBack())
			{
				rad.dispose();
				new SuperUserFrame();
		    }
		
	}
	

}
