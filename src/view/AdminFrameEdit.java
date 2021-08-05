package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controller.AdminEditController;
import controller.SMController;
import controller.SMEditController;
import model.Admin;

public class  AdminFrameEdit extends JFrame {
	
	
	Button btSubmit,btBack;
	JTextField txtId,txtName,txtSal,txtAllowance;
	Label lbtId,lbName,lbSal,lbAllowance;
	
	public AdminFrameEdit(Admin e){

		
		
		btSubmit=new Button("Update");
		btBack=new Button("Back");
		
		txtId=new JTextField();
		txtId.setText(Integer.toString(e.getId())); //*********
		txtId.setEditable(false);
		
		txtName=new JTextField(e.getName());
		
		txtSal=new JTextField();
		txtSal.setText(Double.toString(e.getSal()));
		
		txtAllowance=new JTextField();
		txtAllowance.setText(String.valueOf(e.getAllowance()));
		
	    
	    lbtId=new Label("Enter Id ");
	    lbName=new Label("Enter Name");
	    lbSal=new Label("Enter Salary");
	    lbAllowance=new Label("Enter Allowance");

	    
	    this.setTitle("Edit Admin Details");
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
		lbAllowance.setBounds(30, 130, 80, 30);
		txtAllowance.setBounds(130, 135, 180, 25);
		btBack.setBounds(60, 200, 100, 30);
		btSubmit.setBounds(170, 200, 100, 30);
		
		
		add(lbtId);
		add(txtId);
		add(lbName);
		add(txtName);
		add(lbSal);
		add(txtSal);
		add(lbAllowance);
		add(txtAllowance);
		add(btSubmit);
		add(btBack);
		

	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AdminEditController adc= new AdminEditController(this);
		btSubmit.addActionListener(adc);
		btBack.addActionListener(adc);
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

	public JTextField getTxtAllowance() {
		return txtAllowance;
	}

	public void setTxtAllowance(JTextField txtAllowance) {
		this.txtAllowance = txtAllowance;
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

	public Label getLbAllowance() {
		return lbAllowance;
	}

	public void setLbAllowance(Label lbAllowance) {
		this.lbAllowance = lbAllowance;
	}
		

	
}
