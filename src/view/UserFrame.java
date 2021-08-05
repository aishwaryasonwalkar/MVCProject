package view;

import java.awt.Button;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;

import controller.UserController;

public class UserFrame extends JFrame{

	Button btCheckRec,btSort,btCalSal, btBack;
	
	
	public UserFrame() throws HeadlessException {
		
		btCheckRec =new Button("Check Record");
		btSort = new Button("Sort Record");
		btCalSal =new Button("Calculate Salary");
		btBack= new Button("Back");
		
		this.setTitle("User View");
		this.setVisible(true);
		this.setSize(323, 350);
		this.setBounds(250, 50, 325, 350);
		this.setLayout(null);
		this.setResizable(false);
		
		this.btCheckRec.setBounds(100, 40, 120, 50);
		this.btSort.setBounds(100, 110,120, 50);
		this.btCalSal.setBounds(100, 180, 120, 50);
		this.btBack.setBounds(120, 250, 80, 30);
		
		this.add(btCheckRec);
		this.add(btSort);
		this.add(btCalSal);
		this.add(btBack);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		UserController uc= new UserController(this);
	    btCheckRec.addActionListener(uc);
	    btSort.addActionListener(uc);
	    btCalSal.addActionListener(uc);
	    btBack.addActionListener(uc);
		
	}


	public Button getBtBack() {
		return btBack;
	}

	public void setBtBack(Button btBack) {
		this.btBack = btBack;
	}

	public Button getBtCheckRec() {
		return btCheckRec;
	}

	public void setBtCheckRec(Button btCheckRec) {
		this.btCheckRec = btCheckRec;
	}

	public Button getBtSort() {
		return btSort;
	}

	public void setBtSort(Button btSearchEmp) {
		this.btSort = btSearchEmp;
	}

	public Button getBtCalSal() {
		return btCalSal;
	}

	public void setBtCalSal(Button btCalSal) {
		this.btCalSal = btCalSal;
	}

}
