package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controller.SMController;
import controller.SMEditController;
import model.Salesmanager;

public class SMFrameEdit extends JFrame {
	
	
	Button btSubmit,btBack;
	JTextField txtId,txtName,txtSal,txtIncentive,txtTarget;
	Label lbtId,lbName,lbSal,lbIncentive,lbTarget;
	
	public SMFrameEdit(Salesmanager e){
		
		btSubmit=new Button("Update");
		btBack=new Button("Back");
		
		txtId=new JTextField();
		txtId.setText(Integer.toString(e.getId())); //*********
		txtId.setEditable(false);
		
		txtName=new JTextField(e.getName());
		
		txtSal=new JTextField();
		txtSal.setText(Double.toString(e.getSal()));
		
		txtIncentive=new JTextField();
		txtIncentive.setText(String.valueOf(e.getIncentive()));
		
	    txtTarget=new JTextField();
	    txtTarget.setText(String.valueOf(e.getTarget()));
	    
	    lbtId=new Label("Enter Id ");
	    lbName=new Label("Enter Name");
	    lbSal=new Label("Enter Salary");
	    lbIncentive=new Label("Enter Incentive");
	    lbTarget=new Label("Enter Target");
	    
	    this.setTitle("Edit SalesManager Details");
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
		lbIncentive.setBounds(30, 130, 80, 30);
		txtIncentive.setBounds(130, 135, 180, 25);
		lbTarget.setBounds(30, 160, 80, 30);
		txtTarget.setBounds(130, 165, 180, 25);
		btBack.setBounds(60, 200, 100, 30);
		btSubmit.setBounds(170, 200, 100, 30);
		
		
		add(lbtId);
		add(txtId);
		add(lbName);
		add(txtName);
		add(lbSal);
		add(txtSal);
		add(lbIncentive);
		add(txtIncentive);
		add(lbTarget);
		add(txtTarget);
		add(btSubmit);
		add(btBack);
		

	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SMEditController smc= new SMEditController(this);
		btSubmit.addActionListener(smc);
		btBack.addActionListener(smc);
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

	public JTextField getTxtIncentive() {
		return txtIncentive;
	}

	public void setTxtIncentive(JTextField txtIncentive) {
		this.txtIncentive = txtIncentive;
	}

	public JTextField getTxtTarget() {
		return txtTarget;
	}

	public void setTxtTarget(JTextField txtTarget) {
		this.txtTarget = txtTarget;
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

	public Label getLbIncentive() {
		return lbIncentive;
	}

	public void setLbIncentive(Label lbIncentive) {
		this.lbIncentive = lbIncentive;
	}

	public Label getLbTarget() {
		return lbTarget;
	}

	public void setLbTarget(Label lbTarget) {
		this.lbTarget = lbTarget;
	}

	
}
