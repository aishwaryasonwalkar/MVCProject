package view;
import controller.*;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

import controller.MyWindowListener;
import controller.RegistartionController;
import javax.swing.*;
	public class RegistrationFrame extends JFrame 
	
	{

		Button btSubmit,btClear,btBack;
		public TextField txtUname,txtPassword;
		Label lbUname,lbPassword,lbprofession;
		JRadioButton rbUser, rbSUser;
		
		
		public RegistrationFrame() {
			
			btSubmit= new Button("Submit");
			btClear= new Button("Clear");
			btBack=new Button("Back");
			
			txtUname= new TextField(20);
			txtPassword=new TextField(20);
			
			lbUname=new Label("Enter the Username");
			lbPassword= new Label("Enter the Password");
			lbprofession= new Label("Enter Your Profession");
			
			ButtonGroup bg = new ButtonGroup();
			rbSUser =new JRadioButton("SuperUser");
			rbUser =new JRadioButton("User");
			bg.add(rbSUser);
			bg.add(rbUser);
			
			txtPassword.setEchoChar('*');
			this.setTitle("Registartion Form");
			this.setVisible(true);
			this.setBounds(250, 50, 325, 350);
			this.setResizable(false);
			
			setContentPane(new JLabel(new ImageIcon("D:/b22.png")));
			setSize(399,499);
			setSize(400,400);
			Image icon=Toolkit.getDefaultToolkit().getImage("D:/i2.png");
			
			lbUname.setBounds(30, 40, 135, 32);
			lbPassword.setBounds(30, 80, 135, 32);
			txtUname.setBounds(170, 42, 160, 30);
			txtPassword.setBounds(170, 82, 160, 30);
			
			rbSUser.setBounds(30, 120, 100, 30);
			rbUser.setBounds(150, 120, 80, 30);
			btSubmit.setBounds(150, 160, 60, 30);
			btClear.setBounds(230, 160, 50, 30);
			btBack.setBounds(300, 160, 50, 30);
			
			this.add(lbUname);
			this.add(txtUname);
			this.add(lbPassword);
			this.add(txtPassword);
			
			this.add(rbSUser);
			this.add(rbUser);
			this.add(btClear);
			this.add(btSubmit);
			this.add(btBack);
			this.setIconImage(icon);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			RegistartionController rc= new RegistartionController(this);
			btSubmit.addActionListener(rc);
			btClear.addActionListener(rc);
			btBack.addActionListener(rc);
			rbSUser.addActionListener(rc);
			rbUser.addActionListener(rc);
			btSubmit.addKeyListener(rc);
			btClear.addKeyListener(rc);
			btBack.addActionListener(rc);
			rbSUser.addKeyListener(rc);
			rbSUser.addKeyListener(rc);
		
		}

		public Button getBtBack() {
			return btBack;
		}


		public void setBtBack(Button btBack) {
			this.btBack = btBack;
		}


		public JRadioButton getRbUser() {
			return rbUser;
		}


		public void setRbUser(JRadioButton rbUser) {
			this.rbUser = rbUser;
		}


		public JRadioButton getRbSUser() {
			return rbSUser;
		}


		public void setRbSUser(JRadioButton rbSUser) {
			this.rbSUser = rbSUser;
		}


		public Button getBtSubmit() {
			return btSubmit;
		}


		public void setBtSubmit(Button btSubmit) {
			this.btSubmit = btSubmit;
		}


		public Button getBtClear() {
			return btClear;
		}


		public void setBtClear(Button btClear) {
			this.btClear = btClear;
		}


		public TextField getTxtUname() {
			return txtUname;
		}


		public void setTxtUname(TextField txtUname) {
			this.txtUname = txtUname;
		}


		public TextField getTxtPassword() {
			return txtPassword;
		}


		public void setTxtPassword(TextField txtPassword) {
			this.txtPassword = txtPassword;
		}

		public Label getLbUname() {
			return lbUname;
		}


		public void setLbUname(Label lbUname) {
			this.lbUname = lbUname;
		}


		public Label getLbPassword() {
			return lbPassword;
		}


		public void setLbPassword(Label lbPassword) {
			this.lbPassword = lbPassword;
		}


		public Label getLbprofession() {
			return lbprofession;
		}


		public void setLbprofession(Label lbprofession) {
			this.lbprofession = lbprofession;
		}


}
