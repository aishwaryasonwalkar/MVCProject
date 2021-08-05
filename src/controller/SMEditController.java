package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import db.*;
import model.Salesmanager;
import view.EmployeeList;
import view.SMFrameEdit;
import view.SuperUserFrame;

public class SMEditController implements ActionListener{
	 
	SMFrameEdit rsm;
	
	public SMEditController(SMFrameEdit ee)
	{
		this.rsm=ee;
	}

	@Override
	public void actionPerformed(ActionEvent sm) { 
		 
			if(sm.getSource()==rsm.getBtSubmit()){
			
			String id=rsm.getTxtId().getText();
			String Name=rsm.getTxtName().getText();
			String Sal=rsm.getTxtSal().getText();
			String inc=rsm.getTxtIncentive().getText();
			String tar=rsm.getTxtTarget().getText();
			
			Salesmanager osm=new Salesmanager();
		
			
			int idd=Integer.parseInt(id);
			osm.setId(idd);
			
			osm.setName(Name);
			
			double sall=Double.parseDouble(Sal);
			osm.setSal(sall);
			
			double incc=Double.parseDouble(inc);
			osm.setIncentive(incc);
			
			int tarr=Integer.parseInt(tar);
			osm.setTarget(tarr);
			
			
			SuperUserDao ed=new SuperUserDao();
			
			boolean t = false;
			try {
				
				t = ed.insertSMEdit(osm); //************
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(t) {
			
			JOptionPane.showMessageDialog(rsm,"Updated Successfully !!");
			rsm.dispose();
			new SuperUserFrame();
	
			}

		}
			if(sm.getSource()== rsm.getBtBack())
			{
				rsm.dispose();
				new SuperUserFrame();
		    }
		
	}
	

}
