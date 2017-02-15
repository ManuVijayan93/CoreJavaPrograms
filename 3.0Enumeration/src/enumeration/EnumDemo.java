package enumeration;

public class EnumDemo 
{
	
public enum MyColour{RED,BLUE,GREEN,YELLOW}
public static void main(String arg[])
{
	System.out.println(MyColour.RED);
    MyColour s=MyColour.BLUE;
	System.out.println(s);
	System.out.println("Member of Ordinal Values:"+s.ordinal());
	for(MyColour ob:MyColour.values())
	{
		System.out.println("Enumeration Member:" +ob +" "+"Orderinal Value::"+ob.ordinal());
		
	}
}

}
