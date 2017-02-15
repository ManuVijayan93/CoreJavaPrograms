package serialisation;
import java.io.*;
public class EmployeeWriteDemo {
	public static void main(String[] args)
	{
		try{
			FileOutputStream fos=new FileOutputStream("c:\\ss\\Employee.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Employee obj=new Employee();
			obj.setEmpid("E1001");
			obj.setEmpname("Vinod");
			obj.setSalary(5000);
			oos.writeObject(obj);
			System.out.println("Object Successfully Written");
			fos.close();
		}
	catch(Exception e)
		{
		e.printStackTrace();
		
		}
}
}
