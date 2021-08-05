package view;

import java.awt.*;

import javax.swing.JFrame;

import controller.MyWindowListener;
import controller.RegistartionController;
import model.Salesmanager;
import controller.*;


public class SMFrame extends JFrame {
	
	
	Button btSubmit,btBack,btClear;
	public TextField txtId,txtName,txtSal,txtIncentive,txtTarget;
	Label lbtId,lbName,lbSal,lbIncentive,lbTarget;
	
	public SMFrame(){
	
		btSubmit=new Button("Submit");
		btBack=new Button("Back");
		btClear=new Button("Clear");
		
		txtId=new TextField(20);
		txtName=new TextField(20);
		txtSal=new TextField(20);
		txtIncentive=new TextField(20);
	    txtTarget=new TextField(20);
	    
	    lbtId=new Label("Enter Id ");
	    lbName=new Label("Enter Name");
	    lbSal=new Label("Enter Salary");
	    lbIncentive=new Label("Enter Incentive");
	    lbTarget=new Label("Enter Target");
	    
	    this.setTitle("SalesManager Details");
		this.setVisible(true);
		this.setBounds(250, 50, 320, 350);
		this.setLayout(null);
		this.setResizable(false);
		
		lbtId.setBounds(20, 30, 100, 25);
		lbName.setBounds(20, 70, 100, 25);
		lbSal.setBounds(20, 110, 100, 25);
		lbIncentive.setBounds(20, 150, 100, 25);
		lbTarget.setBounds(20, 190, 100, 25);
		txtId.setBounds(120, 30, 130, 25);
		txtName.setBounds(120, 70, 130, 25);
		txtSal.setBounds(120, 110, 130, 25);
		txtIncentive.setBounds(120, 150, 130, 25);
		txtTarget.setBounds(120, 190, 130, 25);
		btSubmit.setBounds(20, 250, 50, 25);
		btClear.setBounds(110, 250, 50, 25);
		btBack.setBounds(200, 250, 50, 25);
	
		
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
		add(btClear);
		add(btBack);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SMController smc= new SMController(this);
		btSubmit.addActionListener(smc);
		btBack.addActionListener(smc);
		btClear.addActionListener(smc);
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

	public TextField getTxtId() {
		return txtId;
	}

	public void setTxtId(TextField txtId) {
		this.txtId = txtId;
	}

	public TextField getTxtName() {
		return txtName;
	}

	public void setTxtName(TextField txtName) {
		this.txtName = txtName;
	}

	public TextField getTxtSal() {
		return txtSal;
	}

	public void setTxtSal(TextField txtSal) {
		this.txtSal = txtSal;
	}

	public TextField getTxtIncentive() {
		return txtIncentive;
	}

	public void setTxtIncentive(TextField txtIncentive) {
		this.txtIncentive = txtIncentive;
	}

	public TextField getTxtTarget() {
		return txtTarget;
	}

	public void setTxtTarget(TextField txtTarget) {
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

	public Button getBtClear() {
		return btClear;
	}

	public void setBtClear(Button btClear) {
		this.btClear = btClear;
	}

}
