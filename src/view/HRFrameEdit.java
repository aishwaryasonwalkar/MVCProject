package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controller.HREditController;
import controller.SMController;
import controller.SMEditController;
import model.HR;

public class  HRFrameEdit extends JFrame {
	
	
	Button btSubmit,btBack;
	JTextField txtId,txtName,txtSal,txtCommission;
	Label lbtId,lbName,lbSal,lbCommission;
	
	public HRFrameEdit(HR e){
		
		
		btSubmit=new Button("Update");
		btBack=new Button("Back");
		
		txtId=new JTextField();
		txtId.setText(Integer.toString(e.getId())); //*********
		txtId.setEditable(false);
		
		txtName=new JTextField(e.getName());
		
		txtSal=new JTextField();
		txtSal.setText(Double.toString(e.getSal()));
		
		txtCommission=new JTextField();
		txtCommission.setText(String.valueOf(e.getCommission()));
		
	    
	    lbtId=new Label("Enter Id ");
	    lbName=new Label("Enter Name");
	    lbSal=new Label("Enter Salary");
	    lbCommission=new Label("Enter Commission");
	    
	    this.setTitle("Edit HR Details");
		this.setVisible(true);
		this.setBounds(250, 50, 420, 350);
		this.setLayout(null);
		this.setResizable(false);
		
		
		lbtId.setBounds(30, 40, 80, 30);
		txtId.setBounds(130, 45, 180, 25);
		lbName.setBounds(30, 70, 80, 30);
		txtName.setBounds(130, 75, 180, 25);
		lbSal.setBounds(30, 100, 80, 30);
		txtSal.setBounds(130, 105, 180, 25);
		lbCommission.setBounds(30, 130, 80, 30);
		txtCommission.setBounds(130, 135, 180, 25);
		btBack.setBounds(60, 200, 100, 30);
		btSubmit.setBounds(170, 200, 100, 30);
		
		
		add(lbtId);
		add(txtId);
		add(lbName);
		add(txtName);
		add(lbSal);
		add(txtSal);
		add(lbCommission);
		add(txtCommission);
		add(btSubmit);
		add(btBack);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HREditController hrc= new HREditController(this);
		btSubmit.addActionListener(hrc);
		btBack.addActionListener(hrc);
	}
	
	public Button getBtSubmit() {
		return btSubmit;
	}

	public void setBtSubmit(Button btSubmit) {
		this.btSubmit = btSubmit;
	}

	public Button getBtBack() {
		return btBack;
	}

	public void setBtBack(Button btBack) {
		this.btBack = btBack;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
	}

	public JTextField getTxtSal() {
		return txtSal;
	}

	public void setTxtSal(JTextField txtSal) {
		this.txtSal = txtSal;
	}
	

	public Label getLbtId() {
		return lbtId;
	}

	public void setLbtId(Label lbtId) {
		this.lbtId = lbtId;
	}

	public Label getLbName() {
		return lbName;
	}

	public void setLbName(Label lbName) {
		this.lbName = lbName;
	}

	public Label getLbSal() {
		return lbSal;
	}

	public void setLbSal(Label lbSal) {
		this.lbSal = lbSal;
	}


	public JTextField getTxtCommission() {
		return txtCommission;
	}

	public void setTxtCommission(JTextField txtCommission) {
		this.txtCommission = txtCommission;
	}


	public Label getLbCommission() {
		return lbCommission;
	}

	public void setLbCommission(Label lbCommission) {
		this.lbCommission = lbCommission;
	}


	
}
