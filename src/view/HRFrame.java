package view;

import java.awt.*;

import javax.swing.JFrame;

import controller.AdminController;
import controller.HRController;
import controller.MyWindowListener;

public class HRFrame extends JFrame{

	Button btSubmit,btBack,btClear;
	public TextField txtId,txtName,txtSal,txtComission;
	Label lbtId,lbName,lbSal,lbComission;
	
	public HRFrame(){
		
		btSubmit=new Button("Submit");
		btBack=new Button("Back");
		btClear=new Button("Clear");
		
		txtId=new TextField(20);
		txtName=new TextField(20);
		txtSal=new TextField(20);
		txtComission=new TextField(20);
	   
	    
	    lbtId=new Label("Enter Id ");
	    lbName=new Label("Enter Name");
	    lbSal=new Label("Enter Salary");
	    lbComission=new Label("Enter Commission");
	    
	    this.setTitle("HR Data");
		this.setVisible(true);
		this.setBounds(250, 50, 320, 350);
		this.setLayout(null);
		this.setResizable(false);
		
		lbtId.setBounds(20, 30, 100, 25);
		lbName.setBounds(20, 70, 100, 25);
		lbSal.setBounds(20, 110, 100, 25);
		lbComission.setBounds(20, 150, 100, 25);
		
		txtId.setBounds(120, 30, 130, 25);
		txtName.setBounds(120, 70, 130, 25);
		txtSal.setBounds(120, 110, 130, 25);
		txtComission.setBounds(120, 150, 130, 25);
	
		btSubmit.setBounds(20, 210, 50, 25);
		btClear.setBounds(110, 210, 50, 25);
		btBack.setBounds(200, 210, 50, 25);
		
		add(lbtId);
		add(txtId);
		add(lbName);
		add(txtName);
		add(lbSal);
		add(txtSal);
		add(lbComission);
		add(txtComission);
		add(btSubmit);
		add(btClear);
		add(btBack);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		HRController hrc= new HRController(this);
		btSubmit.addActionListener(hrc);
		btBack.addActionListener(hrc);
		btClear.addActionListener(hrc);
		
		
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

	public TextField getTxtComission() {
		return txtComission;
	}

	public void setTxtComission(TextField txtComission) {
		this.txtComission = txtComission;
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

	public Label getLbComission() {
		return lbComission;
	}

	public void setLbComission(Label lbComission) {
		this.lbComission = lbComission;
	}

	public Button getBtClear() {
		return btClear;
	}

	public void setBtClear(Button btClear) {
		this.btClear = btClear;
	}
	
}
