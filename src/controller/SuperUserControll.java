package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Employee;
import view.*;

public class SuperUserControll implements ActionListener{
	
	SuperUserFrame su;
	public SuperUserControll(SuperUserFrame srf){
		this.su=srf;
	}
	

	@Override
	public void actionPerformed(ActionEvent ar) {
		
		if(ar.getSource()==su.getBtAdd()){
			
			su.dispose();
			new EmployeeList();
			
		}
		if(ar.getSource()==su.getBtEdit()){
			su.dispose();
			new EditEmployee();
			
		}
		if(ar.getSource()==su.getBtRemove()){
			su.dispose();
			new RemoveFrame();
		}
		if(ar.getSource()==su.getBtBack()){
			su.dispose();
			new LoginFrame();
		}
		if(ar.getSource()==su.getBtView()){
			su.dispose();
			
			db.SuperUserDao a=new db.SuperUserDao();
			
			try {
				   ArrayList<Employee> e=a.viewAllEmp(); //**************
				   
				  if(e.isEmpty() || e==null) {
					   JOptionPane.showMessageDialog(su,"No Employee Record Found !!");
				}else {
			
					JOptionPane.showMessageDialog(su,e);
				}
					  
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new SuperUserFrame();
		}

		
	}

}
