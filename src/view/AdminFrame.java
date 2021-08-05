package view;

import java.awt.*;

import javax.swing.JFrame;

import controller.AdminController;
import controller.MyWindowListener;
import controller.SMController;

public class AdminFrame extends JFrame {
	
	Button btSubmit,btBack,btClear;
	public TextField txtId,txtName,txtSal,txtAllowancee;
	Label lbtId,lbName,lbSal,lbAllowance;
	
	public AdminFrame(){
		
		btSubmit=new Button("Submit");
		btBack=new Button("Back");
		btClear=new Button("Clear");
		
		txtId=new TextField(20);
		txtName=new TextField(20);
		txtSal=new TextField(20);
		txtAllowancee=new TextField(20);
	   
	    
	    lbtId=new Label("Enter Id");
	    lbName=new Label("Enter Name");
	    lbSal=new Label("Enter Salary");
	    lbAllowance=new Label("Enter Allowance");
	    
	    this.setTitle("Admin Data");
		this.setVisible(true);
		this.setBounds(250, 50, 320, 350);
		this.setLayout(null);
		this.setResizable(false);
		
		lbtId.setBounds(20, 30, 100, 25);
		lbName.setBounds(20, 70, 100, 25);
		lbSal.setBounds(20, 110, 100, 25);
		lbAllowance.setBounds(20, 150, 100, 25);
		
		txtId.setBounds(120, 30, 130, 25);
		txtName.setBounds(120, 70, 130, 25);
		txtSal.setBounds(120, 110, 130, 25);
		txtAllowancee.setBounds(120, 150, 130, 25);
	
		btSubmit.setBounds(20, 210, 50, 25);
		btClear.setBounds(110, 210, 50, 25);
		btBack.setBounds(200, 210, 50, 25);
		
		add(lbtId);
		add(txtId);
		add(lbName);
		add(txtName);
		add(lbSal);
		add(txtSal);
		add(lbAllowance);
		add(txtAllowancee);
		add(btSubmit);
		add(btClear);
		add(btBack);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		AdminController adc= new AdminController(this);
		btSubmit.addActionListener(adc);
		btBack.addActionListener(adc);
		btClear.addActionListener(adc);
		
		
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

	public TextField getTxtAllowancee() {
		return txtAllowancee;
	}

	public void setTxtAllowancee(TextField txtAllowancee) {
		this.txtAllowancee = txtAllowancee;
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

	public Button getBtClear() {
		return btClear;
	}

	public void setBtClear(Button btClear) {
		this.btClear = btClear;
	}

}
