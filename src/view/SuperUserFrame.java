package view;

import java.awt.*;

import javax.swing.JFrame;

import controller.*;

public class SuperUserFrame extends JFrame {
	
	Button btAdd,btRemove,btEdit,btView, btBack;
	
	public SuperUserFrame(){
		
		btAdd=new Button("Add");
		btRemove=new Button("Remove");
		btEdit=new Button("Edit");
		btBack= new Button("Back");
		btView=new Button("View");
		
		this.setTitle("Super User");
		this.setVisible(true);
		this.setBounds(250, 50, 325, 350);
		this.setLayout(null);
		this.setResizable(false);
		
		btAdd.setBounds(30, 60, 70, 40);
		btRemove.setBounds(120, 60, 70, 40);
		btEdit.setBounds(210, 60, 70, 40);
		btView.setBounds(70, 150, 70, 40);
		btBack.setBounds(170, 150, 70, 40);
		
		this.add(btView);
		this.add(btAdd);
		this.add(btRemove);
		this.add(btEdit);
		this.add(btBack);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		SuperUserControll su=new SuperUserControll(this);
		btView.addActionListener(su);
		btAdd.addActionListener(su);
		btRemove.addActionListener(su);
		btEdit.addActionListener(su);
		btBack.addActionListener(su);
		
	}

	public Button getBtBack() {
		return btBack;
	}

	public void setBtBack(Button btBack) {
		this.btBack = btBack;
	}

	public Button getBtAdd() {
		return btAdd;
	}

	public void setBtAdd(Button btAdd) {
		this.btAdd = btAdd;
	}

	public Button getBtRemove() {
		return btRemove;
	}

	public void setBtRemove(Button btRemove) {
		this.btRemove = btRemove;
	}

	public Button getBtEdit() {
		return btEdit;
	}

	public void setBtEdit(Button btEdit) {
		this.btEdit = btEdit;
	}

	public Button getBtView() {
		return btView;
	}

	public void setBtView(Button btView) {
		this.btView = btView;
	}
	
}
