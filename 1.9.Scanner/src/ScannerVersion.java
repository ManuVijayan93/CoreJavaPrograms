
import java.util.*;
public class ScannerVersion 
{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String sname=scan.next();
		
		System.out.println("Enter the Age");
		int age=scan.nextInt();
		
		System.out.println("Student Name:"+sname+" Age:"+age);
	}

}