package exception;

import java.util.Scanner;

public class Handled {
public static void main(String args[])
{
	int num1,num2,result,ar[]={2,3,0};
	Scanner scan=new Scanner(System.in);
			try{
		System.out.println("Enter the first number");
		num1=scan.nextInt();
		System.out.println("Enter the second number");
		num2=scan.nextInt();
		result=num1/num2;
		System.out.println("Result:"+result);
	}
	catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception arised:"+e);
		
	}
		finally{
			System.out.println("After the code");
		}
			//System.out.println("After the code");	
	
}
}
