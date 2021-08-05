package db;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

import model.Admin;
import model.Employee;
import model.HR;
import model.IdSortComparator;
import model.NameSortComparator;
import model.SalarySortComparator;
import model.Salesmanager;
import view.SortEmpFrame;

public class UserDao {

	public Employee CheckEmpRecord(int id) throws ClassNotFoundException, IOException {
		int flag = 0;

		Connection con = new Connection();
		ArrayList<Employee> Empa = con.ConnectionFileInput();
		Employee Empa1 = null;

		for (Employee e : Empa) {
			if (e != null && e.getId() == id) {

				Empa1 = e;
				flag++;

			} else {

			}

		}

		if (flag >= 0) {
			return Empa1;
		} else {
			return null;
		}
	}

	public TreeSet<Employee> sortSal() throws IOException, ClassNotFoundException {

		Connection con = new Connection();
		ArrayList<Employee> Emp = con.ConnectionFileInput();

		TreeSet<Employee> Ets = new TreeSet<Employee>(Emp);

		return Ets;

	}

	public Employee calSal(int id) throws ClassNotFoundException, IOException {

		Connection con = new Connection();
		ArrayList<Employee> Empa = con.ConnectionFileInput();
		Employee Empa1 = null;

		for (Employee e : Empa) {
			if (e != null && e.getId() == id) {

				Empa1 = e;
			}
		}

		if (Empa1 != null) {
			return Empa1;
		} else {
			return null;
		}

	}

	public ArrayList<Employee> sortById() {
		
		ArrayList<Employee> EmpI=null;
		try {
			Connection con = new Connection();
			EmpI = con.ConnectionFileInput();
			
			IdSortComparator ic = new IdSortComparator();
			Collections.sort(EmpI, ic);

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return EmpI;

	}

	public ArrayList<Employee> sortByName() {
		ArrayList<Employee> EmpN=null;
	
		try {
			Connection con = new Connection();
			EmpN = con.ConnectionFileInput();
			
			NameSortComparator nc = new NameSortComparator();
			Collections.sort(EmpN, nc);
	

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return EmpN;
	}

	public ArrayList<Employee> sortBySal() {
		ArrayList<Employee> EmpS=null;
		
		try {
			Connection con = new Connection();
			EmpS = con.ConnectionFileInput();
			
			SalarySortComparator nc = new SalarySortComparator();
			Collections.sort(EmpS, nc);
	

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return EmpS;
		
		
	}

}
