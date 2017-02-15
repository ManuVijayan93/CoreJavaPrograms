package serialisation;

import java.io.*;


public class EmployeeRead {
	public static void main(String[] args)
	{
		try{
			FileInputStream fis=new FileInputStream("c:\\ss\\Employee.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee emp=(Employee)ois.readObject();
            System.out.println(emp);
            fis.close();
		}
catch(Exception e)
		{
	System.out.println("Exception Arised"+e);
	
		}
	}
}