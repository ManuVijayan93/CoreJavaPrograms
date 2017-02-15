
import java.util.*;
 class Map 
{
	public static void main(String arg[])
	{
		HashMap m=new HashMap();
		m.put("100","Surya");
		m.put("101","Hari");
		m.put("102","Rahul");
		m.put("103","Christo");
		
		Set s=m.keySet();
		for(Object o:s)
		{
			String  str=(String)o;
			System.out.println(str);
			String value=(String)m.get(o);
			System.out.println(value);
		}
		}
	}

