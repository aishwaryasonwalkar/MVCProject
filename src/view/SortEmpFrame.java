package view;

import java.awt.*;

import javax.swing.JFrame;

import controller.SortEmpController;

public class SortEmpFrame extends JFrame {
	Button btId,btName,btSal, btBack;
	
	
	public SortEmpFrame()
	{
		btId= new Button("Id");
		btName= new Button("Name");
		btSal= new Button("Salary"); 
		btBack= new Button("Back");
		
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Sort By");
		this.setBounds(250, 50, 320, 350);
		this.setLayout(null);
		
		this.btId.setBounds(100, 40, 120, 50);
		this.btName.setBounds(100, 110,120, 50);
		this.btSal.setBounds(100, 180, 120, 50);
		this.btBack.setBounds(120, 250, 80, 30);
		
		add(btId);
		add(btName);
		add(btSal);
		add(btBack);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
		
		SortEmpController sec= new SortEmpController(this);
		btId.addActionListener(sec);
		btBack.addActionListener(sec);
		btName.addActionListener(sec);
		btSal.addActionListener(sec);
			
	}

	public Button getBtId() {
		return btId;
	}

	public void setBtId(Button btId) {
		this.btId = btId;
	}

	public Button getBtName() {
		return btName;
	}

	public void setBtName(Button btName) {
		this.btName = btName;
	}


	public Button getBtSal() {
		return btSal;
	}


	public void setBtSal(Button btSal) {
		this.btSal = btSal;
	}


	public Button getBtBack() {
		return btBack;
	}


	public void setBtBack(Button btBack) {
		this.btBack = btBack;
	}
	

}
