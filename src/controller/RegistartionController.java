package controller;

import javax.swing.plaf.basic.BasicColorChooserUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.*;

import db.*;
import db.UserValidateDao;
import model.SuperUser;
import view.*;
public class RegistartionController implements ActionListener,KeyListener {
	
	RegistrationFrame rc;
	
	
	public RegistartionController(RegistrationFrame registrationFrame) {
	
		this.rc=registrationFrame;
	
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		
		if(a.getSource()==rc.getBtClear())
		{
			rc.txtPassword.setText(null);
			rc.txtUname.setText(null);
		}
		if(a.getSource()==rc.getBtSubmit())
		{
			String Uname=rc.getTxtUname().getText();
			String Pass=rc.getTxtPassword().getText();
			
			SuperUser su=new SuperUser();

			boolean u1=false,p1=false,b1=false;
			if(Uname=="" || Uname.length()==0)
			{
				JOptionPane.showMessageDialog(rc, "Username Is Empty ");
		
			}
			else if(Uname!="" || Uname.length()>=0)
			{
				su.setName(Uname);
				u1=true;
			}
			
			if(Pass=="" || Pass.length()==0)
			{
				JOptionPane.showMessageDialog(rc, "Password Is Empty ");
			
			}
			else if(Pass!="" || Pass.length()>=0)
			{
				su.setPassword(Pass);
				p1=true;
			}

			
			if (rc.getRbSUser().isSelected()) {
				
				String SuperUser=rc.getRbSUser().getText();
				su.setProfession(SuperUser);
				b1=true;
		
					
			}
			if (rc.getRbUser().isSelected())
			{
				
				String User=rc.getRbUser().getText();
				su.setProfession(User);
				b1=true;
	
			}
		
			if(!b1)
			{
				JOptionPane.showMessageDialog(rc, "User Type Not Selected");
			}
			
			db.UserValidateDao Ed=new UserValidateDao();
			if(u1 && p1 && b1)
			{
			try {
				if(Ed.insertSU(su))
				{
				
					JOptionPane.showMessageDialog(rc, "SuccessFully Registerd ! ! !");
					rc.dispose();
					new LoginFrame();
				}
				else
				{
					
					JOptionPane.showMessageDialog(rc, "UserName Already Taken \nPlease Insert Another UserName");	
					
				}
			
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			    }
			}
			  else
			{
				  
				  JOptionPane.showMessageDialog(rc, "Registeration Fail");
				  
			}
	}
		if(a.getSource()==rc.getBtBack())
		{
			rc.dispose();
			new LoginFrame();
		}

  }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			if(e.getSource()==rc.getBtClear())
			{
				rc.txtPassword.setText(null);
				rc.txtUname.setText(null);
			}
			if(e.getSource()==rc.getBtSubmit())
			{
				String Uname=rc.getTxtUname().getText();
				String Pass=rc.getTxtPassword().getText();
				
				SuperUser su=new SuperUser();

				boolean u1=false,p1=false,b1=false;
				if(Uname=="" || Uname.length()==0)
				{
					JOptionPane.showMessageDialog(rc, "Username Is Empty ");
					
				}
				else if(Uname!="" || Uname.length()>=0)
				{
					su.setName(Uname);
					u1=true;
				}
				
				if(Pass=="" || Pass.length()==0)
				{
					JOptionPane.showMessageDialog(rc, "Password Is Empty ");
				
				}
				else if(Pass!="" || Pass.length()>=0)
				{
					su.setPassword(Pass);
					p1=true;
				}
				
				
				
				if (rc.getRbSUser().isSelected()) {
					
					String SuperUser=rc.getRbSUser().getText();
					su.setProfession(SuperUser);
					b1=true;
						
				}
				if (rc.getRbUser().isSelected())
				{
					
					String User=rc.getRbUser().getText();
					su.setProfession(User);
					b1=true;
				
				}
			
				if(!b1)
				{
					JOptionPane.showMessageDialog(rc, "User Type Not Selected");
				}
				
				db.UserValidateDao Ed=new UserValidateDao();
				if(u1 && p1 && b1)
				{
				try {
					if(Ed.insertSU(su))
					{
					
						JOptionPane.showMessageDialog(rc, "SuccessFully Registerd ! ! !");
						rc.dispose();
						new LoginFrame();
					}
					else
					{
					
						JOptionPane.showMessageDialog(rc, "UserName Already Taken \nPlease Insert Another UserName");
						
						
					}
				
				 } catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				    }
				}
				  else
				{
					
					  JOptionPane.showMessageDialog(rc, "Registeration Fail");
				
				}
		}
			if(e.getSource()==rc.getBtBack())
			{
				rc.dispose();
				new LoginFrame();
			}
		
		}
		else
		{
			JOptionPane.showMessageDialog(rc,"Press Only ENTER Key");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
