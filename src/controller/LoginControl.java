package controller;

import view.*;
import db.*;
import db.UserValidateDao;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.EventListener;

import javax.swing.JOptionPane;
import javax.swing.text.View;

import db.*;
import model.SuperUser;
import view.LoginFrame;

public class LoginControl implements ActionListener, KeyListener {

	LoginFrame lg;

	public LoginControl(LoginFrame lref) {
		this.lg = lref;
	}

	@Override
	public void actionPerformed(ActionEvent a) {

		if (a.getSource() == lg.getBtClear()) {
			lg.txtPassword.setText(null);
			lg.txtUsername.setText(null);

		}

		if (a.getSource() == lg.getBtNewUser()) {

			lg.dispose();
			new RegistrationFrame();
		}

		if (a.getSource() == lg.getBtSubmit()) {
			
			
			String Uname = lg.getTxtUsername().getText();
			String Pass = lg.getTxtPassword().getText();

			SuperUser su = new SuperUser();
			
			boolean u1=false,p1=false;
			if(Uname=="" || Uname.length()==0)
			{
				
				JOptionPane.showMessageDialog(lg, "Username Is Empty ");
				lg.dispose();
			
			}
			else if(Uname!="" || Uname.length()>=0)
			{
				su.setName(Uname);
				u1=true;
			}
			
			if(Pass=="" || Pass.length()==0)
			{	
				JOptionPane.showMessageDialog(lg, "Password Is Empty ");
				lg.dispose();
			
			}
			else if(Pass!="" || Pass.length()>=0)
			{
				su.setPassword(Pass);
				p1=true;
			}
			
			
			if(p1 && u1 ) {
			 db.UserValidateDao Ed=new UserValidateDao();
			 su=Ed.validateSU(su);
			 if (su != null) {
					if (su.getProfession().equals("SuperUser")) {
						System.out.println("Login SuperUser");
						new SuperUserFrame();
						lg.dispose();
					} else if (su.getProfession().equals("User")) {
						System.out.println("Login User");
						new UserFrame();
						lg.dispose();
					}
				}

				else {
					
					JOptionPane.showMessageDialog(lg, "LogIn Fail ! ! ! ");
					lg.dispose();
					new LoginFrame();
				}
			}
			else
			{
				
				JOptionPane.showMessageDialog(lg, "LogIn Fail ! ! ! ");
				lg.dispose();
				new LoginFrame();
			}

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			if (e.getSource() == lg.getBtClear()) {
				lg.txtPassword.setText(null);
				lg.txtUsername.setText(null);

			}
			if (e.getSource() == lg.getBtNewUser()) {

				lg.dispose();
				new RegistrationFrame();
			}

			if (e.getSource() == lg.getBtSubmit()) {lg.dispose();
			
			String Uname = lg.getTxtUsername().getText();
			String Pass = lg.getTxtPassword().getText();

			SuperUser su = new SuperUser();
			
			boolean u1=false,p1=false;
			if(Uname=="" || Uname.length()==0)
			{
				JOptionPane.showMessageDialog(lg, "Username Is Empty ");
			
			}
			else if(Uname!="" || Uname.length()>=0)
			{
				su.setName(Uname);
				u1=true;
			}
			
			if(Pass=="" || Pass.length()==0)
			{
				JOptionPane.showMessageDialog(lg, "Password Is Empty ");
			
			}
			else if(Pass!="" || Pass.length()>=0)
			{
				su.setPassword(Pass);
				p1=true;
			}
			
			
			if(p1 && u1 ) {
			 db.UserValidateDao Ed=new UserValidateDao();
			 su=Ed.validateSU(su);
			 if (su != null) {
					if (su.getProfession().equals("SuperUser")) {
						System.out.println("Login SuperUser");
						new SuperUserFrame();
						lg.dispose();
					} else if (su.getProfession().equals("User")) {
						System.out.println("Login User");
						new UserFrame();
						lg.dispose();
					}
				}

				else {
				
					JOptionPane.showMessageDialog(lg, "LogIn Fail ! ! ! ");
					new LoginFrame();
				}
			}
			else
			{
			
				JOptionPane.showMessageDialog(lg, "LogIn Fail ! ! ! ");
				new LoginFrame();
			}
		
}

		}
		else
		{
			JOptionPane.showMessageDialog(lg,"Press Only ENTER Key");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			 System.out.println("Enter Data");
		}

	}

}
