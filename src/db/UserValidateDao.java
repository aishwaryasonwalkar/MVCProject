package db;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.*;

public class UserValidateDao {

	static ArrayList<SuperUser> Sarr;
	
	FileInputStream fis=null;
	FileOutputStream fos=null;

	
	static{
		Sarr= new ArrayList<SuperUser>();
	}
	
	
	public SuperUser validateSU(SuperUser su)
	{	
		if(su.getName().length()>0 && su.getPassword().length()>0)
		{
		System.out.println("validateSU"+su);
			try {
				
				fis=new FileInputStream("F:\\AdvJava\\User.txt");
				DataInputStream dio=new DataInputStream(fis);
				ObjectInputStream ois= new ObjectInputStream(dio);
				
				Sarr=(ArrayList<SuperUser>)ois.readObject();
				ois.close();
				for(SuperUser s1:Sarr) {
					if(s1!=null)
						if(su.getName().equals(s1.getName()) && su.getPassword().equals(s1.getPassword()))
							{
								return s1;
							}
				        }
		        	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not FoundiO");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Not FoundCLASS");
			e.printStackTrace();
		} 
			}
			 else
			 {
				 return null;
			 }
		return null;

	
}
	
	
	public boolean insertSU(SuperUser su) throws IOException {

		int SUCount=0;
			if(Sarr.isEmpty())
		   	{
				 System.out.println("IsertUs 1st time "+su);
		   		FileOutputStream fos=new FileOutputStream("F:\\AdvJava\\User.txt",false);
			   	ObjectOutputStream oos= new ObjectOutputStream(fos);
			   	Sarr.add(su);
		   		oos.writeObject(Sarr);
		   		SUCount++;
		   		
		   		oos.close();
		   		return true;
		   		
		   	}
			else
		   	{
		    	 boolean isPresent=false;
		    	
		   		for(SuperUser e:Sarr)
		   		{
		   			
		   			if(e.getName().equals(su.getName()))
		   			{      
		   				System.out.println("Name PRESENT :- "+su);
		   				isPresent=true;
		   				break;
		   			}
		   			
		   		}
		   		
		   		if(isPresent==false)
	   			{
		   			
		   			FileOutputStream fos=new FileOutputStream("F:\\AdvJava\\User.txt",false);
	   			   	ObjectOutputStream oos= new ObjectOutputStream(fos);
	   			   	Sarr.add(su);
	   		   		oos.writeObject(Sarr);
	   		   		SUCount++;
	   		   		oos.close();
	   		   		
	   			}
		   	}
		   	
						if(SUCount>0)
						{
							return true;
						}
						else
						{
							return false;
						}
	
			 
		
}
}
