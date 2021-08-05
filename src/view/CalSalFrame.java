
package view;

import java.awt.*;

import javax.swing.JFrame;

import controller.CalSalController;

public class CalSalFrame extends JFrame {
	Button btCalSal, btBack;
	TextField txtId;
	Label lbId;
	
	public CalSalFrame()
	{
		btCalSal= new Button("Calculate");
		btBack= new Button("Back");
		txtId= new TextField(20);
		lbId= new Label("Enter Id");
		
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Calculate Salary");
		this.setBounds(250, 50, 320, 350);
		this.setLayout(null);
		
		lbId.setBounds(25, 40, 100, 25);
		txtId.setBounds(130, 40, 150, 25);
		btCalSal.setBounds(80, 90, 60, 30);
		btBack.setBounds(170, 90, 60, 30);
		
		add(lbId);
		add(txtId);
		add(btCalSal);
		add(btBack);
		
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
		
	    CalSalController csc= new CalSalController(this);
		btCalSal.addActionListener(csc);
		btBack.addActionListener(csc);
				
	}
	
	public Button getBtCalSal() {
		return btCalSal;
	}

	public void setBtCalSal(Button btCalSal) {
		this.btCalSal = btCalSal;
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
	public Label getLbId() {
		return lbId;
	}
	public void setLbId(Label lbId) {
		this.lbId = lbId;
	}
	

}

