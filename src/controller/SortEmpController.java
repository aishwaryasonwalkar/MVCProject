package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import db.UserDao;
import model.Employee;
import model.IdSortComparator;
import model.*;
import model.NameSortComparator;
import view.*;

public class SortEmpController implements ActionListener {
	SortEmpFrame sef;

	public SortEmpController(SortEmpFrame se) {
		this.sef = se;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == sef.getBtId()) {

			
			UserDao u=new UserDao();
			ArrayList<Employee> Empa=u.sortById();
			
			JOptionPane.showMessageDialog(sef, " Sort By Id \n" + Empa);
			sef.dispose();
			new SortEmpFrame();



		}
		if (e.getSource() == sef.getBtName()) {

			UserDao u=new UserDao();
			ArrayList<Employee> Empa=u.sortByName();
			JOptionPane.showMessageDialog(sef, " Sort By Name \n" + Empa);
			sef.dispose();
			new SortEmpFrame();
			
		}
		if (e.getSource() == sef.getBtSal()) {

			UserDao u=new UserDao();
			ArrayList<Employee> Empa=u.sortBySal();
			JOptionPane.showMessageDialog(sef, " Sort By Salary \n" + Empa);
			sef.dispose();
			new SortEmpFrame();
			

		}
		if (e.getSource() == sef.getBtBack()) {
			sef.dispose();
			new UserFrame();
		}
	}

}
