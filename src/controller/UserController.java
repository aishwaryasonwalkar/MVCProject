package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import db.SuperUserDao;
import db.UserDao;
import model.Employee;
import view.*;

public class UserController implements ActionListener{
	
	UserFrame uf;
	
	public UserController(UserFrame u)
	{
		this.uf=u;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		if(e.getSource()==uf.getBtCheckRec())
		{
			uf.dispose();
			new CheckRecordFrame();
			
		}
		if(e.getSource()==uf.getBtSort())
		{
			
			uf.dispose();
			new SortEmpFrame();
						
		}
		if(e.getSource()==uf.getBtCalSal())
		{
			uf.dispose();
			new CalSalFrame();
		}
		
		if(e.getSource()==uf.getBtBack())
		{
			uf.dispose();
			new LoginFrame();
			
		}
	}

}
