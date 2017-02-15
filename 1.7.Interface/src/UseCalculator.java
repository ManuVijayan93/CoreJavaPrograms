
interface Addition
{
	int add(int num1,int num2);
}
interface Multiplication
{
	int mul(int num1,int num2);
}
interface Calculator extends Addition,Multiplication
{
	void display();
}
public class UseCalculator implements Calculator
{
	public int add(int num1,int num2)
	{
	return num1+num2;
	}
	public int mul(int num1,int num2)
	{
	return num1*num2;
	}
	public void display()
	{
	System.out.println("Addition Method:"+add(10,20));
	System.out.println("Multiplication Method:"+mul(10,20));
	}
	public static void main(String arg[])
	{
	UseCalculator obj=new UseCalculator();
	obj.display();
	}
}