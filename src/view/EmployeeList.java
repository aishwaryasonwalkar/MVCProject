package view;

import java.awt.*;

import javax.swing.JFrame;

import controller.EmployeeListControll;
import controller.MyWindowListener;

public class EmployeeList extends JFrame  {
	
	Button btSM,btAdmin,btHR, btBack;
	
	public EmployeeList()
	{
		
		btSM=new Button("SalesManager");
		btAdmin=new Button("Admin");
		btHR=new Button("HR");
		btBack=new Button("Back");
		
		
		this.setTitle(" Add Employee");
		this.setVisible(true);
		this.setBounds(250, 50, 325, 350);
		this.setLayout(null);
		this.setResizable(false);
		
		this.btSM.setBounds(100, 40, 120, 50);
		this.btAdmin.setBounds(100, 110,120, 50);
		this.btHR.setBounds(100, 180, 120, 50);
		this.btBack.setBounds(130, 250, 60, 30);
		
		
		this.add(btSM);
		this.add(btAdmin);
		this.add(btHR);
		this.add(btBack);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		EmployeeListControll elc=new EmployeeListControll(this);
		btSM.addActionListener(elc);
		btAdmin.addActionListener(elc);
		btHR.addActionListener(elc);
		btBack.addActionListener(elc);
		
	}

	
	public Button getBtBack() {
		return btBack;
	}


	public void setBtBack(Button btBack) {
		this.btBack = btBack;
	}


	public Button getBtSM() {
		return btSM;
	}

	public void setBtSM(Button btSM) {
		this.btSM = btSM;
	}

	public Button getBtAdmin() {
		return btAdmin;
	}

	public void setBtAdmin(Button btAdmin) {
		this.btAdmin = btAdmin;
	}

	public Button getBtHR() {
		return btHR;
	}

	public void setBtHR(Button btHR) {
		this.btHR = btHR;
	}
	

}
