package db;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import model.*;

import view.*;

public class SuperUserDao {

	static ArrayList<Employee>EmpAl;		
	FileInputStream fis=null;

	
	static{
	
		EmpAl=new  ArrayList<Employee>();     
		
	}

	
public boolean insertEmp(Employee smc) throws IOException, ClassNotFoundException{

		int SMCount=0;
	  
	   	//If File opens here, it will give EOFException in viewAllEmp() during Reading the object
	   	
	   	if(EmpAl.isEmpty())
	   	{
	   		FileOutputStream fos=new FileOutputStream("F:\\AdvJava\\Data.txt",false);
		   	ObjectOutputStream oos= new ObjectOutputStream(fos);
	   		EmpAl.add(smc);
	   		oos.writeObject(EmpAl);
	   		SMCount++;
	   		
	   		oos.close();
	   		return true;
	   		
	   	}
	   	else
	   	{
	    	   boolean isFound=false;
	   		for(Employee e:EmpAl)
	   		{
	   			if(e.getId()==smc.getId())
	   			{      
	   				System.out.println("ID pRESENT"+smc);
	   				isFound=true;
	   				break;
	   			}
	   			
	   		}
	   		
	   		if(isFound==false)
   			{
	   			FileOutputStream fos=new FileOutputStream("F:\\AdvJava\\Data.txt",false);
   			   	ObjectOutputStream oos= new ObjectOutputStream(fos);
   				EmpAl.add(smc);
   		   		oos.writeObject(EmpAl);
   		   		SMCount++;
   		   		oos.close();
   		   		
   			}
	   	}
	   	
					if(SMCount>0)
					{
						return true;
					}
					else
					{
						return false;
					}
}    

public boolean removeEmployee(int id) throws ClassNotFoundException
	{
		 int flag=0;
       try {
		
	
    	   Connection con=new Connection();
			ArrayList<Employee> Erem = con.ConnectionFileInput();
    	   

  
    	   int count=0;
    	  
    	 
    	   for(Employee e:Erem)
    	   {
    		   if(e!=null && e.getId()==id)
    		   {
    		
    			   for(Employee e1:EmpAl)
    	    	   {
    	    		   if(e1!=null && e1.getId()==id)
    	    		   {
    	    			   EmpAl.remove(e1);
    	    			   break;
    	    		   }
    	    	   }
    			   
    			   flag++;
   
    		   }

    	   }
    	   writeObject();  //************

    		   
       }catch(FileNotFoundException e)
       {
    	   e.printStackTrace();
    	   }
       catch(IOException e)
       {
    	   e.printStackTrace();
       }
       if(flag!=0)
       {
    	   return true;
    	   
       }else
       {
    		return false;
       }

	}
      

public Employee editEmp(int id) throws ClassNotFoundException, IOException {
								
	   int flag=0;
	 
	   Connection con=new Connection();
       ArrayList<Employee> Empa = con.ConnectionFileInput();
	 
	   Employee Empa1=null;
	   
       int count=0;
	  
	   for(Employee e:Empa)
	   {
		   if(e!=null && e.getId()==id)
		   {

			   Empa1=e;
			   flag++; 
			   
		   }
	
	   }
   
	if(flag>=0)
	{
		return Empa1;
	}else
	{
		return null;
	}
  }


public ArrayList<Employee> viewAllEmp() throws IOException, ClassNotFoundException
{
 
	
			Connection con=new Connection();
			return  con.ConnectionFileInput();
	   	
	
}


public boolean insertSMEdit(Employee osm) throws IOException, ClassNotFoundException {
		 int flag=0;

		 Connection con=new Connection();
		 ArrayList<Employee> SmAl = con.ConnectionFileInput();
	   
 	   for(Employee e : SmAl)
 	   {
 		   if(e!=null && e.getId()==osm.getId())
 		   {
 			   
 			   
 			  for(Employee e1:EmpAl)
	    	   {
	    		   if(e1!=null && e1.getId()==osm.getId())
	    		   {
	    			   int i=EmpAl.indexOf(e1);
	    			   EmpAl.remove(e1);//Remove From Static list
	    			   EmpAl.add(i,osm);
	    			   flag++;
	    			   break;
	    		   }
	    	   }
 		   
 		   }
 		   
 	   }
 	        writeObject();  ///************
	   	if(flag>0)
	   	{
	   		return true;
	   	}
	   	else
	   	{
	   		return false;
	   	}

  	}

public void writeObject() throws IOException
{

		  FileOutputStream fos=new FileOutputStream("F:\\AdvJava\\Data.txt",false);
		   ObjectOutputStream oos1=new ObjectOutputStream(fos);
		   oos1.writeObject(EmpAl);  
		   oos1.close();
	
}

}
	