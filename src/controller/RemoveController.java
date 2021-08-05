package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.*;
import model.Employee;
import model.Salesmanager;
import view.*;

public class RemoveController implements ActionListener
{
   RemoveFrame rrem;
   
   
	public RemoveController(RemoveFrame reme) 
	{
	this.rrem = reme;
     }
	@Override
	public void actionPerformed(ActionEvent re) {
		// TODO Auto-generated method stub
	
		if(re.getSource()==rrem.getBtSearch())
		{
			boolean e;
			String idd=rrem.getTxtId().getText();
			
			SuperUserDao edd=new SuperUserDao();
			
			
			boolean t1=isNumber(idd);
			if(idd=="" || idd.length()==0){
				JOptionPane.showMessageDialog(rrem," Id Is Empty !!");

			  }
			  else if(t1){
				
				  int id=Integer.parseInt(idd);
				  try {
						e=edd.removeEmployee(id);
						if (e==true) {
							JOptionPane.showMessageDialog(rrem,"Id" +id+ "SuccessFully Removed !! ");
							rrem.dispose();
							new RemoveFrame();
						}else
						{
							JOptionPane.showMessageDialog(rrem, id+" Id Not Found !! \n Please provide valid Id");
							rrem.dispose();
							new RemoveFrame();
						}
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		

			  }
			  else if(!t1)
			  {
				  JOptionPane.showMessageDialog(rrem," Id Must be Number !!");

			  }	
		  
		    
			System.out.println("It removes data ");
		
			
		}
		if(re.getSource()==rrem.getBtBack())
		{
			rrem.dispose();
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
