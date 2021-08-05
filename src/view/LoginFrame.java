package view;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.*;

public class LoginFrame extends JFrame 
{
	
	Button btSubmit, btClear, btNewUser;
	public TextField txtUsername;
	public TextField txtPassword;
	Label lbUsername,lbpassword;
	
	public LoginFrame(){
		
	
		btSubmit= new Button("Login");
		btClear= new Button("Clear");
		btNewUser= new Button("New Register");
		
		txtUsername= new TextField(20);
		txtPassword=new TextField(20);
		
		lbUsername=new Label("Enter the Username");
		lbpassword= new Label("Enter the Password");

		txtPassword.setEchoChar('*');
		this.setTitle("Login Form");
		this.setVisible(true);
		this.setBounds(250, 70, 100, 350);
		this.setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new JLabel(new ImageIcon("D:/b3.png")));
		setSize(399,499);
		setSize(400,400);
		
		Image icon=Toolkit.getDefaultToolkit().getImage("D:/i2.png");
		lbUsername.setBounds(30, 40, 140, 35);
		lbpassword.setBounds(30, 80, 140, 35);
		txtUsername.setBounds(175, 43, 160, 30);
		txtPassword.setBounds(175, 83, 160, 30);
		btSubmit.setBounds(70, 140, 50, 30);
		btNewUser.setBounds(145, 140, 85, 30);
		btClear.setBounds(270, 140, 50, 30);
		
		this.add(lbUsername);
		this.add(txtUsername);
		this.add(lbpassword);
		this.add(txtPassword);
		this.add(btSubmit);
		this.add(btClear);
		this.add(btNewUser);  
		this.setIconImage(icon);

		LoginControl lf=new LoginControl(this);
		btSubmit.addActionListener(lf);
		btNewUser.addActionListener(lf);
		btClear.addActionListener(lf);
		btSubmit.addKeyListener(lf);
		btNewUser.addKeyListener(lf);
		btClear.addKeyListener(lf);

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

	public Button getBtNewUser() {
		return btNewUser;
	}

	public void setBtNewUser(Button btNewUser) {
		this.btNewUser = btNewUser;
	}

	public TextField getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(TextField txtUsername) {
		this.txtUsername = txtUsername;
	}

	public TextField getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(TextField txtPassword) {
		this.txtPassword = txtPassword;
	}

	public Label getLbUsername() {
		return lbUsername;
	}

	public void setLbUsername(Label lbUsername) {
		this.lbUsername = lbUsername;
	}

	public Label getLbpassword() {
		return lbpassword;
	}

	public void setLbpassword(Label lbpassword) {
		this.lbpassword = lbpassword;
	}



}
