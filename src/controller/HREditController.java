package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import db.*;
import model.HR;
import model.Salesmanager;
import view.EmployeeList;
import view.HRFrameEdit;
import view.SMFrameEdit;
import view.SuperUserFrame;

public class HREditController implements ActionListener{
	 
	HRFrameEdit rhr;
	
	public HREditController(HRFrameEdit ee)
	{
		this.rhr=ee;
	}

	@Override
	public void actionPerformed(ActionEvent hr) { 
		 
			if(hr.getSource()==rhr.getBtSubmit()){
			
			String id=rhr.getTxtId().getText();
			String Name=rhr.getTxtName().getText();
			String Sal=rhr.getTxtSal().getText();
			String com=rhr.getTxtCommission().getText();
			
			
			HR ohr=new HR();
		
			
			int idd=Integer.parseInt(id);
			ohr.setId(idd);
			
			ohr.setName(Name);
			
			double sall=Double.parseDouble(Sal);
			ohr.setSal(sall);
			
			double comm=Double.parseDouble(com);
			ohr.setCommission(comm);
			
			
			SuperUserDao ed=new SuperUserDao();
		
			
	
			
			boolean t = false;
			try {
				
				t = ed.insertSMEdit(ohr); //**************
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(t) {
				
				JOptionPane.showMessageDialog(rhr,"Updated Successfully !!");
				rhr.dispose();
				new SuperUserFrame();			
			}

			
		}
			if(hr.getSource()== rhr.getBtBack())
			{
				rhr.dispose();
				new SuperUserFrame();
		    }
		
	}
	

}
