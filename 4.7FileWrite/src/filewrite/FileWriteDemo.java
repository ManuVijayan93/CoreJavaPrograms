package filewrite;
import java.io.*;
public class FileWriteDemo {

	public static void main(String arg[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("I:\\Github.txt");
			String str="My file content is a secret";
			for(int i=0;i<str.length();i++)
			{
				fos.write(str.charAt(i));
				
			}
			System.out.println("The Content is written to File");
			fos.close();
			
		}
	catch(Exception e)
		{
		System.out.println("Exception Arised"+e);
	}
	

}
}




	