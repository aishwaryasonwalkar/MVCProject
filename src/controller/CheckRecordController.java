package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import db.UserDao;
import model.Employee;
import view.CheckRecordFrame;
import view.RemoveFrame;
import view.UserFrame;

public class CheckRecordController implements ActionListener
{

	CheckRecordFrame crf;
	
	public CheckRecordController(CheckRecordFrame cr)
	{
		this.crf=cr;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		if(e.getSource()==crf.getBtSearch())
		{
		
			String iddd=crf.getTxtId().getText();
		
			boolean t1=isNumber(iddd);
			if(iddd=="" || iddd.length()==0){
				JOptionPane.showMessageDialog(crf," Id Is Empty !!");

			  }
			  else if(t1){
				
				  int id=Integer.parseInt(iddd);
				  Employee  emppp=new Employee();
					UserDao ud= new UserDao();
					try {
						emppp=ud.CheckEmpRecord(id);//**************
						if(emppp!=null)
						{
						JOptionPane.showMessageDialog(crf,emppp);
						crf.dispose();
						new UserFrame();
						
						}
						else
						{
							JOptionPane.showMessageDialog(crf,"Id not Found !!");
							crf.dispose();
							new UserFrame();	
						}
						
					} catch (ClassNotFoundException | IOException e1) {
					
						e1.printStackTrace();
					}
					
				

			  }
			  else if(!t1)
			  {
				  JOptionPane.showMessageDialog(crf," Id Must be Number !!");

			  }	

		}
		if(e.getSource()==crf.getBtBack())
		{
			crf.dispose();
			new UserFrame();
			
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
