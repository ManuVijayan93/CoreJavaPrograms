
public class StaticMethod {
	int num1;
	static int num2;
	public StaticMethod()
	{
		num1=8;
		num2=77;
	}

	public static void display()
	{
		System.out.println("Static Variable:"+num2);
	}
	public static void main(String arg[])
	{
		StaticMethod ob1=new StaticMethod();
		StaticMethod.display();
	}
}
