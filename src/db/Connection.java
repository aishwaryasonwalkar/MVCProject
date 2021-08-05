package db;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Employee;

public class Connection {
	
	
	public ArrayList<Employee> ConnectionFileInput() throws IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("F:\\AdvJava\\Data.txt");
		DataInputStream dio = new DataInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(dio);
		
		return (ArrayList<Employee>) ois.readObject();

		
	}
	

}
