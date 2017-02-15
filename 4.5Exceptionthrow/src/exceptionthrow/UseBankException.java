package exceptionthrow;

import java.util.Scanner;

public class UseBankException {
	public void withDraw(int val)throws BankException
	{
		int amount=1000;
		if((amount-val)<500)
		{
			throw new BankException();
			
		}
		else
		{
			System.out.println("Successfully Transaction");
		
		}
	}
	public static void main(String arg[])
	{
		UseBankException obj=new UseBankException();
		int amt;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount to Withdraw");
		amt=scan.nextInt();
		try
		{
			obj.withDraw(amt);
		}
		catch(BankException e)
		{
			System.out.println(e);
		}
	}}
		
