package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;

public class EmployeeListControll
implements ActionListener{

	EmployeeList el;
	
	public EmployeeListControll(EmployeeList eref){
		
		this.el=eref;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==el.getBtSM()){
			el.dispose();
			new SMFrame();
			
		}
		if(e.getSource()==el.getBtAdmin()){
			el.dispose();
			new AdminFrame();
			
		}
		if(e.getSource()==el.getBtHR()){
			el.dispose();
			new HRFrame();
			
		}
		if(e.getSource()==el.getBtBack()){
			el.dispose();
			new SuperUserFrame();
			
		}
	}
	

}
