package electronic;
import java.util.*;
public class DeviceSelection extends ElectronicDevice {
	public static void main(String arg[])
	{ 
		int  a=0;
		Scanner scan=new Scanner(System.in);
		

		ElectronicDevice e1=new ElectronicDevice();
		
		e1.dname1="Laptop";
		e1.dname2="Mobile";
		//e2.n1='1'
	do
	{
		System.out.println("Enter the device you want to use:1:Laptop,2:Mobile");
		String snum=scan.next();
		
	
	
		switch(snum)
		{
			case "1":System.out.println("The Laptop is started");
			break;
			case "2":System.out.println("The Mobile is started");
			break;
			default:
				
				System.out.println("Invalid");
			
		
		}
		
		System.out.println("Do you want to continue 1 : end : 0");	
		 a=scan.nextInt();
		
}while(a!=0);
	}
}
