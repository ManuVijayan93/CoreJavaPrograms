
public class Employee {
	String eid,ename;
	int eno;
	public Employee()
	{
		eid="E11";
		ename="Raj";
		eno=888;
		
	}
	public String toString()
	{
		return "Employee ID"+eid+" "+"Employee Name"+ename+" "+"Employee no:"+eno;
	}
	public static void main(String arg[])
	{
		Employee ob=new Employee();
		System.out.println(ob);
	}
}


