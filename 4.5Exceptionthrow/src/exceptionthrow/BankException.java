package exceptionthrow;
import java.util.Scanner;
public class BankException  extends Exception
{
	public BankException()
	{
		super("Balance is not sufficient");
		
	}
	public String toString()
	{
		return "Balance is not Sufficient";
	}

}
