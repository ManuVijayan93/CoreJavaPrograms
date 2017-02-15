package filereading;
import java.io.*;

public class FileReadDemo {
	public static void main(String arg[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("I:\\Github.txt");
			int avl=fis.available();
			System.out.println("No of Bytes:"+avl);
			byte buff[]=new byte[avl];
			fis.read(buff,0,avl);
			String str=new String(buff);
			System.out.println("The Content of File:"+str);
			fis.close();
			
		}
	catch(Exception e)
		{
		System.out.println(e);
	}
	

}
}
